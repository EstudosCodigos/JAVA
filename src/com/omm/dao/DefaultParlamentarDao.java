package com.omm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.omm.model.Parlamentar;
import com.omm.model.Parlamentar;
@SuppressWarnings("unchecked")
public class DefaultParlamentarDao extends DataAccessObject implements ParlamentarDao{

	
	private static DefaultParlamentarDao instance = null;
	
	private DefaultParlamentarDao(){
		
	}

	public static DefaultParlamentarDao getInstance(){
		if(instance == null){
			instance = new DefaultParlamentarDao();
		}
		return instance;
	}
	
	@Override
	public List<Parlamentar> findParlamentarById(String id) {
		
		int numberId = Integer.parseInt(id);

		EntityManager manager = getEntityManagerFactory().createEntityManager();
		
		Query query = manager.createQuery("SELECT p FROM Parlamentar p WHERE p.id = :id");
		query.setParameter("id", numberId);
		
		List<Parlamentar> parlamentaresResult = (List<Parlamentar>) query.getResultList();
		
		manager.close();
		
		return parlamentaresResult;
	}

	@Override
	public List<Parlamentar> getAllParlamentares() {
		
		EntityManager manager = getEntityManagerFactory().createEntityManager();
		
		Query query = manager.createQuery("SELECT p FROM Parlamentar p");
		
		List<Parlamentar> parlamentaresResult = (List<Parlamentar>) query.getResultList();
		
		manager.close();
		
		return parlamentaresResult;
	}
	
	@Override
	public List<Parlamentar> getMajorRanking() {
		
		EntityManager manager = getEntityManagerFactory().createEntityManager();
		
		Query query = manager.createQuery("SELECT p FROM Parlamentar p");
		
		List<Parlamentar> parlamentaresResult = (List<Parlamentar>) query.getResultList();
		
		manager.close();
		
		return parlamentaresResult;
	}

	@Override
	public List<Parlamentar> getParlamentarUpdate(String idUpdate) {
		EntityManager manager = getEntityManagerFactory().createEntityManager();
		
		int intIdUpdate = Integer.parseInt(idUpdate);
		
		Query query = manager.createQuery("SELECT p FROM Parlamentar p WHERE p.idUpdate> :idUpdate");
		query.setParameter("idUpdate", intIdUpdate);
		
		List<Parlamentar> parlamentaresResult = ((List<Parlamentar>) query.getResultList());
		
		manager.close();
		
		return parlamentaresResult;
	}

	
}
