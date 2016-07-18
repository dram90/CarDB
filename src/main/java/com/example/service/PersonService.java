package com.example.service;

import com.example.domain.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void testPeople(){
        Person person1 = new Person();
        person1.setName("Ivan");
        person1.setAge(23);
        personRepository.save(person1);


        Person person2 = new Person();
        person2.setName("Dimple");
        person2.setAge(26);
        personRepository.save(person2);

        Person person3 =new Person();
        person3.setName("Noelia");
        person3.setSurname("Villa");
        person3.setAge(25);
        personRepository.save(person3);

        Person person4 = new Person();
        person4.setName("Jordi");
        person4.setAge(25);
        personRepository.save(person4);

        Person person5 = new Person();
        person5.setName("Ricard");
        person5.setAge(25);
        personRepository.save(person5);

        Person person6 = new Person();
        person6.setName("Juan");
        person6.setSurname("Villa");
        person6.setAge(25);
        personRepository.save(person6);

        Person person7 = new Person();
        person7.setName("David");
        person7.setSurname("Rodríquez");
        person7.setAge(26);
        personRepository.save(person7);

        Person person8 = new Person();
        person8.setName("Judith");
        person8.setSurname("Sala");
        person8.setAge(25);
        personRepository.save(person8);

        Person person9 = new Person();
        person9.setName("Oscar");
        person9.setAge(25);
        personRepository.save(person8);




        /*
        System.out.println(personRepository.findOne(2L));
        System.out.println(personRepository.findByName("Noelia"));

        System.out.println("These are all people 23 years old or more: ");
        System.out.println(personRepository.findByAgeGreaterThanEqual(23));
        System.out.println("All the people called Noelia Villa are: ");
        System.out.println(
                personRepository.findByNameAndSurname("Noelia","Villa"));

        System.out.println("All people named Noelia or with surname Villa are the following: ");
        System.out.println(
                personRepository.findByNameOrSurname("Noelia","Villa"));

       */

    }
}
