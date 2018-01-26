package br.com.contas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.com.contas.entity.Conta;

@Repository
@EnableTransactionManagement
public class ContaDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Metodo responsavel por salvara conta
	 * @param entity
	 */
	public void persistir(Conta entity) {
		this.entityManager.persist(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<Conta> listaConta() {
		
		return (List<Conta>) this.entityManager.createNamedQuery("Conta.listaTodos").getResultList();
		
	}
	
}
