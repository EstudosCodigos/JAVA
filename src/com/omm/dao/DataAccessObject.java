package com.omm.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DataAccessObject {

	private static EntityManagerFactory entityManagerFactory = null;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence
					.createEntityManagerFactory("MySql_to_MongoDB");
		}
		return entityManagerFactory;
	}
}
