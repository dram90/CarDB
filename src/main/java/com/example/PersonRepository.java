package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by professor on 20/06/2016.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByName(String name);

    List<Person> findByNameAndSurname(String name, String surname);
    List<Person> findByNameOrSurname(String name, String surname);
    List<Person> findByAgeGreaterThanEqual(Integer age);


}
