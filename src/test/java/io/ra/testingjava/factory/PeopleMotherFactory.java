package io.ra.testingjava.factory;

import io.ra.testingjava.People;
import io.ra.testingjava.Person;
import io.ra.testingjava.mother.Mother;

import java.util.List;

public class PeopleMotherFactory {

    public static People somePeopleWithPersons(List<Person> persons) {
        return new Mother<>(People.class)
                .with("persons", persons)
                .build();
    }
}
