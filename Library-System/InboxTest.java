

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class InboxTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InboxTest
{
    private Inbox inbox1;

    /**
     * Default constructor for test class InboxTest
     */
    public InboxTest()
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
        inbox1 = new Inbox("Miraa Kagami");
        
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
     * Tests setting the inbox object's sender.
     */
    @Test
    public void testSetSender()
    {
        inbox1.setSender("Miharu Tatebayashi");
        assertEquals("Miharu Tatebayashi", inbox1.getSender());
    }
    
    /**
     * Tests getting the inbox object's sender.
     */
    @Test
    public void testGetSender()
    {
        assertEquals("Miraa Kagami", inbox1.getSender());
    }
    
}

