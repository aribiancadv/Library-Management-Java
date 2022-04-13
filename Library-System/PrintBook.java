
/**
 * This class stores information about a print book.
 *
 * @author Meenah the Fish
 * @version 1.0
 */
public class PrintBook extends Book
{
    // A string indicating the book's condition. All other fields are inherited.
    private String condition;
    // ISBN number, must be between 10 and 13 digits.
    private long isbn;

    /**
     * Constructor for objects of class PrintBook.
     */
    public PrintBook()
    {
        super();
        this.condition = "No condition set.";
        this.setIfEresource(false);
    }
    
    /**
    * Constructor for objects of class PrintBook.
    * It does not take the userAccessing parameter
    * as that can be modified by setter method
    * and should default to null.
    * The constructor also sets the isEresource
    * parameter to 'false' automatically.
    *
    * @param    author          The resource's author.
    * @param    title           The resource's title.
    * @param    publisher       The resource's publisher.
    * @param    isbn            The ISBN of the resource in question.
    * @param    yearPublished   The year of publication.
    * @param    isAvailable     Whether the resource is available (true) or on loan (false).
    * @param    location        The location of the resource.
    * @param    condition       The book's condition.
    */
    public PrintBook(String author, String title, String publisher, long isbn, int yearPublished, String location, long resourceId, String condition)
    {
        super(author, title, publisher, yearPublished, location, resourceId);      
        this.condition = condition;
        this.isbn = isbn;
        this.setIfEresource(false);
    }

    /**
     * Method to set the book's condition.
     * 
     * @param   condition   The book's condition.
     */
    public void setCondition(String condition)
    {
        this.condition = condition;
    }
    
    /**
     * Method to get the book's condition.
     * 
     * @return  condition   The book's condition
     */
    public String getCondition()
    {
        return condition;
    }
    
    /**
     * Method to set ISBN. Note: the letter L
     * must be used at the end of the input number,
     * otherwise an error occurs.
     * 
     * @param   isbn    A long for the ISBN that is either 10 or 13 characters long.
     */
    
    public void setIsbn(long isbn)
    {
        int isbnLength = String.valueOf(isbn).length();
        if(isbnLength == 10 || isbnLength == 13) {
            this.isbn = isbn;           
        }
        
        else {
            System.out.println("Invalid ISBN. Please input a number with either 10 or 13 digits.");
        }
    }
    
    /**
    * Method to get the ISBN.
    * 
    * @return  isbn   The resource's ISBN.
    */
    public long getIsbn()
    {
        return isbn;
    }
    
    @Override
    /**
     * Method to print out all of the book's details.
     */
    
    public void displayBookDetails()
    {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Year: " + getYear());
        if(super.checkAvailability() == true) {
            System.out.println("Status: Available."); 
        }
        else {
            System.out.println("Status: On loan to " + getUserAccessing().getUsername());
        }
        System.out.println("Location: " + super.getLocation());
        if(checkIfEResource() == true) {
            System.out.println("Type: e-book.");    
        }
        else {
            System.out.println("Type: Print book.");
            System.out.println("ISBN: " + this.getIsbn());
        }
    }
}
