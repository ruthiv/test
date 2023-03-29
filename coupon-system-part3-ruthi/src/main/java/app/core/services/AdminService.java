package app.core.services;

import java.util.List;

import app.core.entities.Company;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;

public interface AdminService {

	void addCompany(Company company, int adminId) throws CouponSystemException;

	void updateCompany(Company company, int adminId) throws CouponSystemException;

	void deleteCompany(int companyID, int adminId) throws CouponSystemException;

	List<Company> getAllCompanies(int adminId) throws CouponSystemException;

	Company getOneCompany(int companyId, int adminId) throws CouponSystemException;

	void addCustomer(Customer customer, int adminId) throws CouponSystemException;

	void updateCustomer(Customer customer, int adminId) throws CouponSystemException;

	void deleteCustomer(int customerID, int adminId) throws CouponSystemException;

	List<Customer> getAllCustomers(int adminId) throws CouponSystemException;

	Customer getOneCustomer(int customerId, int adminId) throws CouponSystemException;

}
