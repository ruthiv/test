package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import app.core.entities.Category;
import app.core.entities.Coupon;
import app.core.exception.CouponSystemException;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {

	List<Coupon> findByCompanyId(int companyId) throws CouponSystemException;

	List<Coupon> findByCompanyIdAndCategory(int companyId, Category category) throws CouponSystemException;

	List<Coupon> findByCompanyIdAndPriceLessThanEqual(int companyId, double price) throws CouponSystemException;

	boolean existsByTitleAndCompanyIdAndIdNot(String title, int companyId, int id) throws CouponSystemException;

	@Query(value = "SELECT CASE WHEN (select exists(select * from `coupons` where end_date > now() and amount > 0 and id = ?)) = 1 THEN 'True' else 'False' END", nativeQuery = true)
	boolean isInventoryAndDateCoupon(int couponId) throws CouponSystemException;

	@Modifying
	@Query(value = "insert into `coupons_vs_customers` values(?, ?)", nativeQuery = true)
	void addCouponPurchase(int customerId, int couponId);

	@Modifying
	@Query(value = "delete from `coupons` where end_date < now()", nativeQuery = true)
	void deleteExpiredCoupons() throws CouponSystemException;

	@Modifying
	@Query(value = "delete from `coupons_vs_customers` where coupon_id in (select id from `coupons` where end_date < now())", nativeQuery = true)
	void deleteExpiredPurchasedCoupons() throws CouponSystemException;

	@Modifying
	@Query(value = "update `coupons` set amount = amount-1  where id = ?", nativeQuery = true)
	void updateAmountCoupon(int couponId);

	@Query(value = "select * from `coupons` join `coupons_vs_customers` on coupons.id = coupons_vs_customers.coupon_id where customer_id = ?", nativeQuery = true)
	List<Coupon> findByCustomer(int companyId) throws CouponSystemException;

	@Query(value = "select * from `coupons` join `coupons_vs_customers` on coupons.id = coupons_vs_customers.coupon_id where customer_id = ? and  price <= ?", nativeQuery = true)
	List<Coupon> findByCustomerIdAndPrice(int companyId, double price) throws CouponSystemException;

	@Query(value = "select * from `coupons` join `coupons_vs_customers` on coupons.id = coupons_vs_customers.coupon_id where customer_id = ? and  category = ? ", nativeQuery = true)
	List<Coupon> findByCustomerIdAndCategory(int companyId, String category) throws CouponSystemException;

}
