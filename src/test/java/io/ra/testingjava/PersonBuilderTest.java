package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.builder.PersonBuilder.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PersonBuilderTest extends BaseTest {

    @Test
    public void shouldCreatePersonUsingBuilder() {
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
