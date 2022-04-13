
/**
 * Superclass for all book resources.
 * 
 * @author Meenah the Fish
 * @version 1.0
 */
public class Book extends LibResource
{
    // Author of the resource.
    private String author;
    // Title of the resource.
    private String title;
    // Book or ebook publisher.
    private String publisher;
    // Flags whether it's a print (false) or electronic resource (true).
    private boolean isEresource;
    // 4-digit number for the year published.
    private int yearPublished;


    /**
     * Constructor for objects of class LibResource.
     */
    public Book()
    {
        super(); 
        author = "No author set.";
        title = "No title set.";
        publisher = "No publisher set.";
        isEresource = false;
        yearPublished = 0;
    }

    /**
    * Constructor for objects of class LibResource that takes in parameters.
    * The userAccessing parameter is always initialised as 'null'.
    * The isEresource parameter is initialised as 'false' and then
    * changed by the subclasses.
    *
    * @param    author          The resource's author.
    * @param    title           The resource's title.
    * @param    publisher       The resource's publisher.
    * @param    isEresource     Indicates whether it is an online resource (true) or in print (false).
    * @param    yearPublished   The year of publication.
    * @param    isAvailable     Whether the resource is available (true) or on loan (false).
    * @param    location        The location of the resource.
    */
    public Book(String author, String title, String publisher, int yearPublished, String location, long resourceId)
    {
        super(location, resourceId);
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.isEresource = false;
        this.yearPublished = yearPublished;
    }
    
    /**
    * Method to set the author.
    * 
    * @param   author   The resource's author (if any).
    */
    public void setAuthor(String author)
    {
        this.author = author;
    }

    /**
     * Method to get the author.
     * 
     * @return  author  The resource's author.
     */
    
    public String getAuthor()
    {
        return author;
    }    
    
    /**
    * Method to set the title.
    * 
    * @param   title   The resource's title (if any).
    */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * Method to get the title.
     * 
     * @return  title  The resource's title.
     */
    
    public String getTitle()
    {
        return title;
    }     
    
    /**
     * Method to set the publisher.
     * 
     * @param   publisher   The name of the publisher.
     */
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    
    /**
     * Method to get the publisher.
     * 
     * @return  publisher   The resource's publisher.
     */
    public String getPublisher()
    {
        return publisher;
    }
    
    /**
    * Method to set whether the resource is online or not (not for devices!).
    * 
    * @param   isEresource   True if it is an online resource, false if it's in print.
    */
    public void setIfEresource(boolean isEresource)
    {
        this.isEresource = isEresource;
    }
    
    /**
    * Method to check book is in print or online.
    * 
    * @return   isEresource     Whether the resource is online (true) or in print (false).
    */
    
    public boolean checkIfEResource()
    {
        return isEresource;
    }    
    
    /**
     * Method to set year of publication. 
     * 
     * @param   yearPublished    An int with four digits.
     */
    
    public void setYearPublished(int yearPublished)
    {
        int yearLength = String.valueOf(yearPublished).length();
        if(yearLength <= 4) {
            this.yearPublished = yearPublished;           
        }
        
        else {
            System.out.println("Invalid year. Please input a number with up to 4 digits.");
        }
    }

    /**
    * Method to get the year of publication.
    * 
    * @return  yearPublished   The year of publication.
    */
    public int getYear()
    {
        return yearPublished;
    }
    
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
        }
    }
}
