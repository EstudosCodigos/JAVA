package com.devMedia.sample;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConnection {

	private static final String HOST="localhost";
	private static final int PORT=27017;
	private static final String DB_NAME="OMM";
	
	private static MongoConnection uniqInstance;
	private static int mongoInstance=1;
	
	private MongoClient mongo;
	private DB db;
	
	private MongoConnection()
	{
		
	}
	public static synchronized MongoConnection getInstance()
	{
		if(uniqInstance==null)
		{
			uniqInstance=new MongoConnection();
		}return uniqInstance;
	}
	
	//garante a existencia de um unico objeto mongo
	public DB getDB()
	{
		if(mongo==null)
		{
			try{
				mongo=new MongoClient(HOST,PORT);
				db = mongo.getDB(DB_NAME);
				
			}catch (UnknownHostException e)
			{
				e.printStackTrace();
			}
			
		}
		return db;
	}
}
