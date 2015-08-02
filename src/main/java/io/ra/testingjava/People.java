package io.ra.testingjava;

import java.util.List;

public class People {

    private List<Person> persons;

    public People() {}

    public People(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }
}
