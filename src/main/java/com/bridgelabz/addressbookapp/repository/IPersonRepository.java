package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbookapp.model.Person;

public interface IPersonRepository extends JpaRepository<Person, Long> {

}