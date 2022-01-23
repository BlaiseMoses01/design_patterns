import java.util.HashMap;
/**
*interface for Observer classes, requires the update method so that the vote totals and percentages are easily modifiable/updatable.
*/
public interface Observer{
    public void update(HashMap<String,Integer> votes);
}
