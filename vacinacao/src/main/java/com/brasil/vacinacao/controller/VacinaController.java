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
import com.brasil.vacinacao.model.Vacina;
import com.brasil.vacinacao.repository.VacinaRepository;
import com.brasil.vacinacao.service.VacinaService;

@RestController
@RequestMapping
public class VacinaController {

	@Autowired
	VacinaRepository vacinaRepository;

	@Autowired
	VacinaService vacinaService;

	@GetMapping("/vacinacao")
	public List<Vacina> vacinacaoCadastrados() {
		return vacinaRepository.findAll();
	}

	@PostMapping("/cadastro/vacina")
	public ResponseEntity<Vacina> cadastrar(@RequestBody @Valid Vacina vacina) {
		try {
			vacinaService.salvarVacina(vacina);
			return new ResponseEntity<Vacina>(vacina, HttpStatus.CREATED);
		} catch (Exception exception) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

	}

}
