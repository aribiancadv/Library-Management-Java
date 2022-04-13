

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MessageTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MessageTest
{
    private Message message1;

    /**
     * Default constructor for test class MessageTest
     */
    public MessageTest()
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
        message1 = new Message("Ayako Katagiri", "Let's go to Karaoke!");
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
     * Tests adding the message's text.
     */
    @Test
    public void testAddMessageText()
    {
        message1.addMessageText("Oh! So bad!");
        assertEquals("Oh! So bad!", message1.getMessageText());
    }
    
    /**
     * Tests getting the message's text.
     */
    @Test
    public void testGetMessageText()
    {
        assertEquals("Let's go to Karaoke!", message1.getMessageText());
    }
}

