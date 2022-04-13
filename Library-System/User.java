import java.util.ArrayList;
import java.util.List;

/**
 * This class stores information about library users.
 *
 * @author Meenah the Fish
 * @version 1.0
 */
public class User
{
    // The user's name.
    private String username;
    // List of resources the user has borrowed.
    private ArrayList<LibResource> resourcesBorrowed;
    // The user's ID number.
    private int id;
    // The list of messages contained in the inbox.
    private ArrayList<Message> messages;
    // The list of notifications contained in the inbox.
    private ArrayList<Notification> notifications;
    // The text of all messages in one place.
    private String allMsgTxt;
    // The text of all notifications in one place.
    private String allNotifTxt;

    /**
     * Constructor for objects of class User.
     */
    public User()
    {
        this.username = "No username set.";
        this.id = 0;
        this.resourcesBorrowed = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.notifications = new ArrayList<>();
        this.allMsgTxt = "";
        this.allNotifTxt = "";
    }
    
    /**
     * Constructor for objects of class User.
     * 
     * @param username              The user's name.
     * @param id                    User's ID number. 
     */
    public User(String username, int id)
    {
        this.username = username;
        this.id = id;
        this.resourcesBorrowed = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.notifications = new ArrayList<>();
        this.allMsgTxt = "";
        this.allNotifTxt = "";
    }

    /**
     * Modify the user's name.
     * 
     * @param newUsername     The new user's name.
     */
    public void modifyUsername(String newUsername)
    {
        username = newUsername;
    }
    
    /**
     * Return the user's name.
     *
     * @return  username  The user's name.
     */
    public String getUsername()
    {
        return username;
    }
    
    /**
     * Modify the user's ID.
     * 
     * @param   newID     The new user's ID.
     */
    public void modifyId(int newId)
    {
        id = newId;
    }
    
    /**
     * Return the user's ID.
     *
     * @return  id  The user's ID.
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * This method adds a resource to the ArrayList
     * of resources borrowed.
     * 
     * @param   resource        A resource the user has borrowed.
     * @param   userAccessing   The user accessing the resource.
     *    
     */
    
    public void addBorrowedResource(LibResource resource)
    {
        if(resource == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {
            if(resource instanceof Book) {
                if(this.getNumberBooksBorrowed() < 5) {
                    resourcesBorrowed.add(resource);
                    resource.setIsAvailable(false);
                    resource.setUserAccessing(this);
                }
                
                else if(this.getNumberBooksBorrowed() >= 5) {
                    System.out.println("The user has borrowed 5 books, and cannot borrow any more until at least one book is returned.");
                }
            }
            
            else {
                resourcesBorrowed.add(resource);
                resource.setIsAvailable(false);
                resource.setUserAccessing(this);
            }
        }
    }
    
    /**
     * Remove a borrowed resource.
     * 
     * @param   resource    A resource the user has borrowed.
     */
    public void removeBorrowedResource(LibResource resource)
    {
        if(resource == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {
            resourcesBorrowed.remove(resource);
            resource.setIsAvailable(true);
            resource.setUserAccessing(null);
        }
    }
    
    /**
     * This method returns the ArrayList containing resources borrowed.
     * 
     * @return  resourcesBorrowed   The ArrayList of resources borrowed.
     */
    
    public ArrayList<LibResource> getBorrowedList()
    {
        return resourcesBorrowed;
    }
    
    /**
     * This method adds a mesage or notification to the
     * corresponding ArrayList. It also concatenates it
     * to the corresponding String field.
     * 
     * @param   inboxObj    A message or notification.
     *    
     */
    
    public void addInboxObj(Inbox inboxObj)
    {
        if(inboxObj == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        else {
        
            if(inboxObj instanceof Message) {
                messages.add((Message)inboxObj);
                this.allMsgTxt = this.allMsgTxt + "\n" + ((Message)inboxObj).getMessageText();
            }
            
            else if(inboxObj instanceof Notification) {
                notifications.add((Notification)inboxObj);
                this.allNotifTxt = this.allNotifTxt + "\n" + ((Notification)inboxObj).getNotifText();
            }
        }
    }
    
    /**
     * This method returns the ArrayList containing messages.
     * 
     * @return  messages   The ArrayList of a user's messages.
     */
    
    public ArrayList<Message> getMsgList()
    {
        return messages;
    }   
    
    /**
     * This method returns the ArrayList containing notifications.
     * 
     * @return  notifications   The ArrayList of a user's notifications.
     */
    
    public ArrayList<Notification> getNotifList()
    {
        return notifications;
    }
   
    /**
     * This method prints all the details of the Library user.
     */
    
    public void displayUserDetails()
    {
        System.out.println("Name: " + this.getUsername());
        System.out.println("ID No.: " + this.getId());
        System.out.println("Resources borrowed/in use: ");
        for(LibResource resource : resourcesBorrowed) {
            if(resource instanceof Book) {
                System.out.println(((Book)resource).getTitle());
            }
            
            else {
                System.out.println(((Device)resource).getDeviceName());
            }
            
        }
    }
    
    /**
     * This method prints the details of every book borrowed
     * by the Library user.
     */
    
    public void displayBorrowedBookDetails()
    {
        System.out.println("Books borrowed/in use: ");
        System.out.println("\n");
        for(LibResource resource : resourcesBorrowed) {
            if(resource instanceof Book) {
                ((Book)resource).displayBookDetails();
                System.out.println("\n");
            }

            
        }
    }
    
       
    /**
     * Method to get the number of books borrowed by the library user.
     * 
     * @return  booksBorrowed   The number of books currently borrowed by the user.
     */
    
    public int getNumberBooksBorrowed()
    {
        int booksBorrowed = 0;
        for(LibResource resource : resourcesBorrowed) {
            if(resource instanceof Book) {
                booksBorrowed++;
            }
        }
        
        return booksBorrowed;
    }
    
    
    
    /**
     * Get the string that contains all messagesreceived by user.
     * 
     * @return  allMsgTxt   A string containing all messages received by a user.
     */
    public String getAllMessages()
    {
        return allMsgTxt;
    }
    
    /**
     * Get the string that contains all notifications received by user.
     * 
     * @return  allNotifTxt   A string containing all notifications received by a user.
     */
    public String getAllNotifs()
    {
        return allNotifTxt;
    }
    
    /**
     * Print the text of all messages received by user.
     */
    public void displayAllMsgTxt()
    {
        System.out.println(this.allMsgTxt); 
    }
    
    /**
     * Print the text of all notifications received by user.
     */
    public void displayAllNotifTxt()
    {
        System.out.println(this.allNotifTxt);
    }
    
    /**
     * Print the details of every message received by user.
     */
    public void displayAllMessages()
    {
        for(Message message : messages) {
            message.displayMsgDetails();
        }
    }
    
    /**
     * Print the details of every notification received by user.
     */
    public void displayAllNotifs()
    {
        for(Notification notification : notifications) {
            notification.displayNotifDetails();
        }
    }

}
