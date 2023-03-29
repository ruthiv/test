package app.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Coupon;
import app.core.exception.CouponSystemException;
import app.core.repositories.CouponRepository;

@Service
@Transactional
public class AllCouponsService {
	@Autowired
	protected CouponRepository couponRepository;

	public List<Coupon> getAllCoupons() throws CouponSystemException {
		List<Coupon> coupons = couponRepository.findAll();
		return coupons;

	}

}