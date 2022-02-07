import java.util.ArrayList;
/**
 * Abstract class for Type Car, handles the assembling of all components of every instance of car as well as provides the default
 * methods for adding components to each instance
 * @author BlaiseMoses01
 */
public abstract class Car{
    
    protected String make;
    protected String model;
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();
    /**
     * Calls all other methods of the class in order to compile the assembled car instance
     */
    public void assemble(){
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }
    /**
     * Abstract method for adding the frame to instances of car, specific implementations contained in child classes of Car
     */
    public abstract void addFrame();
    /**
     * method for adding the wheels to an instance of car, displays to the user that wheels were added.
     */
    public void addWheels(){
        System.out.println("Adding the Wheels");
    }
    /**
     * default method for adding engine to an instance of car, displays to the user the engine was added.
     */
    public void addEngine(){
        System.out.println("Adding a Standard Engine");
    }
    /**
     * method for adding windows to an instance of car, displays to the user that windows were added. 
     */
    public void addWindows(){
        System.out.println("Adding Windows");
    }
    /**
     * abstract method for adding accessories from Accessories Enum to the accessories ArrayList of an instance of car
     * specific implementations in child classes of Car.
     */
    public abstract void addAccessories();
    /**
     * Prints a list of an instance of Car's accessories ArrayList contents.
     */
    public void displayAccessories(){
        System.out.println("Accessories:");
        for(int i=0;i<accessories.size();i++){
            System.out.println("-"+accessories.get(i).toString());
        }
        System.out.println();
    }
}