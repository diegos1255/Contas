package br.com.contas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.com.contas.entity.TipoConta;

@Repository
@EnableTransactionManagement
public class TipoContaDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Metodo responsavel por salvar o tipo da conta
	 * @param entity
	 */
	public void persistir(TipoConta entity) {
		this.entityManager.persist(entity);
	}
	
	/**
	 * Metodo responsavel por listar todos os tipos de conta
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<TipoConta> listaTipoConta() {
		
		return (List<TipoConta>) this.entityManager.createNamedQuery("TipoConta.listaTodos").getResultList();
		
	}
	
}
