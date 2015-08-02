package io.ra.testingjava.builder;

import io.ra.testingjava.People;
import io.ra.testingjava.Person;

import java.util.List;

public class PeopleBuilder {

    private List<Person> persons;

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
