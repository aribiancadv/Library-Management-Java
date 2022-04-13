
/**
 * This class stores information about a device.
 *
 * @author Meenah the Fish
 * @version 1.0
 */
public class Device extends LibResource
{
    // The name of the device.
    private String deviceName;
    // The type of device it is
    private String deviceType;

    /**
     * Constructor for objects of class Device.
     * Takes no parameters.
     */
    public Device()
    {
        super();
        this.deviceName = "No device name set.";
        this.deviceType = "No device type set.";
    }
    
    /**
    * Constructor for objects of class Device.
    *
    * @param    isAvailable     Whether the resource is available (true) or on loan (false).
    * @param    location        The location of the resource.

    */
    public Device(String location, long resourceId, String deviceName, String deviceType)
    {
        super(location, resourceId);      
        this.deviceName = deviceName;
        this.deviceType = deviceType;
    }

    /**
     * This method sets the device's name.
     * 
     * @param   deviceName  The device's name.
     */
    
    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }
    
    /**
     * This method returns the device's name.
     * 
     * @return   deviceName  The device's name.
     */
    
    public String getDeviceName()
    {
        return deviceName;
    }    
    
    /**
     * This method sets the device's type.
     * 
     * @param   deviceType  The device's type.
     */
    
    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }
    
    /**
     * This method returns the device's type.
     * 
     * @return   deviceType  The device's type.
     */
    
    public String getDeviceType()
    {
        return deviceType;
    }
    
    /**
     * Print the device's details.
     */
    public void displayDeviceDetails()
    {
        System.out.println("Device name: " + deviceName);
        System.out.println("Type: " + deviceType);
        System.out.println("Location: " + this.getLocation());
        System.out.println("Resource ID: " + this.getResourceId());
    }
}
