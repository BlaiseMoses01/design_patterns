import java.util.HashMap;
import java.util.ArrayList;
/**
  * A StudentGovPoll class for creating and managing polls for student elections
  * @author BlaiseMoses01
  */
public class StudentGovPoll implements Subject{
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;
 /**
   * creates instance variables to allow for modification and data manipulation for instance objects;
   */
    StudentGovPoll(String school){
            this.observers=new ArrayList<Observer>();
            this.votes= new HashMap<String,Integer>();
            this.school= school;
            this.numUpdates = 0;
    }
    /**
     * adds instances of Observer classes to the observers ArrayList
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
        return;
    }
    /**
     * removes instances of Observer classes from the observer ArrayList
     */
    public void removeObserver(Observer observer){
        for(int i=0;i<observers.size();i++){
            if(observers.get(i) == observer)
                observers.remove(i);
        }
        return;
    }
    /**
     * notifies observers when four updates have been made to the votes HashMap
     */
    public void notifyObservers(){
        for(int i = 0 ; i < observers.size();i++){
            observers.get(i).update(votes);
         }
        this.numUpdates=0;
        return;
    }
    /**
     * adds presidential canidates to the votes HashMap to act as keys
     */
    public void addCandidate(String president){
        this.votes.put(president, 0);
        return;
    }
    /**
     * Updates vote totals for the corresponding canidates in the votes HashMap
     */
    public void enterVotes(String president,int num){
        votes.replace(president, votes.get(president)+ num);
        this.numUpdates++;
        if(numUpdates == 4){
            notifyObservers();
        }
        return;
    }
    /**
     * returns the name of the school the poll corresponds to
     */
    public String getSchool(){
        return this.school;
    }
 //referenced https://www.w3schools.com/java/java_hashmap.asp for help with HashMap syntax
}
