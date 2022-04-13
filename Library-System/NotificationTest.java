

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class NotificationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NotificationTest
{
    private Notification notifica1;

    /**
     * Default constructor for test class NotificationTest
     */
    public NotificationTest()
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
        notifica1 = new Notification("Yuina Himoo", "Come to my lab at once.");
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
     * Tests adding the notification's text.
     */
    @Test
    public void testAddNotifText()
    {
        notifica1.addNotifText("I am going to the Aquarium on Sunday.");
        assertEquals("I am going to the Aquarium on Sunday.", notifica1.getNotifText());
    }
    
    /**
     * Tests getting the notification's text.
     */
    @Test
    public void testGetNotifText()
    {
        assertEquals("Come to my lab at once.", notifica1.getNotifText());
    }
}

