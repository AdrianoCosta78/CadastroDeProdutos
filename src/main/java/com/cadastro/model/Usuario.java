package com.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Email
//	@NotBlank(message = "O e-mail não pode ser vazio.")
	private String email;
	
	@Size(min = 3, max = 20)
//	@NotBlank(message = "O nome não pode ser vazio.")
	private String user;
	
//	@NotBlank(message = "A senha não pode ser vazia.")
	private String senha;
	
	
	public Usuario() {
				
	}
	public Usuario(Long id, String email, String user, String senha) {
		super();
		this.id = id;
		this.email = email;
		this.user = user;
		this.senha = senha;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
