package com.example.service;

import java.util.List;

import com.example.dto.AddressBookDTO;
import com.example.model.AddressBookData;

public interface IAddressBookService {
	
	List<AddressBookData> getContacts();
	
	AddressBookData getContactById(int id);
	
	AddressBookData updateContact(int id, AddressBookDTO addressBookDto);

	AddressBookData createContact(AddressBookDTO addressBookDto);
	
	void deleteContact(int id);

	List<AddressBookData> searchContactByName(String name);

}
