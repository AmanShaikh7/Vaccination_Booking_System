package com.example.VBS.controller;

import com.example.VBS.Model.Person;
import com.example.VBS.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/add")
    public ResponseEntity addperson(@RequestBody Person person){
        try {
            Person p  = personService.addperson(person);
            return new ResponseEntity(p,HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity("Check your input details again", HttpStatus.BAD_REQUEST);
        }

    }
}
