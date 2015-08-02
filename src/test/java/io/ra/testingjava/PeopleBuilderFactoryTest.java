package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.factory.PeopleBuilderFactory.somePeopleWithPersons;
import static io.ra.testingjava.factory.PersonBuilderFactory.aPersonWithFirstNameSurnameAndAge;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PeopleBuilderFactoryTest {

    private static final String FIRST_NAME = "John";
    private static final String SURNAME = "Smith";
    private static final int AGE = 35;

    @Test
    public void shouldCreatePeopleWithPersonBuilderFactory() {
        Person person = aPersonWithFirstNameSurnameAndAge(FIRST_NAME, SURNAME, AGE);
        People people = somePeopleWithPersons(person);

        assertThat(people.getPersons().size(), is(1));
        assertThat(people.getPersons().get(0), is(person));
    }
}
