package io.ra.testingjava.factory;

import io.ra.testingjava.People;
import io.ra.testingjava.Person;
import io.ra.testingjava.builder.PeopleBuilder;

import java.util.List;

public class PeopleBuilderFactory {

    public static People somePeople() {
        return PeopleBuilder.somePeople()
                .build();
    }

    public static People somePeopleWithPersons(List<Person> person) {
        return PeopleBuilder.somePeople()
                .withPersons(person)
                .build();
    }
}
