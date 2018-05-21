import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("hi", 0);
    }

    @Test
    public void constructorShouldWork() {
        assertEquals("hi", movie.getTitle());
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void setterShouldWork() {
        movie.setPriceCode(1);

        assertEquals(1, movie.getPriceCode());
    }
}