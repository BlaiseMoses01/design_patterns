/**
 * Child class of Car, used when user inputted type is Small
 * @author BlaiseMoses01
 */
public class SmallCar extends Car{
   /**
    * creates instance variables to allow for data manipulation
    */
   public SmallCar(String make, String model){
        this.make=make;
        this.model=model;
    }
    /**
     * adds frame to instances of Car of type Small, outputs to the user the frame has been added.
     */
    public void addFrame(){
        System.out.println("Adding a small frame");
        return;
    }
    /**
     * adds all accessories that come standard on a Car of type Small to the instance of Car's accessories ArrayList.
     */
    public void addAccessories(){
       accessories.add(Accessories.FLOOR_MATTS);
       accessories.add(Accessories.PHONE_CHARGER);
        return;
    }
}