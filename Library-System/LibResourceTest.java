

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibResourceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibResourceTest
{
    private LibResource LibResource;
    private User Tim108;

    
    

    

    /**
     * Default constructor for test class LibResourceTest
     */
    public LibResourceTest()
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
        LibResource = new LibResource("Ohtori Library", 19971999L);
        Tim108 = new User("Tim Rogers", 108);
        LibResource.setUserAccessing(Tim108);
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
     * Test setting the resource's availability.
     */
    @Test
    public void testSetIsAvailable()
    {
        LibResource.setIsAvailable(true);
        assertEquals(true, LibResource.getIsAvailable());
    }
    
    /**
     * Tests checking a resource's availability.
     */
    @Test
    public void testCheckAvailability()
    {
        assertEquals(false, LibResource.checkAvailability());
    }    

    /**
    * Tests setting the user accessing the resource.
    */
    @Test
    public void testSetUserAccessing()
    {
        LibResource.setUserAccessing(Tim108);
        assertEquals(Tim108, LibResource.getUserAccessing());
    }
    
    /**
    * Tests getting the user accessing the resource.
    */    
    @Test
    public void testGetUserAccessing()
    {
        assertEquals(Tim108, LibResource.getUserAccessing());
    } 
    
    /**
    * Tests setting the resource's location.
    */
    @Test
    public void testSetLocation()
    {
        LibResource.setLocation("Kirameki High School");
        assertEquals("Kirameki High School", LibResource.getLocation());
    }
    
    /**
    * Tests getting the resource's location.
    */    
    @Test
    public void testGetLocation()
    {
        assertEquals("Ohtori Library", LibResource.getLocation());
    }
    
    /**
     * Tests setting the resource's ID number.
     */
    @Test
    public void testSetResourceId()
    {
        LibResource.setResourceId(9935445489L);
        assertEquals(9935445489L, LibResource.getResourceId());
    }
    
    /**
    * Tests getting the resource's ID number.
    */
    @Test
    public void testGetResourceId()
    {
        assertEquals(19971999L, LibResource.getResourceId());
    }    
    
    
    
}


