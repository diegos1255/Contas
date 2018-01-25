package br.com.contas.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.contas.entity.TipoConta;
import br.com.contas.service.TipoContaService;

@Controller
@RequestMapping("tipoConta")
@Transactional
public class TipoContaController {
	
	@Autowired
	private TipoContaService tipoContaService;	

	/**
	 * Metodo responsavel por salvar o tipo da conta
	 * @param tipoConta
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> salvar(@RequestBody TipoConta tipoConta) {
		
		this.tipoContaService.salvar(tipoConta);
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		
		retorno.put("msg", "Tipo Conta " + tipoConta.getTipoConta() + ", cadastrada com sucesso.");
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}
	
}
