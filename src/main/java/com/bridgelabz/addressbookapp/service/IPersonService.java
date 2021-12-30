package com.bridgelabz.addressbookapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.model.Person;

@Service
public interface IPersonService {

	Person createPersonData(PersonDTO personDTO);

	Person updatePersonDta(long id, PersonDTO personDTO);

	List<Person> getPersonData();

	Person getPersonById(long id);

	void deletePersonData(long id);
}