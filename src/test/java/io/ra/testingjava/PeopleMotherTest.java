package io.ra.testingjava;

import io.ra.testingjava.mother.Mother;
import org.junit.Test;

import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PeopleMotherTest {

    private static final String FIRST_NAME = "John";
    private static final String SURNAME = "Smith";
    private static final int AGE = 35;

    @Test
    public void shouldCreatePeopleMotherWithPersonMother() {
        Person person = new Mother<>(Person.class)
                .with("firstName", FIRST_NAME)
                .with("surname", SURNAME)
                .with("age", AGE)
                .build();
        People people = new Mother<>(People.class)
                .with("persons", singletonList(person))
                .build();

        assertThat(people.getPersons().size(), is(1));
        assertThat(people.getPersons().get(0), is(person));
    }
}
