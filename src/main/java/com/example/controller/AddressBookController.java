package com.example.controller;

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


@RestController
@RequestMapping("addressBook")
public class AddressBookController {

	@GetMapping("/contacts")
	public ResponseEntity<ResponseDTO> getContacts()
	{
		AddressBookData addressBookData = new AddressBookData(5,new AddressBookDTO("Anikesh", "Akhnoor"));
		ResponseDTO responseDTO = new  ResponseDTO("Get Call Success", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/contacts/{id}")
	public ResponseEntity<ResponseDTO> getContactById(@PathVariable("id") int id)
	{
		AddressBookData addressBookData = new AddressBookData(1,new AddressBookDTO("Jammu", "J&k"));
		ResponseDTO responseDTO = new ResponseDTO("Get success for the id :" + id, addressBookData);
		
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addContact(
			 @RequestBody AddressBookDTO addressBookDto)
	{
		
		AddressBookData addressBookData =new AddressBookData(1, addressBookDto);
		ResponseDTO responseDTO = new ResponseDTO("Contact Created Success :" + addressBookDto , addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO ,HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateContact(
			@PathVariable("id") int id,  @RequestBody AddressBookDTO addressBookDto)
	{
		AddressBookData addressBookData =new AddressBookData(1, addressBookDto);
		ResponseDTO responseDTO = new ResponseDTO("Contact Created Success :" + addressBookDto , addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> delete(
			@PathVariable("id") int id)
	{
		ResponseDTO responseDTO = new ResponseDTO("deleted" +": "+ id , id);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
}
