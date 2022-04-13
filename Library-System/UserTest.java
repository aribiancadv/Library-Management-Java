

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class UserTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UserTest
{
    private User user1;

    /**
     * Default constructor for test class UserTest
     */
    public UserTest()
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
        user1 = new User("Rin Hoshizora", 668);
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
     * Tests modifying the username.
     */
    @Test
    public void testModifyUsername()
    {
        user1.modifyUsername("Subaru Oozora");
        assertEquals("Subaru Oozora", user1.getUsername());
    }
    
    /**
     * Tests retrieving the username.
     */
    @Test
    public void testGetUsername()
    {
        assertEquals("Rin Hoshizora", user1.getUsername());
    }
    
    /**
     * Tests modifying the user's ID.
     */
    @Test
    public void testModifyId()
    {
        user1.modifyId(1979);
        assertEquals(1979, user1.getId());
    }    
    
    /**
     * Tests getting the user's ID.
     */
    @Test
    public void testGetId()
    {
        assertEquals(668, user1.getId());
    }

    /**
     * Tests the functionality of adding a resource to the user's list of borrowed resources.
     */
    @Test
    public void testAddBorrowedResource()
    {
        PrintBook printBoo1 = new PrintBook("Alison Bechdel", "Fun Home", "Penguin Random House", 1234564561234L, 2007, "Sydney Wing, 3C", 987498165L, "Good");
        user1.addBorrowedResource(printBoo1);
        assert(user1.getBorrowedList().isEmpty() == false);
    }
    
    /**
     * Tests the functionality of removing a resource from the user's list of borrowed resources.
     */
    @Test
    public void testRemoveBorrowedResource()
    {
        PrintBook printBoo1 = new PrintBook("Alison Bechdel", "Fun Home", "Penguin Random House", 1234564561234L, 2007, "Sydney Wing, 3C", 987498165L, "Good");
        user1.addBorrowedResource(printBoo1);
        user1.removeBorrowedResource(printBoo1);
        assert(user1.getBorrowedList().isEmpty() == true);
    }
    
    /**
     * Tests adding an inbox object to the user's message list.
     */
    @Test
    public void testAddInboxObj()
    {
        Message Msg0079 = new Message("Bright Noah", "Prepare to launch!");
        user1.addInboxObj(Msg0079);
        assert(user1.getMsgList().isEmpty() == false);
    }
    
    /**
     * Test the counting of books borrowed by the user.
     */
    @Test
    public void testGetNumberBooksBorrowed()
    {
        PrintBook printBoo1 = new PrintBook("Alison Bechdel", "Fun Home", "Penguin Random House", 1234564561234L, 2007, "Sydney Wing, 3C", 987498165L, "Good");
        user1.addBorrowedResource(printBoo1);
        assertEquals(1, user1.getNumberBooksBorrowed());
    }
    
    /**
     * Tests that messages can be retrieved from the string that concatenates all messages.
     */
    @Test
    public void testGetallMessages()
    {
        Message Msg0079 = new Message("Bright Noah", "Prepare to launch!");
        user1.addInboxObj(Msg0079);
        assert(user1.getAllMessages() != "");
    
    }
}

