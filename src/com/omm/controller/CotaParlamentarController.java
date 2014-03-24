package com.omm.controller;

import java.util.List;

import com.omm.dao.CotaParlamentarDao;
import com.omm.dao.DefaultCotaParlamentarDao;
import com.omm.model.CotaParlamentar;
import com.omm.model.Parlamentar;

public class CotaParlamentarController {

	private static CotaParlamentarController instance = null;
	CotaParlamentarDao dao;
	
	private CotaParlamentarController() {

		dao = DefaultCotaParlamentarDao.getInstance();
	}
	
	public CotaParlamentarController(DefaultCotaParlamentarDao dao) {
		this.dao = dao;
	}

	public static CotaParlamentarController getInstance(){
		if(instance == null){
			instance = new CotaParlamentarController();
		}
		return instance;
	}

	public List<CotaParlamentar> listCotaParlamentar(String nome) {

		return dao.listCotaParlamentar(nome);
	}

	public List<Parlamentar> getCotaParlamentarUpdate(String[] idParlamentar,
			String idUpdate) {
		
		return dao.getCotaParlamentarUpdate(idParlamentar, idUpdate);
	}
	
}
