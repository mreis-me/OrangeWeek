package com.brasil.vacinacao.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import com.brasil.vacinacao.model.Vacina;
import com.brasil.vacinacao.repository.VacinaRepository;

@Service @Transactional
public class VacinaService {
	
	@Autowired
	private VacinaRepository vacinaRepository;
	
	@PostMapping
	public Vacina salvarVacina(Vacina vacina) {
		return vacinaRepository.save(vacina);
	}

}