package com.example.dto;

public class ResponseDTO {

	private String mssg;
	private Object data;
	
	
	public ResponseDTO(String mssg, Object data) {
		
		this.mssg = mssg;
		this.data = data;
	}


	public String getMssg() {
		return mssg;
	}


	public Object getData() {
		return data;
	}


	public void setMssg(String mssg) {
		this.mssg = mssg;
	}


	public void setData(Object data) {
		this.data = data;
	}
	
	
}
