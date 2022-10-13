package com.api.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "idFilme")
			
@Entity
@Table(name="filme")
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_filme")
	private Integer idFilme;
	
	@Column(name="nome_br")
	private String nomeBr;
	
	@Column(name="nome_en")
	private String nomeEn;
	
	@Column(name="anoLancamento")
	private String anoLancamento;
	
	@Column(name="sinopse")
	private String sinopse;
	
	@ManyToOne
	@JoinColumn(name="Id_diretor",referencedColumnName ="Id_diretor")
	private Diretor diretor;
	
	@ManyToOne
	@JoinColumn(name="Id_genero",referencedColumnName ="Id_genero")
	private Genero genero;
	
	
	
	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}

	public String getNomeBr() {
		return nomeBr;
	}

	public void setNomeBr(String nomeBr) {
		this.nomeBr = nomeBr;
	}

	public String getNomeEn() {
		return nomeEn;
	}

	public void setNomeEn(String nomeEn) {
		this.nomeEn = nomeEn;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	

}
