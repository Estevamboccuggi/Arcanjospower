package com.arcanjospower.arcanjos.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.springframework.cglib.core.GeneratorStrategy;

public class Transacao {
	private Double Valor;
	
	private LocalDateTime dataHora;

	@Generated(trategy = GeneratorStrategy)
	public Double getValor() {
		return Valor;
	}
	
	public void setValor(Double valor) {
		Valor = valor;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
}