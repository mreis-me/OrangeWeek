package com.brasil.vacinacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import com.brasil.vacinacao.model.Usuario;
import com.brasil.vacinacao.repository.UsuarioRepository;
import javax.transaction.Transactional;

@Service @Transactional
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}