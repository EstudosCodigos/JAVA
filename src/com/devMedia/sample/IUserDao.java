package com.devMedia.sample;

import java.io.Serializable;
import java.util.List;

import com.mongodb.DBObject;

public interface IUserDao<User extends Serializable> {
	
	List<User> findUsers(DBObject keyValue);

}
