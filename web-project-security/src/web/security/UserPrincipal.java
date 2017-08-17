package web.security;

import java.security.Principal;

public class UserPrincipal implements Principal {

	private String username;
	
	public UserPrincipal(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getName() {
		return this.username;
	}

}
