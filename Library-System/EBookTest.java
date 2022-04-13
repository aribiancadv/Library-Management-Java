

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class EBookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EBookTest
{
    private EBook eBook1;
    private Device device1;

    /**
     * Default constructor for test class EBookTest
     */
    public EBookTest()
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
        eBook1 = new EBook("Masami Kurumada", "Saint Seiya Vol. 28", "Kadokawa Shoten", 1991, "4th Floor, Section 2C", 123123123123123L);
        device1 = new Device("4th Floor, Section 2C", 321321321321321L, "Computer 79", "Personal Computer");
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
     * Tests adding a compatible device.
     */
    @Test
    public void testAddDevice()
    {
        eBook1.addDevice(device1);
    }

    /**
     * Tests getting the list of compatible devices.
     */
    @Test
    public void testGetDevicesList()
    {
        eBook1.addDevice(device1);
        assert(eBook1.getDevicesList().isEmpty() == false);
    }
}


