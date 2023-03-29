package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import app.core.entities.Customer;
import app.core.exception.CouponSystemException;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	boolean existsByEmailAndPassword(String email, String password) throws CouponSystemException;

	boolean existsByEmail(String email) throws CouponSystemException;

	Customer findByEmailAndPassword(String email, String password) throws CouponSystemException;

	@Query(value = "SELECT CASE WHEN (select exists(select * from `coupons_vs_customers` where customer_id= ? and coupon_id = ?)) = 1 THEN 'True' else 'False' END;", nativeQuery = true)
	boolean existsCouponPurchase(int customerId, int couponId) throws CouponSystemException;

}
