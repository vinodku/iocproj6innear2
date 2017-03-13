package com.nt.beans;

public class aadharcard {
	private int aadharno;
	private String village;
	
	//setter injection

	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	//tostring method
	@Override
	public String toString() {
		return "aadharcard [aadharno=" + aadharno + ", village=" + village + "]";
	}
	
	
	

}
