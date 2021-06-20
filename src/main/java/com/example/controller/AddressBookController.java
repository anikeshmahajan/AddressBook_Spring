package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
