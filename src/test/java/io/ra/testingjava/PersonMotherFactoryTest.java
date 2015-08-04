package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.factory.PersonMotherFactory.aPersonWithFirstNameSurnameAndAge;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PersonMotherFactoryTest extends BaseTest {

    @Test
    public void shouldCreatePersonUsingMotherFactory() {
        Person person = aPersonWithFirstNameSurnameAndAge(FIRST_NAME, SURNAME, AGE);

        assertThat(person.getFirstName(), is(FIRST_NAME));
        assertThat(person.getSurname(), is(SURNAME));
        assertThat(person.getAge(), is(AGE));
    }
}
