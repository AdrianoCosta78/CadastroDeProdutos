package com.cadastro.services;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exceptions.CriptoExistException;
import com.cadastro.exceptions.EmailExitsException;
import com.cadastro.model.Usuario;
import com.cadastro.repositories.UsuarioRepository;
import com.cadastro.util.Util;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void salvarUsuario(Usuario user) throws Exception {
	
			
		try {
			if(usuarioRepository.findByEmail(user.getEmail()) != null) {
				throw new EmailExitsException("Você digitou um e-mail ja cadastrado! "+ user.getEmail());
			}
			user.setSenha(Util.md5(user.getSenha()));
			
		} catch (NoSuchAlgorithmException e) {
			throw new CriptoExistException("Erro na criptografia da senha");
		}
		
		( usuarioRepository).save(user);
	}

		
}
