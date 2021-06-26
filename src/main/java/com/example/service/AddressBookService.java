package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.AddressBookDTO;
import com.example.exceptions.AddressBookException;
import com.example.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	private List <AddressBookData >addressBookData = new ArrayList<>();
	@Override
	public List<AddressBookData> getContacts() {
		
//		addressBookData.add(new AddressBookData(5, new AddressBookDTO("Raju", "punjab")));
		return addressBookData;
	}

	@Override
	public AddressBookData getContactById(int id) {
		
		return addressBookData.stream()
				.filter(addressData -> addressData.getAddressid() == id)
				.findFirst()
				.orElseThrow(() ->new AddressBookException("No Contact Found"));
	}

	@Override
	public AddressBookData createContact(AddressBookDTO addressBookDto) {
	AddressBookData addressData =	new AddressBookData(addressBookData.size()+1, addressBookDto);
	addressBookData.add(addressData);
		return addressData;
	}

	@Override
	public AddressBookData updateContact(int id, AddressBookDTO addressBookDto) {
		AddressBookData addressData = this.getContactById(id);
		addressData.setName(addressBookDto.name);
		addressData.setAddress(addressBookDto.address);
		addressBookData.set(id-1, addressData);
		
		return addressData;
	}

	@Override
	public void deleteContact(int id) {
		
		addressBookData.remove(id-1);
		
	}
	
	

}
