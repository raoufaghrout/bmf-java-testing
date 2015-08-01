package io.ra.testingjava.builder;

import io.ra.testingjava.People;
import io.ra.testingjava.Person;

import java.util.List;

public class PeopleBuilder {

    private List<Person> personList;

    public static PeopleBuilder somePeople() {
        return new PeopleBuilder();
    }

    public PeopleBuilder withPersonList(List<Person> personList) {
        this.personList = personList;
        return this;
    }


    public People build() {
        return new People(personList);
    }
}
