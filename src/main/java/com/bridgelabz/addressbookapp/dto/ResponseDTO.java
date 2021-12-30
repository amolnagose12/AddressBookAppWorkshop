package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

/*
 * imported lombok library: @Data :will auto create getter and setter,constructor,toString 
 * */


public @Data class ResponseDTO {

	private String message;
	private Object data;
}