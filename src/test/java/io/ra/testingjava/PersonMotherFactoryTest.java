package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.factory.PersonMotherFactory.aPersonWithFirstNameSurnameAndAge;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PersonMotherFactoryTest extends BaseTest {

    @Test
    public void shouldCreatePersonUsing() {
        Person person = aPersonWithFirstNameSurnameAndAge(CUSTOM_FIRST_NAME, CUSTOM_SURNAME, CUSTOM_AGE);

        assertThat(person.getFirstName(), is(CUSTOM_FIRST_NAME));
        assertThat(person.getSurname(), is(CUSTOM_SURNAME));
        assertThat(person.getAge(), is(CUSTOM_AGE));
    }
}
