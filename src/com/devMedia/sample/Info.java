package com.devMedia.sample;

import java.io.Serializable;

public class Info  implements Serializable{

	private String hometown;
	private String job;
	
	public String toString()
	{
		return "Info{" + "hometown='" + hometown + '\'' + 
				", job='" + job + '\'' + 
				'}';

		
	}
	
	public void setHometown(String hometown)
	{
		this.hometown=hometown;
	}
	public void setJob(String job)
	{
		this.job=job;
	}
	public String getHometown()
	{
		return hometown;
	}
	public String getJob()
	{
		return job;
	}
}
