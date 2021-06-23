package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.AddressBookDTO;

import com.example.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<AddressBookData> getContacts() {
		
		
		List <AddressBookData >addressBookData = new ArrayList<>();
		addressBookData.add(new AddressBookData(5, new AddressBookDTO("Raju", "punjab")));

		return addressBookData;
	}

	@Override
	public AddressBookData getContactById(int id) {
		AddressBookData addressBookData = new AddressBookData(1,new AddressBookDTO("Jammu", "J&k"));
		return addressBookData;
	}

	@Override
	public AddressBookData createContact(AddressBookDTO addressBookDto) {
	AddressBookData addressBookData =	new AddressBookData(1, addressBookDto);
		return addressBookData;
	}

	@Override
	public AddressBookData updateContact(int id, AddressBookDTO addressBookDto) {
		AddressBookData addressBookData = new AddressBookData(id, addressBookDto);
		return addressBookData;
	}

	@Override
	public void deleteContact(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
