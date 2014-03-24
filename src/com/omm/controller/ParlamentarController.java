package com.omm.controller;

import java.util.List;

import com.omm.dao.DefaultParlamentarDao;
import com.omm.dao.ParlamentarDao;
import com.omm.model.Parlamentar;
import com.omm.model.Parlamentar;

public class ParlamentarController {

	private static ParlamentarController instance = null;
	ParlamentarDao dao;
	
	private ParlamentarController() {
		
		dao = DefaultParlamentarDao.getInstance();
		
	}
	
	public ParlamentarController(DefaultParlamentarDao dao) {
		this.dao = dao;
	}

	public static ParlamentarController getInstance(){
		if(instance == null){
			instance = new ParlamentarController();
		}
		return instance;
	}
	
	public List<Parlamentar> findParlamentarById(String id) {
		
		return dao.findParlamentarById(id);
	}
	
	public List<Parlamentar> getAllParlamentares() {
		
		return dao.getAllParlamentares();
	}
	
	public List<Parlamentar> getMajorRanking() {
		return dao.getMajorRanking();
	}

	public List<Parlamentar> getParlamentarUpdate(String idUpdate) {
		return dao.getParlamentarUpdate(idUpdate);
	}
	
}
