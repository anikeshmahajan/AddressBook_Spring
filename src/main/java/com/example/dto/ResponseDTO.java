package com.example.dto;

import lombok.Data;

@Data
public class ResponseDTO {

	private String mssg;
	private Object data;
	
	
	public ResponseDTO(String mssg, Object data) {
		
		this.mssg = mssg;
		this.data = data;
	}


	
}
