package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.dto.AddressBookDTO;

import lombok.Data;

 @Entity
 @Table(name = "AddressBook")
  public @Data class AddressBookData {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int addressid;
	private String name, address,gender;
	
	
public AddressBookData() {
		
	}

public AddressBookData( AddressBookDTO addressBookDto) {
	
	
	this.updateAddressBookData(addressBookDto);
	
	
}
public void updateAddressBookData(AddressBookDTO addressBookDto)
{
	this.name = addressBookDto.name;
	this.address = addressBookDto.address;
	this.gender = addressBookDto.gender;
}

	
}
