

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryTest
{
    private Library ShioriLibrary;
    private User user1;
    private PrintBook FSSV1;
    private EBook eBook1;
    private Device device1;
    private Book DearCramerV3;
    private Device PC98;
    private LibResource LibResource;
    private User Tim108;

    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    

    

    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
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
        ShioriLibrary = new Library("Shiori Fujisaki Memorial Library");
        FSSV1 = new PrintBook("Mamoru Nagano", "The Five Star Stories Vol. 1", "Kadokawa Shoten", 1234567891234L, 1988, "4th Floor, Section 2C", 999756855L, "Good");
        eBook1 = new EBook("Masami Kurumada", "Saint Seiya Vol. 28", "Kadokawa Shoten", 1991, "4th Floor, Section 2C", 123123123123123L);
        device1 = new Device("4th Floor, Section 2C", 321321321321321L, "Computer 79", "Personal Computer");
        DearCramerV3 = new Book("Naoshi Arakawa", "Farewell, My Dear Cramer Vol. 3", "Kodansha", 2017, "2nd Floor, Section 3C", 99813535L);
        PC98 = new Device("2nd Floor, Section 3C", 99351189L, "Computer 98", "Personal Computer");
        LibResource = new LibResource("Ohtori Library", 19971999L);
        Tim108 = new User("Tim Rogers", 108);
        LibResource.setUserAccessing(Tim108);
        ShioriLibrary.addToCatalogue(DearCramerV3);
        ShioriLibrary.removeFromCataloguePos(0);
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
     * Tests adding a resource to the library catalogue.
     */
    @Test
    public void testAddToCatalogue()
    {
        ShioriLibrary.addToCatalogue(FSSV1);
        assert(ShioriLibrary.getCatalogue().isEmpty() == false);
    }
    
    /**
    * Tests removing a resource to the library catalogue.
    */
    @Test
    public void testRemoveFromCatalogue()
    {
        ShioriLibrary.addToCatalogue(FSSV1);
        ShioriLibrary.removeFromCatalogue(FSSV1);
        assert(ShioriLibrary.getCatalogue().isEmpty());
    }
    
    /**
    * Tests removing a resource to the library catalogue
    * based on its ArrayList index integer.
    */
    @Test
    public void testRemoveFromCataloguePos()
    {
        ShioriLibrary.addToCatalogue(FSSV1);
        ShioriLibrary.removeFromCataloguePos(0);
        assert(ShioriLibrary.getCatalogue().isEmpty());
    }
    
    /**
    * Tests getting the library catalogue by checking if it's empty.
    */
    @Test
    public void testGetCatalogue()
    {
        assert(ShioriLibrary.getCatalogue().isEmpty() == true);
    }
    
    /**
    * Tests adding a user to the list of library staff.
    */
    @Test
    public void testAddToStaff()
    {
        ShioriLibrary.addToStaff(Tim108);
        assert(ShioriLibrary.getStaff().isEmpty() == false);
    }
    
    /**
    * Tests getting the library staff list by checking if it's empty.
    */
    @Test
    public void testGetStaff()
    {
        assert(ShioriLibrary.getStaff().isEmpty() == true);
    }
    
    /**
    * Tests adding a user to the list of library users.
    */    
    @Test
    public void testAddToUsers()
    {
        ShioriLibrary.addToUsers(Tim108);
        assert(ShioriLibrary.getUsers().isEmpty() == false);
    }    
    
    /**
    * Tests getting the library user list by checking if it's empty.
    */
    @Test
    public void testGetUsers()
    {
        assert(ShioriLibrary.getUsers().isEmpty() == true);
    }    

    /**
     * Tests checking if a book is in the catalogue.
     */
    @Test
    public void testCheckIfInCatalogue()
    {
        ShioriLibrary.addToCatalogue(DearCramerV3);
        assertEquals(true, ShioriLibrary.checkIfInCatalogue(DearCramerV3));
    }

    /**
     * Tests changing the title of a book and the name of a device.
     */
    @Test
    public void testEditResourceName()
    {
        ShioriLibrary.addToCatalogue(FSSV1);
        ShioriLibrary.addToCatalogue(PC98);
        ShioriLibrary.addToCatalogue(DearCramerV3);
        ShioriLibrary.editResourceName(FSSV1, "Tokimeki Memorial");
        assertEquals("Tokimeki Memorial", FSSV1.getTitle());
        ShioriLibrary.editResourceName(PC98, "Super Famicom");
        assertEquals("Super Famicom", PC98.getDeviceName());
    }

    /**
     * Tests retrieving a resource from the library catalogue.
     */
    @Test
    public void testFindResource()
    {
        ShioriLibrary.addToCatalogue(FSSV1);
        assertEquals(FSSV1, ShioriLibrary.findResource(FSSV1));
    }
    

    /**
     * Tests the functionality of loaning out a book to a user,
     * checking whether the list of borrowed resources is empty after
     * calling the loan book method.
     */
    @Test
    public void testLoanBook()
    {
        ShioriLibrary.addToCatalogue(DearCramerV3);
        ShioriLibrary.addToUsers(Tim108);
        ShioriLibrary.loanBook(Tim108, DearCramerV3);
        assert(Tim108.getBorrowedList().isEmpty() == false);
    }
    
    /**
     * Tests the functionality of returning a book to the library.
     */
    @Test
    public void testReturnBook()
    {
        ShioriLibrary.addToCatalogue(FSSV1);
        ShioriLibrary.addToUsers(Tim108);
        ShioriLibrary.loanBook(Tim108, FSSV1);
        ShioriLibrary.returnBook(FSSV1, true, "Poor");
        assertEquals("Poor", FSSV1.getCondition());
    }
    
    /**
     * Tests the system for messaging all library users currently borrowing print books.
     */
    @Test
    public void testBorrowerReminder()
    {
        ShioriLibrary.addToCatalogue(FSSV1);
        ShioriLibrary.addToUsers(Tim108);
        ShioriLibrary.loanBook(Tim108, FSSV1);
        ShioriLibrary.borrowerReminder("Please return this book ASAP.");
        assert(Tim108.getMsgList().isEmpty() == false);
    }
    
    /**
     * Tests the counting of resources in the library's catalogue.
     */
    @Test
    public void testCountResources()
    {
        ShioriLibrary.addToCatalogue(FSSV1);
        assertEquals(1, ShioriLibrary.countResources());
    }
}





