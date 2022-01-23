/**
* interface for Subject, creating the methods necessary to manage the Observer instances of each poll.
*@author BlaiseMoses01
*/

public interface Subject {
   public void registerObserver(Observer observer);
   public void removeObserver(Observer observer);
   public void notifyObservers();
}
