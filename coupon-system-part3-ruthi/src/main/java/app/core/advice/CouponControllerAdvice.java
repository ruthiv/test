package app.core.advice;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import app.core.exception.CouponSystemException;

@RestControllerAdvice
public class CouponControllerAdvice {

	@ExceptionHandler(CouponSystemException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST) // 400
	public ErrDetails handleCatSystemExcptions(CouponSystemException e) {
		return new ErrDetails("Coupon System Exception: ", e.getMessage());
	}

	@ExceptionHandler(LoginException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST) // 400
	public ErrDetails handleCatSystemExcptions(LoginException e) {
		return new ErrDetails("Login System Exception: ", e.getMessage());
	}

	@ExceptionHandler(SQLException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST) // 400
	public ErrDetails handleCatSystemExcptions(SQLException e) {
		return new ErrDetails("SQL Exception: ", e.getMessage());
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST) // 400
	public ErrDetails handleCatSystemExcptions(Exception e) {
		return new ErrDetails("Exception: ", e.getMessage());
	}

}
