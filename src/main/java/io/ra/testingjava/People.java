package io.ra.testingjava;

import java.util.List;

public class People {

    private List<Person> people;

    public People() {}

    public People(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }
}
