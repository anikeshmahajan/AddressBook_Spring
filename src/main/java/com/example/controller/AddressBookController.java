package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.AddressBookDTO;
import com.example.dto.ResponseDTO;
import com.example.model.AddressBookData;
import com.example.service.IAddressBookService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("addressBook")
@Slf4j
public class AddressBookController {

	@Autowired
	private IAddressBookService service;
	@GetMapping("/contacts")
	public ResponseEntity<ResponseDTO> getContacts()
	{
		List<AddressBookData> addressBookData = service.getContacts() ;
		ResponseDTO responseDTO = new ResponseDTO("Get success  :" , addressBookData);

		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/contacts/{id}")
	public ResponseEntity<ResponseDTO> getContactById(@PathVariable("id") int id)
	{
		AddressBookData addressBookData = service.getContactById(id);
		ResponseDTO responseDTO = new ResponseDTO("Get success for the id :" + id, addressBookData);
		
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addContact(
			@Valid @RequestBody AddressBookDTO addressBookDto)
	{
		log.debug("AddressBook DTO"+ addressBookDto.toString());
		AddressBookData addressBookData =service.createContact(addressBookDto);
		ResponseDTO responseDTO = new ResponseDTO("Contact Created Success :" + addressBookDto , addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO ,HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateContact(
			@PathVariable("id") int id,  @Valid  @RequestBody AddressBookDTO addressBookDto)
	{
		AddressBookData addressBookData =service.updateContact(id, addressBookDto);
		ResponseDTO responseDTO = new ResponseDTO("Contact Created Success :" + addressBookDto , addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> delete(
			@PathVariable("id") int id)
	{
		 service.deleteContact(id);
		ResponseDTO responseDTO = new ResponseDTO("deleted" +": "+ id , id);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
}
