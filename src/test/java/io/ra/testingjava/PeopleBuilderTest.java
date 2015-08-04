package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.builder.PeopleBuilder.somePeople;
import static io.ra.testingjava.builder.PersonBuilder.aPerson;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PeopleBuilderTest extends BaseTest {

    @Test
    public void shouldCreateDefaultPeopleDelegatingToPersonBuilder() {
        People people = somePeople().build();

        assertThat(people.getPersons().size(), is(1));
        assertThat(people.getPersons().get(0), is(aPerson().build()));
    }

    @Test
    public void shouldCreateCustomPeopleDelegatingToPersonBuilder() {
        Person person = aPerson()
                .withFirstName(CUSTOM_FIRST_NAME)
                .withSurname(CUSTOM_SURNAME)
                .withAge(CUSTOM_AGE)
                .build();
        People people = somePeople()
                .withPersons(singletonList(person))
                .build();

        assertThat(people.getPersons().size(), is(1));
        assertThat(people.getPersons().get(0), is(person));
    }
}
