package at.ac.htl.bhitm3.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    Address address;
    @Before public void setup() {
        address = new Address();
    }

    @Test public void given_address_test_setter_and_getter_with_valid_parameters() {
        final String STREET = "Street";
        final String POSTAL_CODE = "0000";
        final int STREET_NUMBER = 1;
        final String TOWN = "Town";

        address.setStreet(STREET);
        address.setPostalCode(POSTAL_CODE);
        address.setStreetNumber(STREET_NUMBER);
        address.setTown(TOWN);

        assertEquals(STREET, address.getStreet());
        assertEquals(POSTAL_CODE, address.getPostalCode());
        assertEquals(STREET_NUMBER, address.getStreetNumber());
        assertEquals(TOWN, address.getTown());
    }

    @Test public void given_address_with_fields_not_null_to_string() {
        final String STREET = "Street";
        final String POSTAL_CODE = "0000";
        final int STREET_NUMBER = 1;
        final String TOWN = "Town";

        final String ADDRESS_TO_STRING = String.format("%s %d, %s %s", STREET, STREET_NUMBER, POSTAL_CODE, TOWN);

        address.setStreet(STREET);
        address.setPostalCode(POSTAL_CODE);
        address.setStreetNumber(STREET_NUMBER);
        address.setTown(TOWN);

        assertEquals(ADDRESS_TO_STRING, address.toString());
    }
}
