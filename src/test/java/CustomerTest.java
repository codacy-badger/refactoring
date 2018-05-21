import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("hi");
    }

    @Test
    public void nameShouldWork() {
        assertEquals("hi", customer.getName());
    }

    @Test
    public void emptyStatementShouldBeOk() {
        assertEquals("Rental Record for hi\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", customer.statement());
    }

    @Test
    public void nonEmptyStatementShouldBeOk() {
        Movie movie = new Movie("hi", 1);
        Rental rental = new Rental(movie, 1);
        customer.addRental(rental);

        assertEquals("Rental Record for hi\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\thi\t\t1\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }
}