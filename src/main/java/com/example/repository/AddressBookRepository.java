package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.AddressBookData;
@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {

}
