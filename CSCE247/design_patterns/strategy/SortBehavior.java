import java.util.ArrayList;
/**
  * interface for sorting behavior, allows the ArrayLists of instances of Listing to be sorted in different ways without the need for modification of the Listing class
  */
public interface SortBehavior {
    public ArrayList<String> sort(ArrayList<String> data);
}

