package io.ra.testingjava;

import io.ra.testingjava.mother.Mother;
import org.junit.Test;

import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PeopleMotherTest extends BaseTest {

    @Test
    public void shouldCreatePeopleMotherWithPersonMother() {
        Person person = new Mother<>(Person.class)
                .with("firstName", CUSTOM_FIRST_NAME)
                .with("surname", CUSTOM_SURNAME)
                .with("age", CUSTOM_AGE)
                .build();
        People people = new Mother<>(People.class)
                .with("persons", singletonList(person))
                .build();

        assertThat(people.getPersons().size(), is(1));
        assertThat(people.getPersons().get(0), is(person));
    }
}
