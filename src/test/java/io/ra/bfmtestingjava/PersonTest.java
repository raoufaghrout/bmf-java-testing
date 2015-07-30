package io.ra.bfmtestingjava;

import org.junit.Test;

import static io.ra.bfmtestingjava.builder.PersonBuilder.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PersonTest {

    private static final String FIRST_NAME = "John";
    private static final String SURNAME = "Smith";
    private static final int AGE = 35;

    @Test
    public void shouldTestPersonUsingBuilder() {
        Person person = aPerson()
                .withFirstName(FIRST_NAME)
                .withSurname(SURNAME)
                .withAge(AGE)
                .build();

        assertThat(person.getFirstName(), is(FIRST_NAME));
        assertThat(person.getSurname(), is(SURNAME));
        assertThat(person.getAge(), is(AGE));
    }
}
