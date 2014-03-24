package com.omm.dao;

import java.util.List;

import com.omm.model.Parlamentar;
import com.omm.model.Parlamentar;

public interface ParlamentarDao {

	public List<Parlamentar> findParlamentarById(String id);

	public List<Parlamentar> getAllParlamentares();
	
	public List<Parlamentar> getMajorRanking();

	public List<Parlamentar> getParlamentarUpdate(String idUpdate);
	
}
