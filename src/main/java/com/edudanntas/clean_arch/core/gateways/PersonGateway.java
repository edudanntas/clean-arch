package com.edudanntas.clean_arch.core.gateways;

import com.edudanntas.clean_arch.core.entities.Person;

import java.util.List;

public interface PersonGateway {
    Person create(Person person);

    Person findByDocument(String document);

    List<Person> findAllPersons();
}
