package com.example.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class AddressBookDTO {

	@NotBlank(message = "Field Cannot be empty")
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = " Name Invalid")
	public String name;
	@NotBlank
	public String address;
	
	@NotBlank
	public String gender;
	
	
	

		
	
}
