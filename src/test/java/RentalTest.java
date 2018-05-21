import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {
    private Movie movie;
    private Rental rental;

    @Before
    public void setUp() {
        movie = new Movie("hi", 0);
        rental = new Rental(movie, 0);
    }

    @Test
    public void constructorShouldWork() {
        assertEquals(0, rental.getDaysRented());
        assertEquals(movie, rental.getMovie());
    }
}