import java.util.ArrayList;
/**
 * Class to create , modify, and print instances of Exercises
 * @author BlaiseMoses01
 */
public class Exercise {
   private String title;
   private ArrayList<String> targetMuscles;
   private ArrayList<String> directions;
   public Exercise(String title){

   }
   /**
    * initializes instance variables to allow for data manipulation
    */
   public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions){
        this.title=title;
        this.targetMuscles =targetMuscles;
        this.directions = directions;
   }
   /**
    * adds a passed in String to the class's targetMuscles ArrayList
    */
   public void addTargetMuscle(String muscle){
        targetMuscles.add(muscle);
   }
   /**
    * removes a passed in String from the class's targetMuscles ArrayList
    */
   public void removeTargetMuscle(String muscle){
    for(int i=0;i<targetMuscles.size();i++){
        if(muscle == targetMuscles.get(i))
            targetMuscles.remove(i);
    }
   }
   /**
    * Creates a formatted String representation of an instance of Exercise's targetMuscles and directions ArrayLists as
    * well as the exercise's title. 
    *@return a String representation of an instance of Exercise's title, targeted muscles, and directions.
    */
   public String toString(){
        String retString="";
        retString += "\n..."+title+"...\n";
        retString += "Muscles: ";
        for(int i=0;i<targetMuscles.size();i++)
            retString += ", "+targetMuscles.get(i);
        retString += "\nExcercises:\n";
        for(int i=0;i<directions.size();i++)
            retString += "-"+directions.get(i)+"\n";
        return retString;
   }
}