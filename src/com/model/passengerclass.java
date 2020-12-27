package com.model;

public class passengerclass {
	private int ticketid;
	private String name;
	private String gender;
	private String address;
	public passengerclass(int ticketid, String name, String gender, String address) {
		this.ticketid = ticketid;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "passengerclass [ticketid=" + ticketid + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ "]";
	}
	
	

}
