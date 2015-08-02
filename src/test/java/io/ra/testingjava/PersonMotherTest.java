package io.ra.testingjava;

import io.ra.testingjava.mother.Mother;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PersonMotherTest {

    private static final String FIRST_NAME = "John";
    private static final String SURNAME = "Smith";
    private static final int AGE = 35;

    @Test
    public void shouldCreatePersonUsingMother() {
        Person person = new Mother<>(Person.class)
                .with("firstName", FIRST_NAME)
                .with("surname", SURNAME)
                .with("age", AGE)
                .build();

        assertThat(person.getFirstName(), is(FIRST_NAME));
        assertThat(person.getSurname(), is(SURNAME));
        assertThat(person.getAge(), is(AGE));
    }
}
