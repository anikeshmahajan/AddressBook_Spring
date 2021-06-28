package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.AddressBookData;
@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {

	public List<AddressBookData>findByNameContaining(String name);
}
