import java.util.ArrayList;
/** 
 * An alphabetic sorting algorithm following the Insertion Sort method of data organization, implementing the Sort Behavior interface.
 * @author BlaiseMoses01 
*/
public class InsertionSort implements SortBehavior{
    /**
    * Takes in an ArrayList of the type String and sorts it in alphabetical order via an Insertion Sort algorithm
    * @return alphabetically sorted ArrayList of the type String
    */
    public ArrayList<String> sort(ArrayList<String> data){
       for(int i=1; i < data.size();i++){
           int j = i-1;
           String temp = data.get(i);
        while(j >= 0 && temp.compareToIgnoreCase(data.get(j)) <= 0){
        data.set(j+1, data.get(j));
        j--;
        }
        data.set(j+1, temp);
    }
    return data;
}
}

/*
 * Referenced https://www.geeksforgeeks.org/insertion-sort/ to refresh memory of basic syntax and skeleton struture of the insertion sort. Also referenced https://www.w3schools.com/java/java_arraylist.asp 
 * to refresh memory of java.util.ArrayList<> integrated commands and methods.
 */