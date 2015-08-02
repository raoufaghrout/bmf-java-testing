package io.ra.testingjava.factory;

import io.ra.testingjava.People;
import io.ra.testingjava.Person;

import static io.ra.testingjava.builder.PeopleBuilder.somePeople;
import static java.util.Arrays.asList;

public class PeopleBuilderFactory {

    public static People somePeopleWithPersons(Person person) {
        return somePeople()
                .withPersons(asList(person))
                .build();
    }
}
