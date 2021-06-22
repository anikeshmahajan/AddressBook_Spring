package com.example.model;

import com.example.dto.AddressBookDTO;

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

	public int getId() {
		return addressid;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	public void setId(int id) {
		this.addressid= id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
