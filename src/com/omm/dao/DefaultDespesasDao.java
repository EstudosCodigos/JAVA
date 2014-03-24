package com.omm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.omm.model.Despesas;
import com.omm.model.Parlamentar;

public class DefaultDespesasDao extends DataAccessObject implements DespesasDao{
private static DefaultDespesasDao instance = null;
	


	private  DefaultDespesasDao() {
		
	}
	public static DefaultDespesasDao getInstance(){
		if(instance == null){
			instance = new DefaultDespesasDao();
		}
		return instance;
	}
	
	public List<Despesas> getAllDespesas() {
		
		EntityManager manager = getEntityManagerFactory().createEntityManager();
		
		Query query = manager.createQuery("SELECT p FROM Despesas p");
		
		List<Despesas> despesasResult = (List<Despesas>) query.getResultList();
		
		manager.close();
		
		return despesasResult;
	}
	
	

}
