package com.bridgelabz.addressbookapp.model;

import lombok.Data;

/*
 * imported lombok library: @Data will auto create getter and setter,constructor,toString 
 * */

public @Data class Person {


	private long personId;
	private String fName;
	private String lName;
	private String gender;
	private long phoneNumber;
	private String email;
	private String address;
	private String city;
	private String state;
	private String country;
	private String profilePic;
}