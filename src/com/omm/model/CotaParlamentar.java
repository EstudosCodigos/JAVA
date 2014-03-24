package com.omm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cota")
public class CotaParlamentar {
	@Id
	@Column(name = "idCota")
	int cod;

	@Column(name = "idParlamentar")
	int idParlamentar;
	
	@Column(name="idUpdate")
	int idUpdate;

	@Column(name = "mes")
	int mes;

	@Column(name = "ano")
	int ano;

	@Column(name = "numSubcota")
	int numeroSubCota;

	@Column(name = "descricao")
	String descricao;

	@Column(name = "valor")
	double valor;

	public CotaParlamentar() {
	}

	public int getIdParlamentar() {
		return idParlamentar;
	}

	public void setIdParlamentar(int idParlamentar) {
		this.idParlamentar = idParlamentar;
	}
	
	public int getIdUpdate() {
		return idUpdate;
	}

	public void setIdUpdate(int idUpdate) {
		this.idUpdate = idUpdate;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumeroSubCota() {
		return numeroSubCota;
	}

	public void setNumeroSubCota(int numeroSubCota) {
		this.numeroSubCota = numeroSubCota;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
