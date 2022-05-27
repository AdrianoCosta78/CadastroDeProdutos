package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cadastro.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

			
	@Query("select p from Usuario p where p.email = :email")
	public Usuario findByEmail(String email);
	
//	@Query("select p from Usuario p where p.email = :email and p.senha = :senha")
	public Usuario findByEmailAndSenha(String email, String senha);
}
