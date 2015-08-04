package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.factory.PeopleMotherFactory.somePeopleWithPersons;
import static io.ra.testingjava.factory.PersonMotherFactory.aPersonWithFirstNameSurnameAndAge;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PeopleMotherFactoryTest extends BaseTest {

    @Test
    public void shouldCreatePeopleDelegatingToPersonMotherFactory() {
        Person person = aPersonWithFirstNameSurnameAndAge(CUSTOM_FIRST_NAME, CUSTOM_SURNAME, CUSTOM_AGE);
        People people = somePeopleWithPersons(singletonList(person));

        assertThat(people.getPersons().size(), is(1));
        assertThat(people.getPersons().get(0), is(person));
    }
}
