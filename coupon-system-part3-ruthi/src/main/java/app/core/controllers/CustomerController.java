package app.core.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.auth.UserCredentials;
import app.core.entities.Category;
import app.core.entities.Coupon;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;
import app.core.services.CustomerServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/customer/")
public class CustomerController {// extends ClientController {
	@Autowired
	private CustomerServiceImpl customerService;

	@PostMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "coupon")
	public void purchaseCoupon(@RequestBody Coupon coupon, HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		customerService.purchaseCoupon(coupon, user.getId());
	}

	@GetMapping()
	public List<Coupon> getCoupons() throws CouponSystemException {
		return customerService.getCoupons();
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "coupons")
	public List<Coupon> getCustomerCoupons(HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return customerService.getCustomerCoupons(user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "couponsByCategory")
	public List<Coupon> getCustomerCouponsCategory(@RequestParam Category category, HttpServletRequest request)
			throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return customerService.getCustomerCoupons(category.name(), user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "couponsByMaxPrice")
	public List<Coupon> getCustomerCouponsMaxPrice(@RequestParam double maxPrice, HttpServletRequest request)
			throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return customerService.getCustomerCoupons(maxPrice, user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "details")
	public Customer getCustomerDetails(HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return customerService.getCustomerDetails(user.getId());
	}

}
