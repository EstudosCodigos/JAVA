package com.devMedia.sample;

import java.io.Serializable;
import java.util.Arrays;

public class User implements Serializable {

	private String id;
	private String name;
	private int age;
	private String[] preferences;
	private Info info;
	
	public String toString()
	{
		return "User{" + 
				"id='" + getId() + '\'' + ", name='" + getName() + '\'' 
				+ ", age=" + getAge() + 
				", preferences=" + (getPreferences() == null ? null :
					Arrays.asList(getPreferences()))
					+ ", info=" + getInfo() + '}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int  age) {
		this.age = age;
	}

	public String[] getPreferences() {
		return preferences;
	}

	public void setPreferences(String[] preferences) {
		this.preferences = preferences;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
}
