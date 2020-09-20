package com.arcanjospower.arcanjos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arcanjospower.arcanjos.model.Transacao;
import com.arcanjospower.arcanjos.service.TransacaoService;


@RestController
@RequestMapping("/transacao")
@CrossOrigin("*")
public class TransacaoController {
		
		@Autowired
		public TransacaoService TransacaoService;
		
		@GetMapping
		public ResponseEntity<List<Transacao>> getAll() {
				return ResponseEntity.status(HttpStatus.OK).body(TransacaoService.listar());
		}
		@PostMapping
		Transacao
				TransacaoService.adicionar(Transacao);
				return ResposeEntuty.Status(httpStatus.CREATED).body(null);
        }
		@DeleteMapping
		public void limpar() {
				TransacaoService1.apagar();
		}

}