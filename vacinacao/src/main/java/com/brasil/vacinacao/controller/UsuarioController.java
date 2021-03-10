package com.brasil.vacinacao.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.brasil.vacinacao.model.Usuario;
import com.brasil.vacinacao.repository.UsuarioRepository;
import com.brasil.vacinacao.service.UsuarioService;

@RestController
@RequestMapping
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/usuarios")
	public List<Usuario> usuariosCadastrados() {
		return usuarioRepository.findAll();
	}

	@PostMapping("/cadastro/usuario")
	public ResponseEntity<Usuario> novoCadastro(@RequestBody @Valid Usuario usuario) {
		try {
			usuarioService.salvarUsuario(usuario);
			return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
		} catch (Exception exception) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}
	}

}
