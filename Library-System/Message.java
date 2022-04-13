
/**
 * This class stores messages received by users.
 *
 * @author Meenah the Fish
 * @version 1.0
 */
public class Message extends Inbox
{
    // The text of the message.
    private String messageText;

    /**
     * Constructor for objects of class Message
     */
    public Message()
    {
        super();
        this.messageText = "No message text set.";
    }

    /**
     * Constructor for objects of class Message.
     */
    
    public Message(String sender, String messageText)
    {
        super(sender);
        this.messageText = messageText;
    }
    
    /**
     * Method to set the message text contents.
     * 
     * @param   messageText  The message's text.
     */
    public void addMessageText(String messageText)
    {
        this.messageText = messageText;
    }
    
    /**
     * Method to get the message text contents.
     * 
     * @return   messageText  The message's text.
     */
    public String getMessageText()
    {
        return messageText;
    }
    
    /**
     * Print the message and its details.
     */
    public void displayMsgDetails()
    {
        System.out.println("Sender: " + this.getSender());
        System.out.println("Message: " + this.getMessageText());
        System.out.println("Time Received: " + this.getTimestamp());
        System.out.println("\n");
    }
}
