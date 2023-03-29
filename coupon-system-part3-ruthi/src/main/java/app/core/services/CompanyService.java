package app.core.services;

import java.util.List;

import app.core.entities.Category;
import app.core.entities.Company;
import app.core.entities.Coupon;
import app.core.exception.CouponSystemException;

public interface CompanyService {

	void addCoupon(Coupon coupon, int companyId) throws CouponSystemException;

	void updateCoupon(Coupon coupon, int companyId) throws CouponSystemException;

	void deleteCoupon(int couponID, int companyId) throws CouponSystemException;

	List<Coupon> getCompanyCoupons(int companyId) throws CouponSystemException;

	List<Coupon> getCompanyCoupons(Category category, int companyId) throws CouponSystemException;

	List<Coupon> getCompanyCoupons(double maxPrice, int companyId) throws CouponSystemException;

	Company getCompanyDetails(int companyId) throws CouponSystemException;

}
