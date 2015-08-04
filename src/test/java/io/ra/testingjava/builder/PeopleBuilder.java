package io.ra.testingjava.builder;

import io.ra.testingjava.People;
import io.ra.testingjava.Person;

import java.util.List;

import static io.ra.testingjava.builder.PersonBuilder.aPerson;
import static java.util.Collections.singletonList;

public class PeopleBuilder {

    private List<Person> persons = singletonList(aPerson().build());

    public static PeopleBuilder somePeople() {
        return new PeopleBuilder();
    }

    public PeopleBuilder withPersons(List<Person> persons) {
        this.persons = persons;
        return this;
    }

    public People build() {
        return new People(persons);
    }
}
