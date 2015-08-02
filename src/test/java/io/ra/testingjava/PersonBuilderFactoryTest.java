package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.factory.PersonBuilderFactory.aPersonWithFirstNameSurnameAndAge;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PersonBuilderFactoryTest {

    private static final String FIRST_NAME = "John";
    private static final String SURNAME = "Smith";
    private static final int AGE = 35;

    @Test
    public void shouldCreatePersonUsingBuilderFactory() {
        Person person = aPersonWithFirstNameSurnameAndAge(FIRST_NAME, SURNAME, AGE);

        assertThat(person.getFirstName(), is(FIRST_NAME));
        assertThat(person.getSurname(), is(SURNAME));
        assertThat(person.getAge(), is(AGE));
    }
}
