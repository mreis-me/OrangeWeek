package com.brasil.vacinacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Vacina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String nomeVacina;
	
	@NotBlank
	private String emailUsuario;
	
	@NotBlank
	@DateTimeFormat
	private String dataVacinacao;
	
	

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(String dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

	public Long getId() {
		return id;
	}
	
	
}
