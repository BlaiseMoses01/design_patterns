import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * @author BlaiseMoses01
 * state class for Spanish printing mode
 */
public class SpanishState implements StateInterface{
    private MusicBox box;
   /**
    * constructor class, takes in an instance of music box and initializes the class's MusicBox variable for data manipulation.
    */
    public SpanishState(MusicBox box){
        this.box = box;
    }
    /**
     * loads the lyrics to twinkle twinkle in spanish into an arraylist and calls the play method of the MusicBox
     **/ 
    public void pressStarButton(){
        ArrayList<String> lyrics = populateArrayList("TwinkleSpanish.txt");
        box.playSong("brilla brilla pequeña estrella", lyrics);
    }
    /**
     * loads the lyrics of Happy and you know it in spanish into an arraylist and calls the play method of the MusicBox
     */
    public void pressHappyButton(){
        ArrayList<String> lyrics = populateArrayList("HappySpanish.txt");
        box.playSong("si estás contento y lo sabes", lyrics);
    }
    /**
     *  sets the musicBox's state to English
     */
    public void pressEnglishButton(){
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
    /**
     * notifies the user they are in Spanish mode.
     */
    public void pressSpanishButton(){
        System.out.println("You are already in Spanish Mode");
    }
    /**
     * sets MusicBox state to French
     */
    public void pressFrenchButton(){
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
    /**
     * loads the contents of a passed in file address into an arraylist and returns said arrayList
     * @return an ArrayList<String> containing the contents of a passed in file.
     */
    public ArrayList<String> populateArrayList(String filename){
       
        Scanner scanner = new Scanner(System.in);
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ArrayList<String> ret = new ArrayList<String>();
        while(scanner.hasNextLine())
            ret.add(scanner.nextLine());
        
        return ret;
    }

}