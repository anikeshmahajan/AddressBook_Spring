package com.example.dto;

import lombok.Data;

@Data
public class AddressBookDTO {

	public String name,address;

	
	public AddressBookDTO(String name, String address) {

		this.name = name;
		this.address = address;
	}

	public AddressBookDTO() {
		
	}
		
	
}
