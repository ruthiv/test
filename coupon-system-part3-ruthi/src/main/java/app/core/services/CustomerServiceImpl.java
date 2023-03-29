package app.core.services;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.auth.JwtUtil;
import app.core.auth.UserCredentials;
import app.core.entities.Coupon;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;

@Service
@Transactional
public class CustomerServiceImpl extends ClientService implements CustomerService {
	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public String login(UserCredentials userCredentials) throws CouponSystemException, LoginException {
		if (!customerRepository.existsByEmailAndPassword(userCredentials.getEmail(), userCredentials.getPassword())) {
			throw new LoginException("loging failed - Email or Password is wrong!");
		}
		Customer customer = customerRepository.findByEmailAndPassword(userCredentials.getEmail(),
				userCredentials.getPassword());
		userCredentials.setId(customer.getId());
		return jwtUtil.generateToken(userCredentials);
	}

	@Override
	public void purchaseCoupon(Coupon coupon, int customerId) throws CouponSystemException {
		if (!couponRepository.isInventoryAndDateCoupon(coupon.getId())) {
			throw new CouponSystemException("A coupon cannot be purchased once more or expired");
		}
		if (customerRepository.existsCouponPurchase(customerId, coupon.getId())) {
			throw new CouponSystemException("A coupon cannot be purchased once more");
		}
		couponRepository.addCouponPurchase(customerId, coupon.getId());
		couponRepository.updateAmountCoupon(coupon.getId());

	}

	@Override
	public List<Coupon> getCoupons() throws CouponSystemException {
		List<Coupon> coupons = couponRepository.findAll();
		return coupons;

	}

	@Override
	public List<Coupon> getCustomerCoupons(int customerId) throws CouponSystemException {
		List<Coupon> coupons = couponRepository.findByCustomer(customerId);
		return coupons;

	}

	@Override
	public List<Coupon> getCustomerCoupons(String category, int customerId) throws CouponSystemException {
		List<Coupon> coupons = couponRepository.findByCustomerIdAndCategory(customerId, category);
		return coupons;
	}

	@Override
	public List<Coupon> getCustomerCoupons(double maxPrice, int customerId) throws CouponSystemException {
		List<Coupon> coupons = couponRepository.findByCustomerIdAndPrice(customerId, maxPrice);
		return coupons;
	}

	@Override
	public Customer getCustomerDetails(int customerId) throws CouponSystemException {
		return customerRepository.findById(customerId).get();

	}

}
