package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import app.core.entities.Company;
import app.core.exception.CouponSystemException;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
	boolean existsByEmailAndPassword(String email, String password) throws CouponSystemException;

	boolean existsByNameAndEmail(String name, String email) throws CouponSystemException;

	boolean existsByNameOrEmail(String name, String email) throws CouponSystemException;

	boolean existsByEmail(String email) throws CouponSystemException;

	@Query(value = "SELECT CASE WHEN (select exists(select * from coupons where title = ? and company_id = ? )) = 1 THEN 'True' else 'False' END ", nativeQuery = true)
	boolean isCompanyExistsTitle(String title, int companyId) throws CouponSystemException;

	Company findByEmailAndPassword(String email, String password) throws CouponSystemException;

}
