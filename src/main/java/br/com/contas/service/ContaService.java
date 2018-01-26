package br.com.contas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.contas.dao.ContaDAO;
import br.com.contas.entity.Conta;

@Service
@Transactional
public class ContaService {

	@Autowired
	private ContaDAO contaDAO;
	
	/**
	 * Metodo responsavel por salvar a conta
	 * @param conta
	 */
	public void salvarConta(Conta conta) {
		
		this.contaDAO.persistir(conta);
		
	}
	
	/**
	 * Metodo responsavel por listar as contas cadastradas
	 * @return
	 */
	public List<Conta> listaConta() {
	
		return this.contaDAO.listaConta();
		
	}
	
}
