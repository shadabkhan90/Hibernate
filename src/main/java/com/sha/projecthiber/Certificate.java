package com.sha.projecthiber;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String certiname;
	private double duration;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String name, double duration) {
		super();
		this.certiname = name;
		this.duration = duration;
	}
	public String getName() {
		return certiname;
	}
	public void setName(String name) {
		this.certiname = name;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	

}
