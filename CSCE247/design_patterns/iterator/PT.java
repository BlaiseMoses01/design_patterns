import java.util.ArrayList;
import java.util.Iterator;
/**
 * Class to manage attributes of instances of PT(personal trainer)
 * @author BlaiseMoses01
 */
public class PT{
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises; 
    private int numExercises;
   /**
    * Creates instance variables to allow for data manipulation of private class variables.
    */
    public PT(String firstName, String lastName, String bio){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.numExercises=0;
        this.exercises = new Exercise[2];
    }
    /**
     * adds an Exercise to the instance of PT's exercises array, and initializes an array resizing if the Array is full
     * by calling the growArray() method
     */
    public void addExercise(String title, ArrayList<String> muscleGroups , 
    ArrayList<String> directions){
        Exercise exercise = new Exercise(title, muscleGroups, directions);
        if(numExercises < exercises.length){
             exercises[numExercises]=exercise;
             numExercises++;
        }
        if(numExercises + 1 >= exercises.length){
                exercises = growArray(exercises);
           }
        }
    /**
     * returns the String stored in the firstName variable
     * @return String stored in the firtName variable
     */
    public String getFirstName(){
        return this.firstName;
    }
    /**
     * returns the String stored in the lastName variable
     * @return String stored in the lastName variable
     */
    public String getLastName(){
        return this.lastName;
    }
    /**
     * returns the String stored in the bio variable
     * @return String stored in bio variable
     */
    public String getBio(){
        return this.bio;
    }
    /**
     * doubles the size of passed in array and copies the old array's contents into the resized array
     * @return an array containing the passed in array's contents and twice its size
     */
    public Exercise[] growArray(Exercise[] exercises){
        Exercise[] ret = new Exercise[exercises.length * 2];
        for(int i=0; i< exercises.length; i++){
            ret[i] = exercises[i];
        }
        return ret;
    }
    /**
     * initializes an instance of the ExerciseIterator class to serve as an Iterator.
     * @return and instance of the ExerciseIterator class with the exercises array passed in
     */
    public ExerciseIterator createIterator(){
         return new ExerciseIterator(exercises);
    }
    /**
     * Creates a String representation of the PT's name and bio
     * @return formatted String representsation of instance of PT name and bio
     */
    public String toString(){
        String retString="";
        retString += firstName + " "+ lastName+ "\n";
        retString += bio +"\n";
        return retString;
    }
}
