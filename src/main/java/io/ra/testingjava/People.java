package io.ra.testingjava;

import java.util.List;

public class People {

    private List<Person> personList;

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
