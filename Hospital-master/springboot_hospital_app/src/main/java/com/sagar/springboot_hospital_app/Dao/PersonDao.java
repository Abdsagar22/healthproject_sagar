package com.sagar.springboot_hospital_app.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sagar.springboot_hospital_app.Dto.Person;
import com.sagar.springboot_hospital_app.Repo.PersonRepo;

@Repository
public class PersonDao {

	@Autowired
	private PersonRepo repo;
	
	public Person savePerson(Person person) {
		return repo.save(person);
	}
	
	public Person updatePerson(int id,Person person) {
		if(repo.findById(id).isPresent()) {
			person.setId(id);
			return repo.save(person);
		}else {
			return null;
		}
	}
	public Person deletePerson(int id) {
		if(repo.findById(id).isPresent()) {
			Person person= repo.findById(id).get();
			repo.deleteById(id);
			return person;
		}else {
			return null;
		}
	}
	
	public Person getPersonById(int id) {
		return repo.findById(id).get();
	}
}
