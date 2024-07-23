package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PersonService {

    @PostMapping
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){
        Person entity = new Person();
    }

}
