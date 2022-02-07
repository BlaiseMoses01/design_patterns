
/**
 * Child class of Car , used when user inputted type is Luxury.
 * @author BlaiseMoses01
 */
public class LuxuryCar extends Car{
   /**
    * Creates instance variables of make and model variables to allow for data manipulation.
    */
   public LuxuryCar(String make, String model){
        this.make=make;
        this.model=model;
   }
   /**
    * method to add engine to instances of luxury cars, overrides default addEngine method in Car class and displays to the user
    that the engine has been added
    */
    public void addEngine(){
        System.out.println("Adding a Supped Up Engine");
    }
    /**
     * method to add frame to instances of luxury cars, displays to the user the frame has been added.
     */
    public void addFrame(){
        System.out.println("Adding a beautiful frame");
    }
    /**
     * adds all accessories that a luxury car comes standard with to the instance of Car's accessories ArrayList
     */
    public void addAccessories(){
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
        accessories.add(Accessories.SPORTS_SEATS);
        accessories.add(Accessories.WINDOW_TINT);
        accessories.add(Accessories.HIGH_END_SOUND);
        accessories.add(Accessories.TRUNK_ORGANIZER);
        accessories.add(Accessories.BLUE_TOOTH);
        return;
    }
}