
import java.util.Iterator;
/**
 * class implementing java.util.Iterator to serve as an iterator for passed in Exercise arrays.
 * @author BlaiseMoses01
 */
public class ExerciseIterator implements Iterator{
    private Exercise[] exercises;
    private int position=0;
    /**
     * creates instance variables to allow data manipulation
     */
    public ExerciseIterator(Exercise[] exercises){
           this.exercises = exercises;
    }
    /**
     * determines if the exercise array has another value following the current one, and returns a corresponding boolean value
     * @return a boolean value indicating if the array contains an additonal value
     */
    public boolean hasNext(){
        if(position >= exercises.length || exercises[position] == null)
            return false;
        else
            return true;
    }
    /**
     * method for iterating to the next value in an array
     * @return the next Exercise contained in the Exercise array
     */
    public Exercise next(){
        Exercise exercise = exercises[position];
        position++;
        return exercise;
    }

}