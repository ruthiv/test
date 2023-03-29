package app.core.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.auth.UserCredentials;
import app.core.entities.Company;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;
import app.core.services.AdminServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/admin/")
public class AdminController {

	@Autowired
	private AdminServiceImpl adminService;

	@PostMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "company")
	public void addCompany(@RequestBody Company company, HttpServletRequest request) throws CouponSystemException {
//		System.out.println("request:  " + request);
//		System.out.println("user: " + (UserCredentials) request.getAttribute("user"));
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		adminService.addCompany(company, user.getId());
	}

	@PutMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "company")
	public void updateCompany(@RequestBody Company company, HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		adminService.updateCompany(company, user.getId());
	}

	@DeleteMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "company/{companyId}")
	public void deleteCompany(@PathVariable int companyId, HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		adminService.deleteCompany(companyId, user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "companies")
	public List<Company> getAllCompanies(HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return adminService.getAllCompanies(user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "company/{companyId}")
	public Company getOneCompany(@PathVariable int companyId, HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return adminService.getOneCompany(companyId, user.getId());
	}

	@PostMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "customer")
	public void addCustomer(@RequestBody Customer customer, HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		adminService.addCustomer(customer, user.getId());
	}

	@PutMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "customer")
	public void updateCustomer(@RequestBody Customer customer, HttpServletRequest request)
			throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		adminService.updateCustomer(customer, user.getId());
	}

	@DeleteMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "customer/{customerId}")
	public void deleteCustomer(@PathVariable int customerId, HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		adminService.deleteCustomer(customerId, user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "customers")
	public List<Customer> getAllCustomers(HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return adminService.getAllCustomers(user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "customer/{customerId}")
	public Customer getOneCustomer(@PathVariable int customerId, HttpServletRequest request)
			throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return adminService.getOneCustomer(customerId, user.getId());
	}

}
