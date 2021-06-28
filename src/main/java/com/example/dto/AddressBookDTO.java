package com.example.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class AddressBookDTO {

	@NotBlank(message = "Field Cannot be empty")
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = " Name Invalid")
	public String name;
	@NotBlank(message = "Field Cannot be empty")
	public String address;
	
	@NotBlank(message = "Field Cannot be empty")
	@Pattern(regexp = "male|female", message = "gender should be male pr female")
	public String gender;
	@NotBlank(message = "Field Cannot be empty")
	public String state;
	@NotBlank(message = "Field Cannot be empty")
	public String zip;
//	@Pattern(regexp = "'((^\\+?)(([0-9]{2,3})(\\s))?)' + '[0-9]{10}$'",message = " Name Invalid")
	@NotBlank(message = "Field Cannot be empty")
	public String phno;
	@NotBlank(message = "Field Cannot be empty")
	public String city;
	
	
	

		
	
}
