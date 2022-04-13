import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

/**
 * This class stores information about Inbox objects.
 * It provides sender and timestamp fields
 * for the subclasses Message and Notifications.
 *
 * @author Meenah the Fish
 * @version 1.0
 */
public class Inbox
{
    // The message/notification sender.
    private String sender;
    // The timestamp for the message or notification.
    private LocalTime timestamp;


    /**
     * Constructor for objects of class Inbox.
     */
    public Inbox()
    {
        this.sender = "No sender set.";
        this.timestamp = null;

    }
    
    /**
     * Constructor for objects of class Inbox.
     * 
     * @param   sender  The inbox obj sender.
     */
    public Inbox(String sender)
    {
        this.sender = sender;
        this.timestamp = LocalTime.now();
 
    }

    /**
     * Method to set the Inbox obj sender.
     * 
     * @param   sender  The Inbox obj sender.
     */
    public void setSender(String sender)
    {
        this.sender = sender;
    }
    
    /**
     * Method to get the Inbox obj sender.
     * 
     * @return  sender  The Inbox obj sender.
     */
    public String getSender()
    {
        return sender;
    }    
    
    /**
     * Method to set the timestamp, automatically sets it
     * to the current system time.
     */
    public void setTimestamp()
    {
        this.timestamp = LocalTime.now();
    }
    
    /**
     * Method to get the Inbox obj timestamp.
     * 
     * @return  timestamp  The Inbox obj timestamp.
     */
    public LocalTime getTimestamp()
    {
        return timestamp;
    }
    
    
    
    
    
    
    
    
}
