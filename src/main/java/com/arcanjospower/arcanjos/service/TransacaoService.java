package com.arcanjospower.arcanjos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.arcanjospower.arcanjos.model.*;


@Service
public class TransacaoService {

	private List<Transacao> transacoes;

	public void criarListaTransacoes() {
		if(transacoes == null) {
			transacoes = new ArrayList<Transacao>();
		}
	}
	
	public void adicionar(Transacao transacao) {
			criarListaTransacoes();
			transacoes.add(transacao);
	}
	
	public List<Transacao> listar() {
			criarListaTransacoes();
			return transacoes;
	}
	
	public void apagar() {
			transacoes = null;
	}

}
