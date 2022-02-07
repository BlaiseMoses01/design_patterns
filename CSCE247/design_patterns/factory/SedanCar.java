/**
 * Child class of car , used when user inputted type is Sedan 
 * @author BlaiseMoses01
 */
public class SedanCar extends Car{
   /**
    * creates instance variables to allow for data manipulation
    */
    public SedanCar(String make, String model){
         this.make= make;
         this.model= model;
     }
     /**
      * adds frame to instances of Car of Sedan type, outputs to the user that the frame has been added
      */
     public void addFrame(){
         System.out.println("Adding a three part frame");
         return;
     }
     /**
      * adds all accessories that come standard on a Sedan Car to the accessories ArrayList of the instance of car.
      */
     public void addAccessories(){
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
         return;
     }
}