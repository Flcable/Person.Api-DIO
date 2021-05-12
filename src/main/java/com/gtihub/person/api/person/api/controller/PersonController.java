package com.gtihub.person.api.person.api.controller;

import com.gtihub.person.api.person.api.dto.MessageResponseDTO;
import com.gtihub.person.api.person.api.entity.Person;
import com.gtihub.person.api.person.api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;




@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO.builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
