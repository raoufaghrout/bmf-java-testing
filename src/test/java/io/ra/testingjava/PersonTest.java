package io.ra.testingjava;

import io.ra.testingjava.mother.Mother;
import org.junit.Test;

import static io.ra.testingjava.builder.PersonBuilder.*;
import static io.ra.testingjava.factory.PersonBuilderFactory.*;
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

    @Test
    public void shouldTestPersonUsingMother() {
        Person person = new Mother<>(Person.class)
                .with("firstName", FIRST_NAME)
                .with("surname", SURNAME)
                .with("age", AGE)
                .build();

        assertThat(person.getFirstName(), is(FIRST_NAME));
        assertThat(person.getSurname(), is(SURNAME));
        assertThat(person.getAge(), is(AGE));
    }

    @Test
    public void shouldTestPersonUsingBuilderFactory() {
        Person person = aPersonWithFirstNameSurnameAndAge(FIRST_NAME, SURNAME, AGE);

        assertThat(person.getFirstName(), is(FIRST_NAME));
        assertThat(person.getSurname(), is(SURNAME));
        assertThat(person.getAge(), is(AGE));
    }
}
