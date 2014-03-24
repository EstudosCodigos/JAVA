package com.omm.dao;

import java.util.List;

import com.omm.model.CotaParlamentar;
import com.omm.model.Parlamentar;

public interface CotaParlamentarDao {

	public List<CotaParlamentar> listCotaParlamentar(String nome);

	List<Parlamentar> getCotaParlamentarUpdate(String[] idParlamentar,
			String idUpdate);
}
