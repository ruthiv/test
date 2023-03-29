package app.core.controllers;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.auth.UserCredentials;
import app.core.exception.CouponSystemException;
import app.core.login.LoginManager;

@CrossOrigin("*")
@RestController
@RequestMapping("/auth/")
public class AuthController {

	@Autowired
	LoginManager loginManager;

	@PostMapping("login")
	public String login(@RequestBody UserCredentials userCredentials) throws CouponSystemException, LoginException {
		try {
			return this.loginManager.login(userCredentials);
		} catch (LoginException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}
}
//		return this.loginManager.login(userCredentials);
//	}
