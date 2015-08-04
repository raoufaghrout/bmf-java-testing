package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.factory.PersonBuilderFactory.aPerson;
import static io.ra.testingjava.factory.PersonBuilderFactory.aPersonWithFirstNameSurnameAndAge;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PersonBuilderFactoryTest extends BaseTest {

    @Test
    public void shouldCreateDefaultPersonUsingBuilderFactory() {
        Person person = aPerson();

        assertThat(person.getFirstName(), is(DEFAULT_FIRST_NAME));
        assertThat(person.getSurname(), is(DEFAULT_SURNAME));
        assertThat(person.getAge(), is(DEFAULT_AGE));
    }

    @Test
    public void shouldCreateCustomPersonUsingBuilderFactory() {
        Person person = aPersonWithFirstNameSurnameAndAge(CUSTOM_FIRST_NAME, CUSTOM_SURNAME, CUSTOM_AGE);

        assertThat(person.getFirstName(), is(CUSTOM_FIRST_NAME));
        assertThat(person.getSurname(), is(CUSTOM_SURNAME));
        assertThat(person.getAge(), is(CUSTOM_AGE));
    }
}
