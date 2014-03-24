package com.omm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Parlamentar")
public class Parlamentar {
	
	@Id
	@Column(name="idParlamentar")
	int id;
	
	@Column(name="nomeParlamentar")
	String nome;
	
//	@Column(name="idUpdate")
//	int idUpdate;
	
	@Column(name="partidoParlamentar")
	String partido;
	
	@Column(name="ufParlamentar")
	String uf;
	
//	@Column(name="valor")
//	double valor;
//	
//	@Column(name="ranking")
//	int rankingPos;
//	
//	@Transient
//	byte[] foto;
	
	public Parlamentar() {
		// Empty Constructor
	}

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public String getNomeParlamentar() {
		
		return nome;
	}

	public void setNomeParlamentar(String nomeParlamentar) {
		
		this.nome = nomeParlamentar;
	}

	public String getPartido() {
		
		return partido;
	}

	public void setPartido(String partido) {
		
		this.partido = partido;
	}

	public String getUf() {
		
		return uf;
	}

	public void setUf(String uf) {
		
		this.uf = uf;
	}

//public double getValor() {
//		
//		return valor;
//	}
//
//	public void setValor(double valor) {
//		
//		this.valor = valor;
//	}
//	
//	public int getRankingPos() {
//		return rankingPos;
//	}
//
//	public void setRankingPos(int rankingPos) {
//		this.rankingPos = rankingPos;
//	}
//	
//	public int getIdUpdate() {
//		return idUpdate;
//	}
//
//	public void setIdUpdate(int idUpdate) {
//		this.idUpdate = idUpdate;
//	}
//	
//	public byte[] getFoto() {
//		return foto;
//	}
//
//	public void setFoto(byte[] foto) {
//		this.foto = foto;
//	}
}
