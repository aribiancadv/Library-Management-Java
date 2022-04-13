

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PrintBookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PrintBookTest
{
    private PrintBook FSSV1;

    /**
     * Default constructor for test class PrintBookTest
     */
    public PrintBookTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        FSSV1 = new PrintBook("Mamoru Nagano", "The Five Star Stories Vol. 1", "Kadokawa Shoten", 1234567891234L, 1988, "4th Floor, Section 2C", 999756855L, "Good");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Tests setting the print book's condition.
     */
    @Test
    public void testSetCondition()
    {
        FSSV1.setCondition("Very good");
        assertEquals("Very good", FSSV1.getCondition());
    }

    /**
     * Tests getting the string for the book's condition.
     */
    @Test
    public void testGetCondition()
    {
        assertEquals("Good", FSSV1.getCondition());
    }

    /**
     * Tests setting the ISBN.
     */
    @Test
    public void testSetIsbn()
    {
        FSSV1.setIsbn(1234567891234L);
        assertEquals(1234567891234L, FSSV1.getIsbn());
    }

    /**
     * Tests retrieving the ISBN.
     */
    @Test
    public void testGetIsbn()
    {
        assertEquals(1234567891234L, FSSV1.getIsbn());
    }


}





