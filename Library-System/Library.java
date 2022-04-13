import java.util.ArrayList;
/**
 * This class stores a list of available Library objects and devices.
 * It also provides fields for the subclasses PrintBook, EBook and Device
 * 
 * @author Meenah the Fish
 * @version 1.0
 */
public class Library
{
    // The library's name.
    private String libraryName;
    // The list of library staff.
    private ArrayList<User> libStaff;
    // The list of all library users.
    private ArrayList<User> libUsers;
    // The catalogue of resources contained in the library.
    private ArrayList<LibResource> libCatalogue;
    

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        this.libraryName = "No library name set.";
        this.libStaff = new ArrayList<>();
        this.libCatalogue = new ArrayList<>();
        this.libUsers = new ArrayList<>();
    }

    /**
     * Constructor for objects of class Library
     * 
     * @param   libraryName     The library's name.
     */
    public Library(String libraryName)
    {
        this.libraryName = libraryName;
        this.libStaff = new ArrayList<>();
        this.libCatalogue = new ArrayList<>();
        this.libUsers = new ArrayList<>();
    }
    
    /**
     * Add a resource to the ArrayList for the library's catalogue.
     * 
     * @param   resource        A resource from the library.
     */
    
    public void addToCatalogue(LibResource resource)
    {
        if(resource == null) {
            System.out.println("ERROR: The object value cannot be null.");    
        }
        
        else{
            if(libCatalogue.contains(resource)) {
                System.out.println("ERROR: Resource already in catalogue.");
            }
            else {
                libCatalogue.add(resource);    
            }
        }
    }
    
    /**
     * Remove a resource from the library's catalogue.
     * 
     * @param   resource    A resource from the library.
     */
    public void removeFromCatalogue(LibResource resourceToSearch)
    {
        if(resourceToSearch == null) {
            System.out.println("ERROR: The object value cannot be null.");    
        }
        
        else {
            if(libCatalogue.contains(resourceToSearch)) {
                System.out.println("Resource has been removed.");
                libCatalogue.remove(resourceToSearch);
            }
            
            else if(libCatalogue.contains(resourceToSearch) == false) {
                System.out.println("ERROR: Resource not found in library catalogue.");
            }
        }
    }
    
    /**
     * Remove a resource from the library's catalogue,
     * at a specific position.
     * 
     * @param   resource    A resource from the library.
     * @throws  IndexOutOfBoundsException   Exception if the user tries to remove something at an empty index of the ArrayList.
     */
    public void removeFromCataloguePos(int catPosition) throws IndexOutOfBoundsException
    {
        if(catPosition < 0 || catPosition >= libCatalogue.size()) {
            throw new IndexOutOfBoundsException("ERROR: Resource not found in library catalogue.");

        }
        
        else {
            System.out.println("Resource at position " + catPosition + " has been removed.");
            libCatalogue.remove(catPosition);
        }
    }    
    
    /**
     * Get the catalogue ArrayList.
     * 
     * @return  libCatalogue    The library's catalogue.
     */
    public ArrayList<LibResource> getCatalogue()
    {
        return libCatalogue;
    }
    
    /**
     * Add a staff member to the ArrayList for the library's staff.
     * 
     * @param   user    A user object.
     */
    
    public void addToStaff(User user)
    {
        if(user == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        else {
            libStaff.add(user);    
        }
    }
    
    /**
     * Get the staff ArrayList.
     * 
     * @return  libStaff    The library's staff.
     */
    public ArrayList<User> getStaff()
    {
        return libStaff;
    }
    
    /**
     * Add a user to the ArrayList for the library's staff.
     * 
     * @param   user    A user object.
     */
    
    public void addToUsers(User user)
    {
        if(user == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {
            libUsers.add(user);
        }
    }
    
    /**
     * Get the user ArrayList.
     * 
     * @return  libUsers    The library's staff.
     */
    public ArrayList getUsers()
    {
        return libUsers;
    }    
    
    /**
     * Check if the catalogue contains a resource.
     * 
     * @param   resource    A library resource.
     */
    public boolean checkIfInCatalogue(LibResource resourceToSearch)
    {
        boolean inCatalogue = false;
        if(resourceToSearch == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {

            if(libCatalogue.contains(resourceToSearch)) {
                inCatalogue = true;
                return inCatalogue;
            }
            else {
                inCatalogue = false;
                return inCatalogue;
            }
            
        }
        return inCatalogue;
    }
    
    /**
     * Change the title or name of a resource.
     * 
     * @param   resource    The resource object to edit.
     * @param   titleName       The resource's new title or name.
     */
    public void editResourceName(LibResource resource, String titleName)
    {
        if(resource == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {
            if(checkIfInCatalogue(resource) == true) {
                if(resource instanceof Book) {
                    ((Book)resource).setTitle(titleName);
                }
                
                else {
                    ((Device)resource).setDeviceName(titleName);
                }
            }
            else {
                System.out.println("ERROR: Resource not found in library catalogue.");
            }
        } 
    }
    
    /**
     * Search the catalogue for a resource.
     * 
     * @param   resource    The resource object to search for.
     */
    public LibResource findResource(LibResource resourceToSearch)
    {
        LibResource result = null;
        if(resourceToSearch == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {

            if(libCatalogue.contains(resourceToSearch)) {
                result = resourceToSearch;
                return result;
            }
        }
        return result;
    }    
    
    /**
     * Prints the full details of all objects with a matching ISBN.
     * 
     * @param   isbn    The ISBN to search for.
     */
    public void searchByIsbn(long isbn)
    {
  
        int resourcesFound = 0;
        for(LibResource resource : libCatalogue) {
            if(resource instanceof PrintBook) {
                if(((PrintBook)resource).getIsbn() == isbn) {
                    ((Book)resource).displayBookDetails();
                    System.out.println("\n");
                    resourcesFound++;
                }

            }
        }
      System.out.println("Print books found: " + resourcesFound);        
    }
        
    
    /**
     * Search the catalogue by author's name and print
     * the results.
     * 
     * @param   author    The resource object to search for.
     */
    public void searchByAuthor(String author)
    {
        int resourcesFound = 0;
        for(LibResource resource : libCatalogue) {
            if(resource instanceof Book) {
                if(((Book)resource).getAuthor() == author) {
                    ((Book)resource).displayBookDetails();
                    System.out.println("\n");
                    resourcesFound++;
                }
            
            }
        }
        System.out.println("Books found: " + resourcesFound);
    } 
    
    /**
     * Print the details of all available books in the catalogue.
     */
    public void listAvailableResources()
    {
        System.out.println("Books found: ");
        for(LibResource resource : libCatalogue) {
            if(resource instanceof Book) {
                if(((Book)resource).checkAvailability() == true) {
                    ((Book)resource).displayBookDetails();
                    System.out.println("\n");
                    
                }
            
            }
        }
        System.out.println("Devices found: ");
        for(LibResource resource : libCatalogue) {
            if(resource instanceof Device) {
                if(((Device)resource).checkAvailability() == true) {
                    ((Device)resource).displayDeviceDetails();
                    System.out.println("\n");
                    
                }
            
            }
        }        
    }
    
    /**
     * Return the total number of resources in the catalogue.
     */
    public int countResources()
    {
        int result = 0;
        for(LibResource resource : libCatalogue) {
            result++;
        }
        return result;
    }
    
    /**
     * Loans out a book from the catalogue.
     * 
     * @param   user    A user of the library.
     * @param   book    A book to be borrowed.
     */
    
    public void loanBook(User user, Book book)
    {
        if(user == null || book == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {
            if(libCatalogue.contains(book)) {
                if(user.getNumberBooksBorrowed() < 5) {
                    if(book.getIsAvailable() == true) {
                        user.addBorrowedResource(book);
                    }
                    
                    else if(book.getIsAvailable() == false) {
                        System.out.println("The requested book is on loan.");
                    }
                }
                else if(user.getNumberBooksBorrowed() >= 5) {
                    System.out.println("The user has borrowed 5 books, and cannot borrow any more until at least one book is returned.");
                }
            }
                
            else if(libCatalogue.contains(book) == false) {
                System.out.println("ERROR: Book not found in the library catalogue.");
            }
        }
    }
    
    /**
     * Accepts a book return.
     * 
     * @param   book                The book to be returned.
     * @param   conditionChange     Boolean to indicate if the condition has changed (true) or not (false).
     * @param   damageDesc          Description of the damages to the book, if any.
     * 
     */
    public void returnBook(Book book, boolean conditionChange, String damageDesc)
    {
        if(book == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {
            if(libCatalogue.contains(book)) {
                if(conditionChange == true && book instanceof PrintBook) {
                    ((PrintBook)book).setCondition(damageDesc);
                }
                
                else if(book instanceof EBook) {
                    System.out.println("Book is an electronic resource, damage info discarded.");
                }
                
                User borrower = book.getUserAccessing();
                borrower.removeBorrowedResource(book);
                
            }
                
            else {
                System.out.println("ERROR: Book not found in the library catalogue.");
            }
        }
    }
    
    /**
     * Sends a message to all library users.
     * 
     * @param   reminder    A message to all library users.
     */
    public void borrowerReminder(String reminder)
    {
        Message reminderMsg = new Message("Strathclyde Library", reminder);
        
        for(User user : libUsers) {
            boolean hasPrintBook = false;
            for(LibResource resource : user.getBorrowedList()) {
                if(resource instanceof PrintBook) {
                    hasPrintBook = true;
                }
                else {
                    hasPrintBook = false;
                }
            
                
            }
            if(hasPrintBook == true) {
                user.addInboxObj(reminderMsg);
            }
            
        }
    }
    
    
    /**
     * This method prints the details of every physical book in the catalogue.
     */
    
    public void displayAllPrintBooks()
    {
        System.out.println("Print Books in Library Catalogue: ");
        System.out.println("\n");
        for(LibResource resource : libCatalogue) {
            if(resource instanceof PrintBook) {
                ((PrintBook)resource).displayBookDetails();
                System.out.println("\n");
            }

            
        }
    }
    
    /**
     * This method prints the details of every physical book in the catalogue.
     */
    
    public void displayAllEBooks()
    {
        System.out.println("E-Books in Library Catalogue: ");
        System.out.println("\n");
        for(LibResource resource : libCatalogue) {
            if(resource instanceof EBook) {
                ((EBook)resource).displayBookDetails();
                System.out.println("\n");
            }

            
        }
    }
}   



