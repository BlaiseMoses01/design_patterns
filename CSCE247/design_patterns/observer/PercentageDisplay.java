import java.util.HashMap;
import java.text.DecimalFormat;
/**
 * A class implementing the Observer Interface used to update and display vote percentages 
 * for the corresponding poll.
 * @author BlaiseMoses01
 */
public class PercentageDisplay implements Observer{
    private Subject poll;
    private HashMap<String,Integer> votes;
    private int numVotes;
  /**
    * creates instance variables to allow for modification and data manipulation for instance objects.
    */
    public PercentageDisplay(Subject poll){
       this.poll= poll;
       this.poll.registerObserver(this);
       this.votes=new HashMap<String,Integer>();
       this.numVotes=0;   
    }
    /**
     * gathers the total number of votes from the passed in Hashmap
     */
    public void update(HashMap<String,Integer> votes){
        for(String k : votes.keySet()){
            this.numVotes +=  votes.get(k);
        }
        for(String k: votes.keySet())
            this.votes.put(k, votes.get(k));
        display();
        return;
    }
    /**
     * Calculates and displays the current percentages of votes for each canidate in the poll
     */
    public void display(){
        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("\nCurrent Percent of Votes:");
        for(String k: this.votes.keySet()){
            double ret= this.votes.get(k);
            System.out.println(k + ": " + df.format((ret/numVotes)*100)+"%");
        }
    }
} 