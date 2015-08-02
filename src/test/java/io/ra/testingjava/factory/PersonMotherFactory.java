package io.ra.testingjava.factory;

import io.ra.testingjava.Person;
import io.ra.testingjava.mother.Mother;

public class PersonMotherFactory {

    public static Person aPersonWithFirstNameSurnameAndAge(String firstName, String surname, int age) {
        return new Mother<>(Person.class)
                .with("firstName", firstName)
                .with("surname", surname)
                .with("age", age)
                .build();
    }
}
