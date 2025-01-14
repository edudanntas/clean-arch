package com.edudanntas.clean_arch.core.usecases.impl;

import com.edudanntas.clean_arch.core.entities.Person;
import com.edudanntas.clean_arch.core.exceptions.BusinessException;
import com.edudanntas.clean_arch.core.gateways.PersonGateway;
import com.edudanntas.clean_arch.core.usecases.CreatePersonUseCase;

public class CreatePersonUseCaseImpl implements CreatePersonUseCase {
    private final PersonGateway personGateway;

    public CreatePersonUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public Person execute(Person person) {
        Person existPerson = personGateway.findByDocument(person.document());
        if (existPerson != null){
            throw new BusinessException("Person already exists");
        }
        return personGateway.create(person);
    }
}
