package io.ra.testingjava;

import io.ra.testingjava.mother.Mother;
import org.junit.Test;

import static io.ra.testingjava.builder.PeopleBuilder.somePeople;
import static io.ra.testingjava.builder.PersonBuilder.aPerson;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PeopleTest {

    private static final String FIRST_NAME = "John";
    private static final String SURNAME = "Smith";
    private static final int AGE = 35;

    @Test
    public void shouldTestPeopleBuilderWithPersonBuilder() {
        Person person = aPerson()
                .withFirstName(FIRST_NAME)
                .withSurname(SURNAME)
                .withAge(AGE)
                .build();
        People people = somePeople()
                .withPeople(singletonList(person))
                .build();

        assertThat(people.getPeople().size(), is(1));
        assertThat(people.getPeople().get(0), is(person));
    }

    @Test
    public void shouldTestPeopleMotherWithPersonMother() {
        Person person = new Mother<>(Person.class)
                .with("firstName", FIRST_NAME)
                .with("surname", SURNAME)
                .with("age", AGE)
                .build();
        People people = new Mother<>(People.class)
                .with("people", singletonList(person))
                .build();

        assertThat(people.getPeople().size(), is(1));
        assertThat(people.getPeople().get(0), is(person));
    }
}
