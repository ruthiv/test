package app.core.controllers;

import javax.security.auth.login.LoginException;

import app.core.auth.UserCredentials;
import app.core.exception.CouponSystemException;

public abstract class ClientController {

	public abstract boolean login(UserCredentials userCredentials) throws CouponSystemException, LoginException;
}