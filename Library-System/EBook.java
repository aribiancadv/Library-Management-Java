import java.util.ArrayList;

/**
 * This class stores information about an electronic book.
 *
 * @author Meenah the Fish
 * @version 1.0
 */
public class EBook extends Book
{
    // A list of devices which can access the resource.
    private ArrayList<Device> devicesList;

    /**
     * Constructor for objects of class EBook.
     */
    public EBook()
    {
        super();
        this.devicesList = new ArrayList<>();
        this.setIfEresource(true);
    }
    
    /**
    * Constructor for objects of class EBook.
    * It does not take the userAccessing parameter
    * as that can be modified by setter method
    * and should default to null.
    *
    * @param    author          The resource's author.
    * @param    title           The resource's title.
    * @param    publisher       The resource's publisher.
    * @param    isEresource     Indicates whether it is an online resource (true) or in print (false).
    * @param    yearPublished   The year of publication.
    * @param    isAvailable     Whether the resource is available (true) or on loan (false).
    * @param    location        The location of the resource.
    */
    public EBook(String author, String title, String publisher, int yearPublished, String location, long resourceId)
    {
        super(author, title, publisher, yearPublished, location, resourceId);      
        this.devicesList = new ArrayList<>();
        this.setIfEresource(true);
    }

    /**
     * This method adds a device to the ArrayList
     * of devices that can access this resource.
     */
    
    public void addDevice(Device device)
    {
        if(device == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {
            devicesList.add(device);    
        }
    }
    
    /**
     * Get the list of compatible devices.
     * 
     * @return  devicesList   The ArrayList of compatible devices.
     */
    
    public ArrayList<Device> getDevicesList()
    {
        return devicesList;
    }    
}
