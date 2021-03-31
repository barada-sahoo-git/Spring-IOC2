package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;

	public WishMessageGenerator(Date date) {
		super();
		this.date = date;
	}
	
	public String wish (String name) {
		
		int time = date.getHours();
		if (time<12) {
			return "good morning" +name;
		}
		else if (time<16) {
			return "good afternoon" +name;
		}
		if (time<20) {
			return "good evening :: " +name;
		}
		else
			return "good night" +name;
				
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	
	

}
