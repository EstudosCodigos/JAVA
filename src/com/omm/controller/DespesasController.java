package com.omm.controller;

import java.util.List;

import com.omm.dao.DefaultDespesasDao;
import com.omm.dao.DefaultParlamentarDao;
import com.omm.dao.DespesasDao;
import com.omm.dao.ParlamentarDao;
import com.omm.model.Despesas;

public class DespesasController {

	private static DespesasController instance=null;
	DespesasDao dao;
	
	private DespesasController()
	{
		dao=DefaultDespesasDao.getInstance();
	}
	
	public static DespesasController getInstance()
	{
		if(instance == null){
			instance = new DespesasController();
		}
		return instance;
	}
	
	public List<Despesas> getAllDespesas()
	{
		return dao.getAllDespesas();
	}
}
