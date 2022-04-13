
/**
 * Superclass for all library resources.
 * 
 * @author Meenah the Fish
 * @version 1.0
 */
public class LibResource
{
    // Shows true if available, false if not.
    private boolean isAvailable;
    // String shows the location of the resource.
    private String location;
    // Field for the user (User-class obj) accessing, null if none.
    private User userAccessing;
    // Unique ID number for the resource.
    private long resourceId;

    /**
     * Constructor for objects of class LibResource.
     */
    public LibResource()
    {
        this.isAvailable = true;
        this.location = "No location set.";
        this.userAccessing = null;
        this.resourceId = 1234567890L;
    }
    
    /**
     * Constructor for objects of class LibResource that takes in parameters.
     * It does not take a parameter for userAccessing,
     * as that should be 'null' by default.
     * The isAvailable field initialises to 'true' always,
     * and is then changed by setter methods as needed.
     * 
     * @param   isAvailable     Whether the resource is available (true) or on loan (false).
     * @param   location        The resource's location.
     * @param   resourceId      Unique ID number for this resource.
     */
    public LibResource(String location, long resourceId)
    {
        this.isAvailable = true;
        this.location = location;
        this.userAccessing = null;
        this.resourceId = resourceId;
    }    
    
    /**
    * Method to set whether the resource is available or on loan.
    * 
    * @param   isAvailable   True if it is available, false if it's not.
    */
    public void setIsAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    
    /**
     * Method to get the isAvailable boolean.
     * 
     * @return  isAvailable     Whether the resource is available or not.
     */
    public boolean getIsAvailable()
    {
        return isAvailable;
    }
    
    /**
    * Method to set the user accessing the resource.
    * 
    * @param   userAccessing   A user that currently is accessing the resource.
    */
    public void setUserAccessing(User userAccessing)
    {
        if(userAccessing == null) {
            System.out.println("ERROR: The object value cannot be null.");
        }
        
        else {
            this.userAccessing = userAccessing;
            this.isAvailable = false;
        }
        
    }

    /**
    * Method to get the User accessing the resource.
    */
    public User getUserAccessing()
    {
        return userAccessing;
    }    
    
    /**
    * Method to check a resource's availability.
    */
    
    public boolean checkAvailability()
    {
        if(userAccessing == null) {
            isAvailable = true;
        }
        
        else {
            isAvailable = false;
        }
        return isAvailable;
    }    

    /**
    * Method to set the location.
    * 
    * @param   location   The resource's location.
    */
    public void setLocation(String location)
    {
        this.location = location;
    }        
    
    /**
    * Method to get the resource's location.
    * 
    * @return  location   The resource's location.
    */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Set the resource ID.
     * 
     * @param   resourceId      The resource's ID number.   
     */
    public void setResourceId(long resourceId)
    {
        this.resourceId = resourceId;
    }
    
    /**
     * Get the resource ID.
     * 
     * @return  resourceId      The resource's ID number.
     */
    public long getResourceId()
    {
        return resourceId;
    }
}

    