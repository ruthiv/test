package app.core.services;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.auth.JwtUtil;
import app.core.auth.UserCredentials;
import app.core.entities.Category;
import app.core.entities.Company;
import app.core.entities.Coupon;
import app.core.exception.CouponSystemException;

@Service
@Transactional
public class CompanyServiceImpl extends ClientService implements CompanyService {

	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public String login(UserCredentials userCredentials) throws CouponSystemException, LoginException {
		if (!companyRepository.existsByEmailAndPassword(userCredentials.getEmail(), userCredentials.getPassword())) {
			throw new LoginException("loging failed - Email or Password is wrong! ");
		}
		Company company = companyRepository.findByEmailAndPassword(userCredentials.getEmail(),
				userCredentials.getPassword());
		userCredentials.setId(company.getId());
		return jwtUtil.generateToken(userCredentials);
	}

	@Override
	public void addCoupon(Coupon coupon, int companyId) throws CouponSystemException {
		if (companyRepository.isCompanyExistsTitle(coupon.getTitle(), companyId)) {
			throw new CouponSystemException("coupon's title is exists - can't add");
		}
		coupon.setCompany(getCompanyDetails(companyId));
		couponRepository.save(coupon);
	}

	@Override
	public void updateCoupon(Coupon coupon, int companyId) throws CouponSystemException {
		Coupon couponUpdate = couponRepository.findById(coupon.getId())
				.orElseThrow(() -> new CouponSystemException("coupon code cannot be updated"));
		if (companyId != couponUpdate.getCompany().getId()) {
			throw new CouponSystemException("company id cannot be updated");
		}
		if (couponRepository.existsByTitleAndCompanyId(coupon.getTitle(), companyId)) {
			throw new CouponSystemException(coupon.getTitle() + " coupon is exist");
		}
		couponUpdate.setCategory(coupon.getCategory());
		couponUpdate.setTitle(coupon.getTitle());
		couponUpdate.setDescription(coupon.getDescription());
		couponUpdate.setStartDate(coupon.getStartDate());
		couponUpdate.setEndDate(coupon.getEndDate());
		couponUpdate.setAmount(coupon.getAmount());
		couponUpdate.setPrice(coupon.getPrice());
		couponUpdate.setImage(coupon.getImage());
		couponRepository.saveAndFlush(couponUpdate);
	}

	@Override
	public void deleteCoupon(int couponId, int companyId) throws CouponSystemException {
		if (!couponRepository.existsById(couponId)) {
			throw new CouponSystemException("the coupon" + couponId + " is not exists");
		}
		couponRepository.deleteById(couponId);
	}

	@Override
	public List<Coupon> getCompanyCoupons(int companyId) throws CouponSystemException {
		List<Coupon> couponFromCompany = couponRepository.findByCompanyId(companyId);
		return couponFromCompany;

	}

	@Override
	public List<Coupon> getCompanyCoupons(Category category, int companyId) throws CouponSystemException {
		List<Coupon> categoryCouponFromCompany = couponRepository.findByCompanyIdAndCategory(companyId, category);
		return categoryCouponFromCompany;

	}

	@Override
	public List<Coupon> getCompanyCoupons(double maxPrice, int companyId) throws CouponSystemException {
		List<Coupon> getCouponFromCompanyMaxPrice = couponRepository.findByCompanyIdAndPriceLessThanEqual(companyId,
				maxPrice);
		return getCouponFromCompanyMaxPrice;

	}

	@Override
	public Company getCompanyDetails(int companyId) throws CouponSystemException {
		return companyRepository.findById(companyId)
				.orElseThrow(() -> new CouponSystemException("company " + companyId + " not found"));
	}

}
