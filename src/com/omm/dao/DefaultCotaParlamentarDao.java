package com.omm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.omm.model.CotaParlamentar;
import com.omm.model.Parlamentar;

@SuppressWarnings("unchecked")
public class DefaultCotaParlamentarDao extends DataAccessObject implements CotaParlamentarDao {

	private static DefaultCotaParlamentarDao instance = null;
	
	private DefaultCotaParlamentarDao(){
		
	}

	public static DefaultCotaParlamentarDao getInstance(){
		if(instance == null){
			instance = new DefaultCotaParlamentarDao();
		}
		return instance;
	}
	
	public List<CotaParlamentar> listCotaParlamentar(String id) {
		
		int numberId = Integer.parseInt(id);
		EntityManager manager = getEntityManagerFactory().createEntityManager();
		
		Query query = manager.createQuery("SELECT c FROM CotaParlamentar c WHERE c.idParlamentar = :id");
		query.setParameter("id", numberId);

		List<CotaParlamentar> cotasResult = (List<CotaParlamentar>) query.getResultList();

		manager.close();
		
		return cotasResult;
	}
	
	@Override
	public List<Parlamentar> getCotaParlamentarUpdate(String[] idParlamentar,
			String idUpdate) {
EntityManager manager = getEntityManagerFactory().createEntityManager();
		
		int intIdUpdate = Integer.parseInt(idUpdate);
		
		String requestQuery = "SELECT c FROM CotaParlamentar c WHERE ";
		
		for(int i=0;i<idParlamentar.length;i++){
			if(i==0){
				requestQuery+="(c.idParlamentar = :idParlamentar"+i; 
			}
			requestQuery+=" OR c.idParlamentar = :idParlamentar"+i;
		}
		requestQuery+=") AND c.idUpdate> :idUpdate";
		
		Query query = manager.createQuery(requestQuery);
		
		for(int i=0;i<idParlamentar.length;i++){
			int intIdParlamentar = Integer.parseInt(idParlamentar[i]);
			query.setParameter("idParlamentar"+i, intIdParlamentar);
		}
		
		query.setParameter("idUpdate", intIdUpdate);
		
		List<Parlamentar> parlamentaresResult = ((List<Parlamentar>) query.getResultList());
		
		manager.close();
		
		return parlamentaresResult;
	}
	
}
