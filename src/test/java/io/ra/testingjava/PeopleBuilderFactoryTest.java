package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.builder.PersonBuilder.aPerson;
import static io.ra.testingjava.factory.PeopleBuilderFactory.somePeople;
import static io.ra.testingjava.factory.PeopleBuilderFactory.somePeopleWithPersons;
import static io.ra.testingjava.factory.PersonBuilderFactory.aPersonWithFirstNameSurnameAndAge;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PeopleBuilderFactoryTest extends BaseTest {

    @Test
    public void shouldCreateDefaultPeopleDelegatingToPersonBuilderFactory() {
        People people = somePeople();

        assertThat(people.getPersons().size(), is(1));
        assertThat(people.getPersons().get(0), is(aPerson().build()));
    }

    @Test
    public void shouldCreateCustomPeopleDelegatingToPersonBuilderFactory() {
        Person person = aPersonWithFirstNameSurnameAndAge(CUSTOM_FIRST_NAME, CUSTOM_SURNAME, CUSTOM_AGE);
        People people = somePeopleWithPersons(singletonList(person));

        assertThat(people.getPersons().size(), is(1));
        assertThat(people.getPersons().get(0), is(person));
    }
}
