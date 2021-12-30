package com.bridgelabz.addressbookapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.model.Person;
import com.bridgelabz.addressbookapp.repository.IPersonRepository;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private IPersonRepository personRepository;

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public Person createPersonData(PersonDTO personDTO) {
		Person contactData = null;
		contactData = new Person(1, personDTO);
		return personRepository.save(contactData);
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public Person updatePersonDta(long id, PersonDTO personDTO) {
		Person person = this.getPersonById(id);
		personData.updatePersonData(personDTO);
		return personRepository.save(person);
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public List<Person> getPersonData() {
		return personRepository.findAll();
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public Person getPersonById(long id) {
		return personRepository.findById(id);
	}

	@Override
	public void deletePersonData(long id) {
		Person person = this.getPersonById(id);
		personRepository.delete(person);
	}

}