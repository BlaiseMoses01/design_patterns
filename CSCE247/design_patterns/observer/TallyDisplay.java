import java.util.HashMap;
/**
 * A class implementing the Observer Interface used to update and display vote totals 
 * for the corresponding poll.
 * @author BlaiseMoses01
 */
public class TallyDisplay implements Observer{
    private Subject poll;
    private HashMap<String,Integer> votes;
/**
 * creates instance variables to allow for modification and data manipulation for instance objects.
 */
    public TallyDisplay(Subject poll){
    this.poll=poll;
    this.poll.registerObserver(this);
    this.votes=new HashMap<String,Integer>();  
    }
    /**
     * updates the votes HashMap to match the HashMap passed into the class.
     */
    public void update(HashMap<String,Integer> votes){
    this.votes.putAll(votes);
    display();
    return;
    }
    /**
     * prints the current tallies of votes for each canidate using the updated HashMap
     */
    public void display(){
        System.out.println("\nCurrent Tallies:");
        for(String k: this.votes.keySet()){
            System.out.println(k+": "+this.votes.get(k));
        }
        return;
    }
}