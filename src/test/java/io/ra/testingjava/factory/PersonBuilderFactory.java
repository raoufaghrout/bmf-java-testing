package io.ra.testingjava.factory;

import io.ra.testingjava.Person;
import io.ra.testingjava.builder.PersonBuilder;

public class PersonBuilderFactory {


    public static Person aPersonWithFirstNameSurnameAndAge(String firstName, String surname, int age) {
        return PersonBuilder.aPerson()
                .withFirstName(firstName)
                .withSurname(surname)
                .withAge(age)
                .build();
    }
}
