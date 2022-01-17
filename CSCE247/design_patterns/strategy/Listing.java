import java.util.ArrayList;
/**
  * A Listing Class for creating Lists
  * @author BlaiseMoses01
  */

public class Listing{
    private String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;

 /**
   * creates instance variables to allow for modification and data manipulation for instance objects;
   */

 public Listing(String title){
    this.title = title;
    this.sortBehavior = new BubbleSort();
    this.items = new ArrayList<String>();
}

/**
  * takes in a String and adds it to the ArrayList of an instance of Listing;
  */

  public void add(String item){
    items.add(item);
}

/**
  * Takes in a String and removes all instances of it from the ArrayList of an instance of Listing.
  */

  public void remove(String item){
   for(int i=0; i < items.size() ; i++){
        if (items.get(i) == item)
            items.remove(i);
   }
}
/**
 * returns the title of an instance of Listing
 * @return title of an instance of listing
 */

public String getTitle(){
 return this.title;
}

/**
  * takes in a desired sorting behavior  and sets the sort behavior of an instance of Listing to that behavior.
  */ 

  public void setSortBehavior(SortBehavior sortBehavior){
    this.sortBehavior = sortBehavior;
}

/**
  * sorts the ArrayList items of an instance of Listing by the sortBehavior the instance has stored
  * @return alphabetically sorted ArrayList items of an instance of Listing
  */

 public ArrayList<String> getSortedList(){
    return sortBehavior.sort(this.items);
}
/**
 * returns the raw(unsorted) ArrayList items of an instance of Listing
 * @return unsorted ArrayList items of an instance of Listing
 */

 public ArrayList<String> getUnsortedList(){
    return items;
}
}