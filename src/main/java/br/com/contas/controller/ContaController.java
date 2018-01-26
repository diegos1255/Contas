package br.com.contas.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.contas.entity.Conta;
import br.com.contas.entity.TipoConta;
import br.com.contas.service.ContaService;
import br.com.contas.service.TipoContaService;

@Controller
@RequestMapping("conta")
@Transactional
public class ContaController {

	@Autowired
	private ContaService contaService;
	
	@Autowired
	private TipoContaService tipoContaService;	
	
	/**
	 * Metodo responsavel por salvar a conta
	 * @param conta
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> salvar(@RequestBody Conta conta) {
		
		conta.setDataCadastro(new Date());
		conta.setTipoConta(new TipoConta());
		conta.getTipoConta().setId(conta.getIdConta());
		
		this.contaService.salvarConta(conta);
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}
	
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

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/listaConta", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> listaConta() {
		
		List<Conta> listaConta = this.contaService.listaConta();
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		retorno.put("listaConta", listaConta);
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}
	
}
