package br.com.contas.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table (name = "CONTA")
public class Conta implements Serializable{

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 8453996930401714531L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTA", nullable = false)
	private Long id;
	
	@Column(name = "DESCRICAO", nullable = false)
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_CADASTRO")
	private Date dataCadastro;
	
	@OneToOne
	@JoinColumn(name="tipoConta")
	private TipoConta tipoConta;

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
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the dataCadastro
	 */
	public Date getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	/**
	 * @return the tipoConta
	 */
	public TipoConta getTipoConta() {
		return tipoConta;
	}

	/**
	 * @param tipoConta the tipoConta to set
	 */
	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	
}