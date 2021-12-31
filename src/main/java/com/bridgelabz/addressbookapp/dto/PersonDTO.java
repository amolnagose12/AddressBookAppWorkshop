package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

/*
 * imported lombok library: @Data will auto create getter and setter,constructor,toString 
 * */

public @Data class PersonDTO {

	public String fName;
	public String lName;
	public String gender;
	public long phoneNumber;
	public String email;
	public String address;
	public String city;
	public String state;
	public String country;
	public String profilePic;
	
	

}