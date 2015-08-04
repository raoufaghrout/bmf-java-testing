package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.builder.PersonBuilder.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PersonBuilderTest extends BaseTest {

    @Test
    public void shouldCreateDefaultPerson() {
        Person person = aPerson().build();

        assertThat(person.getFirstName(), is(DEFAULT_FIRST_NAME));
        assertThat(person.getSurname(), is(DEFAULT_SURNAME));
        assertThat(person.getAge(), is(DEFAULT_AGE));
    }

    @Test
    public void shouldCreateCustomPerson() {
        Person person = aPerson()
                .withFirstName(CUSTOM_FIRST_NAME)
                .withSurname(CUSTOM_SURNAME)
                .withAge(CUSTOM_AGE)
                .build();

        assertThat(person.getFirstName(), is(CUSTOM_FIRST_NAME));
        assertThat(person.getSurname(), is(CUSTOM_SURNAME));
        assertThat(person.getAge(), is(CUSTOM_AGE));
    }
}
