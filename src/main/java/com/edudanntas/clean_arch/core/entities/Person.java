package com.edudanntas.clean_arch.core.entities;

import com.edudanntas.clean_arch.core.enums.PersonType;

public record Person(
        String name,
        String email,
        String document,
        PersonType personType
) {}
