package io.ra.testingjava;

import org.junit.Test;

import static io.ra.testingjava.builder.PeopleBuilder.somePeople;
import static io.ra.testingjava.builder.PersonBuilder.aPerson;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PeopleTest {

    @Test
    public void shouldTestPeopleWithBuilderWithPersonBuilder() {
        Person person = aPerson()
                .withFirstName("John")
                .withSurname("Smith")
                .withAge(35)
                .build();
        People people = somePeople()
                .withPersonList(singletonList(person))
                .build();

        assertThat(people.getPersonList().size(), is(1));
        assertThat(people.getPersonList().get(0), is(person));
    }
}
