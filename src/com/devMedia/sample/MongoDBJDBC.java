package com.devMedia.sample;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MongoDBJDBC {

	public static void main(String args[])
	{
		
		try{
			//to connect to mongodb server 
			//MongoClient mongoClient=new MongoClient("localhost",27017);
			MongoConnection connection = MongoConnection.getInstance();
			DB db=connection.getDB();
			
		//	DB db=mongoClient.getDB("devmedia");
			System.out.println("Connect to database successfully");
			
			//boolean auth = db.authenticate(myUserName, myPassword);
			//System.out.println("Authentication: "+auth);
			
			DBCollection coll=db.getCollection("devmedia");
			System.out.println("Collecton selected successfully");
			
//			BasicDBObject doc=new BasicDBObject("title","MongoDB").
//					append("description", "Xubaquinha").
//					append("likes", 100);
//			
//			BasicDBObject doc =new BasicDBObject();
//			doc.append("description", "Xubas").
//			append("likes", 100);
//			coll.insert(doc);
//			System.out.println("Document inserted successfully");
//			
			DBCursor cursor = coll.find();
			
			while (cursor.hasNext())
			{
				System.out.println(cursor.next());
			}
			
		}catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage());
		}
	}
}
