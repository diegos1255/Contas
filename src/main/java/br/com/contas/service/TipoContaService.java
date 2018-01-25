package br.com.contas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.contas.dao.TipoContaDAO;
import br.com.contas.entity.TipoConta;

@Service
@Transactional
public class TipoContaService {

	@Autowired
	private TipoContaDAO tipoContaDAO;
	
	/**
	 * Metodo responsavel por salvar os tipos de conta
	 * @param tipoConta
	 */
	public void salvar (TipoConta tipoConta) {
		
		this.tipoContaDAO.persistir(tipoConta);
		
	}
	
	/**
	 * Metodo responsavel por listar todos os tipos de conta
	 * @return
	 */
	public List<TipoConta> listaTipoConta() {
		
		return this.tipoContaDAO.listaTipoConta();
		
	}
	
}