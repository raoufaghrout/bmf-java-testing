package io.ra.testingjava;

import io.ra.testingjava.mother.Mother;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PersonMotherTest extends BaseTest {

    @Test
    public void shouldCreateCustomPerson() {
        Person person = new Mother<>(Person.class)
                .with("firstName", CUSTOM_FIRST_NAME)
                .with("surname", CUSTOM_SURNAME)
                .with("age", CUSTOM_AGE)
                .build();

        assertThat(person.getFirstName(), is(CUSTOM_FIRST_NAME));
        assertThat(person.getSurname(), is(CUSTOM_SURNAME));
        assertThat(person.getAge(), is(CUSTOM_AGE));
    }
}
