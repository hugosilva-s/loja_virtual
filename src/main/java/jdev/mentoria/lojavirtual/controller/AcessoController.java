package jdev.mentoria.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jdev.mentoria.lojavirtual.model.Acesso;
import jdev.mentoria.lojavirtual.service.AcessoService;

@Controller
@RestController
public class AcessoController {

	@Autowired
	private AcessoService acessoService;
	
	@ResponseBody /*Poder dar um retorno da API */
	@PostMapping(value = "/salvarAcesso") /*Mapeando a url para receber JSON*/
	public ResponseEntity<Acesso> salvarAcesso(@RequestBody Acesso acesso) { /*Recebe o JSON e Converte para Objeto*/
		
		Acesso acessoSalvo = acessoService.save(acesso);
		
		return new ResponseEntity<Acesso>(acessoSalvo, HttpStatus.OK);
	}
	
}

