package com.devMedia.sample;

import com.mongodb.DBObject;

public class InfoConverter {

	public static Info converterToInfo(DBObject dbo)
	{
		Info info=new Info();
		info.setHometown((String) dbo.get("hometown"));
		info.setJob((String) dbo.get("job"));
		return info;
		
	}
}
