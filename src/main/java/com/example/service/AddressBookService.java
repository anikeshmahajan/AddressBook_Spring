package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dto.AddressBookDTO;
import com.example.exceptions.AddressBookException;
import com.example.model.AddressBookData;
import com.example.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

	@Autowired
	private AddressBookRepository addressBookData;

	@Override
	public List<AddressBookData> getContacts() {
		
		return addressBookData.findAll();
	}

	@Override
	public AddressBookData getContactById(int id) {
		
		return addressBookData
				.findById(id)
				.orElseThrow(() ->new AddressBookException("No Contact Found"));
	}

	@Override
	public AddressBookData createContact(AddressBookDTO addressBookDto) {
	AddressBookData addressData =	new AddressBookData( addressBookDto);
	log.debug("Address Data",addressData.toString());
		return addressBookData.save(addressData);
	}

	@Override
	public AddressBookData updateContact(int id, AddressBookDTO addressBookDto) {
		AddressBookData addressData = this.getContactById(id);
		addressData.updateAddressBookData(addressBookDto);
	
		
		
		return addressBookData.save(addressData);
	}

	@Override
	public void deleteContact(int id) {
		
	AddressBookData addressData = this.getContactById(id);
	addressBookData.delete(addressData);
		
	}
	
	

}
