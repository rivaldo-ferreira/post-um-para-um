package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDTO;
import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dpt = departmentRepository.getReferenceById(dto.getDepartment().getId());

        /*
        Department dpt = new Department();
        dpt.setId(dto.getDepartment().getId());
         */

        entity.setDepartment(dpt);

        entity = repository.save(entity);

        return  new PersonDepartmentDTO(entity);
    }

    public PersonDTO insert(PersonDTO dto){
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dpt = departmentRepository.getReferenceById(dto.getDepartamentId());


        //Department dpt = new Department();
        //dpt.setId(dto.getDepartamentId());


        entity.setDepartment(dpt);

        entity = repository.save(entity);

        return  new PersonDTO(entity);
    }

}
