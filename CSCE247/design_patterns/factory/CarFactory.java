/**
 * Class responsible for determining the type of car to be built and for initializing an appropriate instance of a Car
 * of the appropriate type
 * @author BlaiseMoses01 
 */
public class CarFactory{
    /**
     * determines the appropriate type of car to construct by comparing the inputted type to CarType enum class and 
     * then intializes and returns a car of that type.
     * @returns an instance of either SmallCar, SedanCar, or LuxuryCar depending on user input
     */
    public static Car createCar(String type, String make, String model){
        Car car = null;
        type=type.toUpperCase();
        System.out.println("Creating a "+make+" "+model);
        if(CarType.SMALL.toString().equalsIgnoreCase(type)){
            car=new SmallCar(make, model);
            car.assemble();
        }
        else if(CarType.SEDAN.toString().equalsIgnoreCase(type)){
            car=new SedanCar(make, model);
            car.assemble();
        }
        else{
            car=new LuxuryCar(make, model);
            car.assemble();
        }
        return car;
    }
}