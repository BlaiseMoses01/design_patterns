
import java.util.ArrayList;
/** 
 * An alphabetic sorting algorithm following the Bubble Sort method of data organization, implementing the Sort Behavior interface.
 * @author BlaiseMoses01 
*/

 
public class BubbleSort implements SortBehavior{
   /**
    * Takes in an ArrayList of the type String and sorts it in alphabetical order via a Bubble Sort algorithm
    * @return alphabetically sorted ArrayList of the type String
    */ 
    public  ArrayList<String> sort(ArrayList<String> data){
        String ret =" ";
        for(int i=0;i<data.size()-1;i++){
          for(int j=i+1; j < data.size();j++){
            if(data.get(i).compareToIgnoreCase(data.get(j)) > 0){
                ret=data.get(j);
                data.set(j, data.get(i));
                data.set(i, ret);
            }
          }
       }
       return data;
    }
 }

 /*
  * Referenced https://www.geeksforgeeks.org/bubble-sort/ to refresh myself on the basic syntax and skeleton struture of the Bubble Sort method. Also referenced https://www.w3schools.com/java/java_arraylist.asp 
  * to refresh memory of java.util.ArrayList<> integrated commands and methods.
 */