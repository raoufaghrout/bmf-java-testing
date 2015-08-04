package io.ra.testingjava.factory;

import io.ra.testingjava.People;
import io.ra.testingjava.Person;

import java.util.List;

import static io.ra.testingjava.builder.PeopleBuilder.somePeople;

public class PeopleBuilderFactory {

    public static People somePeopleWithPersons(List<Person> person) {
        return somePeople()
                .withPersons(person)
                .build();
    }
}
