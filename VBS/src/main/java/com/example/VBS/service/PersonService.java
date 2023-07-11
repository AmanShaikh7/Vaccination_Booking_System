package com.example.VBS.service;

import com.example.VBS.Model.Person;
import com.example.VBS.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public Person addperson(Person person) {
        //return personRepository.save(person); // this will reutrn the whole row that has been saved
        // now this save can throw error if email is not unique , so we have to catch that in controller layer

        person.setDose1Taken(false);
        person.setDose2Taken(false);
        Person Savedp = personRepository.save(person);
        return Savedp;

    }
}
