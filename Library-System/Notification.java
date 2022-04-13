
/**
 * This class stores notifications received by users.
 *
 * @author Meenah the Fish
 * @version 1.0
 */
public class Notification extends Inbox

{
    // The text of the notification.
    private String notifText;

    /**
     * Constructor for objects of class Notification
     */
    public Notification()
    {
        super();
        this.notifText = "No notification text set.";
    }

    /**
     * Constructor for objects of class Notification.
     * 
     * @param   notifText     The notification's text.
     * @throws  IllegalArgumentException    Error thrown in case the notification created is too long.
     */
    
    public Notification(String sender, String notifText) throws IllegalArgumentException
    {
        super(sender);
        if(notifText.length() >= 141) {
            throw new IllegalArgumentException("ERROR: Input too long for a notification. Try a message instead!");
        }
        else {
            this.notifText = notifText;    
        }
    }
    
    /**
     * Method to set the message text contents.
     * 
     * @param   notifText  The notification's text.
     */
    public void addNotifText(String notifText)
    {
        int notifLength = notifText.length();
        if(notifLength >= 141) {
            System.out.println("ERROR: Input too long for a notification. Try a message instead!");
        }
        else {
            this.notifText = notifText;    
        }
    }
    
    /**
     * Method to get the notification text contents.
     * 
     * @return   notifText  The notification's text.
     */
    public String getNotifText()
    {
        return notifText;
    }
    
    /**
     * Print the message and its details.
     */
    public void displayNotifDetails()
    {
        System.out.println("Sender: " + this.getSender());
        System.out.println("Notification: " + this.getNotifText());
        System.out.println("Time Received: " + this.getTimestamp());
        System.out.println("\n");
    }
}
