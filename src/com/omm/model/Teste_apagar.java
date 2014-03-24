package com.omm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teste_apagar")
public class Teste_apagar {

	@Id
	@Column(name="cod_teste")
	private int id;
	@Column(name="colun_1")
	private String colun_1;
	
	public Teste_apagar(){};
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setColun_1(String colun_1)
	{
		this.colun_1=colun_1;
	}
	public int getId()
	{
		return this.id;
	}
	public String getColun_1()
	{
		return this.colun_1;
	}
}
