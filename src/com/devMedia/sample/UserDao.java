package com.devMedia.sample;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class UserDao implements IUserDao<User> {

	//Objeto de acesso aos metodos do driver mongodb
	private DBCollection db;
	
	//objeto list para armazenar os resultados 
	private List<User> users;
	
	//construtor que inicializa o objeto db com uma instacia da classe
	//de conexao
	
	public UserDao()
	{
		this.db=MongoConnection.getInstance().getDB().getCollection("devmedia");
		
	}
	@Override
	public List<User> findUsers(DBObject keyValue) {
		users = new ArrayList<User>();
		
		DBCursor cursor=db.find(keyValue);
		
		while (cursor.hasNext())
		{
			users.add(UserConverter.converterToUser(cursor.next()));
		}
		return users;
	}

	
}
