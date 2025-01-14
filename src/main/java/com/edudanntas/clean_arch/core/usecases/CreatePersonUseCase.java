package com.edudanntas.clean_arch.core.usecases;

import com.edudanntas.clean_arch.core.entities.Person;

public interface CreatePersonUseCase {
    Person execute(Person person);
}
