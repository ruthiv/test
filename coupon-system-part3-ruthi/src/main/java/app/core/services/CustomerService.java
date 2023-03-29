package app.core.services;

import java.util.List;

import app.core.entities.Coupon;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;

public interface CustomerService {

	void purchaseCoupon(Coupon coupon, int customerId) throws CouponSystemException;

	List<Coupon> getCustomerCoupons(int customerId) throws CouponSystemException;

	List<Coupon> getCustomerCoupons(String category, int customerId) throws CouponSystemException;

	List<Coupon> getCustomerCoupons(double maxPrice, int customerId) throws CouponSystemException;

	Customer getCustomerDetails(int customerId) throws CouponSystemException;

	List<Coupon> getCoupons() throws CouponSystemException;

}
