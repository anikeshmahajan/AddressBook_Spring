package com.example.model;

import com.example.dto.AddressBookDTO;

import lombok.Data;

@Data
  public class AddressBookData {

	private int addressid;
	private String name, address;
	
	
public AddressBookData() {
		
	}

public AddressBookData(int id, AddressBookDTO addressBookDto) {
	
	this.addressid = id;
	
	this.name = addressBookDto.name;
	this.address = addressBookDto.address;
}

	
}
