

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookTest
{
    private Book DearCramerV3;

    /**
     * Default constructor for test class BookTest
     */
    public BookTest()
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
        DearCramerV3 = new Book("Naoshi Arakawa", "Farewell, My Dear Cramer Vol. 3", "Kodansha", 2017, "2nd Floor, Section 3C", 99813535L);
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
     * Tests setting the book's author.
     */
    @Test
    public void testSetAuthor()
    {
        DearCramerV3.setAuthor("Hideo Kojima");
        assertEquals("Hideo Kojima", DearCramerV3.getAuthor());
    }
    
    /**
     * Tests retrieving the book's author.
     */
    @Test
    public void testGetAuthor()
    {
        assertEquals("Naoshi Arakawa", DearCramerV3.getAuthor());
    }
    
    /**
     * Tests setting the book's title.
     */
    @Test
    public void testSetTitle()
    {
        DearCramerV3.setTitle("Captain Tsubasa");
        assertEquals("Captain Tsubasa", DearCramerV3.getTitle());
    }
    
    /**
     * Tests retrieving the book's title.
     */
    @Test
    public void testGetTitle()
    {
        assertEquals("Farewell, My Dear Cramer Vol. 3", DearCramerV3.getTitle());
    }
    
    /**
     * Tests setting the publisher.
     */
    @Test
    public void testSetPublisher()
    {
        DearCramerV3.setPublisher("Shonen Jump");
        assertEquals("Shonen Jump", DearCramerV3.getPublisher());
    }
    
    /**
     * Tests getting the publisher.
     */
    @Test
    public void testGetPublisher()
    {
        assertEquals("Kodansha", DearCramerV3.getPublisher());
    }
    
    /**
     * Tests setting whether it is an electronic resource.
     */
    @Test
    public void testSetIfEresource()
    {
        DearCramerV3.setIfEresource(true);
        assertEquals(true, DearCramerV3.checkIfEResource());
    }
    
    /**
     * Tests the check for whether the book is in print or not.
     */
    @Test
    public void testCheckIfEresource()
    {
        assertEquals(false, DearCramerV3.checkIfEResource());
    }    
    
    /**
     * Tests setting the publication year.
     */
    @Test
    public void testSetYear()
    {
        DearCramerV3.setYearPublished(1983);
        assertEquals(1983, DearCramerV3.getYear());
    }
    
    /**
     * Tests getting the publication year.
     */
    @Test
    public void testGetYear()
    {
        assertEquals(2017, DearCramerV3.getYear());
    }    
    
}

