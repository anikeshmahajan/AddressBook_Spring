package com.example.dto;

public class AddressBookDTO {

	public String name,address;

	
	public AddressBookDTO(String name, String address) {

		this.name = name;
		this.address = address;
	}

	public AddressBookDTO() {
		
	}
		
			public String getName() {
				return name;
			}
		
			public String getAddress() {
				return address;
			}
		
			public void setName(String name) {
				this.name = name;
			}
		
			public void setAddress(String address) {
				this.address = address;
			}

			
			
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "name :  " + name +  "    +      " + "address  : " + address;
	}
	
}
