package at.ac.htl.bhitm3.Model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    Person person;
    @Before public void setUp() {
        person = new Person();
    }

    @Test public void given_person_test_setter_and_getter_with_valid_parameters_without_address() {
        final String FIRSTNAME = "First";
        final String LASTNAME = "Last";
        final LocalDate DATE_OF_BIRTH = LocalDate.now();

        person.setFirstname(FIRSTNAME);
        person.setLastname(LASTNAME);
        person.setDateOfBirth(DATE_OF_BIRTH);

        assertEquals(FIRSTNAME, person.getFirstname());
        assertEquals(LASTNAME, person.getLastname());
        assertEquals(DATE_OF_BIRTH, person.getDateOfBirth());
    }

    @Test public void given_person_has_set_address() {
        final Address personAddress = new Address();

        personAddress.setStreet("Street");
        personAddress.setStreetNumber(0);
        personAddress.setTown("Town");
        personAddress.setPostalCode("0000");

        person.setAddress(personAddress);
        assertEquals("Street 0, 0000 Town", person.getAddress().toString());
    }
}