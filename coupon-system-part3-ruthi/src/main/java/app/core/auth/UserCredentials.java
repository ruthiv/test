package app.core.auth;

import javax.persistence.Id;

import app.core.login.ClientType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCredentials {
	@Id
	private int id;
	private String email;
	private String password;
	private ClientType clientType;
}
