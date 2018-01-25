package br.com.contas.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TIPO_CONTA")
public class TipoConta implements Serializable{

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1976119753279239416L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_CONTA", nullable = false)
	private Long id;
	
	@Column (name = "TIPO_CONTA")
	private String tipoConta;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the tipoConta
	 */
	public String getTipoConta() {
		return tipoConta;
	}

	/**
	 * @param tipoConta the tipoConta to set
	 */
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
}