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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.auth.UserCredentials;
import app.core.entities.Category;
import app.core.entities.Company;
import app.core.entities.Coupon;
import app.core.exception.CouponSystemException;
import app.core.services.CompanyServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/company/")
public class CompanyController { // extends ClientController {
	@Autowired
	private CompanyServiceImpl companyService;

	@PostMapping(headers = { HttpHeaders.AUTHORIZATION })
	public void addCoupon(@RequestBody Coupon coupon, HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		companyService.addCoupon(coupon, user.getId());
	}

	@PutMapping(headers = { HttpHeaders.AUTHORIZATION })
	public void updateCoupon(@RequestBody Coupon coupon, HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		companyService.updateCoupon(coupon, user.getId());
	}

	@DeleteMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "{couponId}")
	public void deleteCoupon(@PathVariable int couponId, HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		companyService.deleteCoupon(couponId, user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "companyCoupons")
	public List<Coupon> getCompanyCoupons(HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return companyService.getCompanyCoupons(user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "couponsByCategory")
	public List<Coupon> getCompanyCouponsByCategory(@RequestParam Category category, HttpServletRequest request)
			throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return companyService.getCompanyCoupons(category, user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "couponsByMaxPrice")
	public List<Coupon> getCompanyCouponsByMaxPrice(@RequestParam double maxPrice, HttpServletRequest request)
			throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return companyService.getCompanyCoupons(maxPrice, user.getId());
	}

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION }, path = "details")
	public Company getCompanyDetails(HttpServletRequest request) throws CouponSystemException {
		UserCredentials user = (UserCredentials) request.getAttribute("user");
		return companyService.getCompanyDetails(user.getId());
	}
}
