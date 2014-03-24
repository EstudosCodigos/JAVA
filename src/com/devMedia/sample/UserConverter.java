package com.devMedia.sample;

import com.mongodb.BasicDBList;
import com.mongodb.DBObject;

public class UserConverter {

	public static User converterToUser(DBObject dbo)
	{
		User user=new User();
		
		user.setId((String)dbo.get("_id").toString());
		user.setName((String)dbo.get("name"));
		user.setAge((int)Double.parseDouble(dbo.get("age").toString()));
		user.setInfo(InfoConverter.converterToInfo((DBObject)dbo.get("info")));
		
		BasicDBList dbList = (BasicDBList) dbo.get("preferences");
		if(dbList !=null)
		{
			user.setPreferences(dbList.toArray(new String[dbList.size()]));
		}
		
		return user;
		
	}
}
