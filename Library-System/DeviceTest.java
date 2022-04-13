

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DeviceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DeviceTest
{
    private Device PC98;

    /**
     * Default constructor for test class DeviceTest
     */
    public DeviceTest()
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
        PC98 = new Device("2nd Floor, Section 3C", 99351189L, "Computer 98", "Personal Computer");
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
     * Tests setting the device's name.
     */
    @Test
    public void testSetDeviceName()
    {
        PC98.setDeviceName("Super Nintendo");
        assertEquals("Super Nintendo", PC98.getDeviceName());
    }

    /**
     * Tests getting the device's name.
     */
    @Test
    public void testGetDeviceName()
    {
        assertEquals("Computer 98", PC98.getDeviceName());
    }
    
    /**
     * Tests setting the device's type.
     */
    @Test
    public void testSetDeviceType()
    {
        PC98.setDeviceType("Tablet Computer");
        assertEquals("Tablet Computer", PC98.getDeviceType());
    }

    /**
     * Tests getting the device's type.
     */
    @Test
    public void testGetDeviceType()
    {
        assertEquals("Personal Computer", PC98.getDeviceType());
    }
}
