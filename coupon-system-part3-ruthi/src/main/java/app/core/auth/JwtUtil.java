package app.core.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import app.core.login.ClientType;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;

@Component
public class JwtUtil extends JwtUtilAbstract<UserCredentials, Integer> {

	@Override
	public String generateToken(UserCredentials user) {
		Map<String, Object> claims = new HashMap<>();
		claims.put("id", user.getId());
		claims.put("email", user.getEmail());
		claims.put("clientType", user.getClientType());
//		user.setPassword(null);
//		claims.put("use", user);
		String token = this.createToken(claims, user.getId());
		return token;
	}

	@Override
	public UserCredentials extractUser(String token) throws JwtException {
		Claims claims = this.extractAllClaims(token);
		int id = Integer.parseInt(claims.getSubject());
		String email = claims.get("email", String.class);
		ClientType clientType = ClientType.valueOf(claims.get("clientType", String.class));
		UserCredentials user = new UserCredentials(id, email, null, clientType);
//		UserCredentials user = new UserCredentials();
		return user;
	}

}
