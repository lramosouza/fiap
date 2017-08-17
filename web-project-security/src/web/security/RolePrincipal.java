package web.security;

import java.security.Principal;

public class RolePrincipal implements Principal {

	private String nome;

	public RolePrincipal(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getName() {
		return this.nome;
	}

}
