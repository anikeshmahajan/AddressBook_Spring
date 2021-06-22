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


@RestController
@RequestMapping("addressBook")
public class AddressBookController {

	@GetMapping("/contacts")
	public ResponseEntity<String> getContacts()
	{
		
		return new ResponseEntity<String>("Get call Success",HttpStatus.OK);
	}
	
	@GetMapping("/contacts/{id}")
	public ResponseEntity<String> getContactById(@PathVariable("id") int id)
	{
		
		return new ResponseEntity<String>("Get call Success for id :"+ id ,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addContact(
			 @RequestBody AddressBookDTO addressBookDto)
	{
		
		return new ResponseEntity<String>("Contact Created Success :" + addressBookDto ,HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateContact(
			@PathVariable("id") int id,  @RequestBody AddressBookDTO addressBookDTO)
	{
		return new ResponseEntity<String>("Updated"+ " " + addressBookDTO,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(
			@PathVariable("id") int id)
	{
		return new ResponseEntity<String>("deleted" +": "+ id,HttpStatus.OK);
	}
	
}
