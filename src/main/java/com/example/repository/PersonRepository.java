package com.example.repository;

import com.example.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByName(String name);

    List<Person> findByNameAndSurname(String name, String surname);
    List<Person> findByNameOrSurname(String name, String surname);
    List<Person> findByAgeGreaterThanEqual(Integer age);


}
