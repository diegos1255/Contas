package br.com.contas.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.contas.entity.TipoConta;
import br.com.contas.service.TipoContaService;

@Controller
@RequestMapping("conta")
@Transactional
public class ContaController {

	@Autowired
	private TipoContaService tipoContaService;	

	/**
	 * Metodo responsavel por buscar o tipo da conta
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/listaTipoConta", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> listaTipoConta() {
		
		List<TipoConta> listaTipoConta = this.tipoContaService.listaTipoConta();
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		retorno.put("listaTipoConta", listaTipoConta);
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}
	
}
