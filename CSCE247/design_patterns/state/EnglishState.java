import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * @author BlaiseMoses01
 * state class for English
 */
public class EnglishState implements StateInterface{
    private MusicBox box;
    /**
    * constructor class, takes in an instance of music box and initializes the class's MusicBox variable for data manipulation.
    */
    public EnglishState(MusicBox box){
        this.box = box;
    }
    /**
     * loads the lyrics to twinkle twinkle in English into an arraylist and calls the play method of the MusicBox
     **/ 
    public void pressStarButton(){
        ArrayList<String> lyrics = populateArrayList("TwinkleEnglish.txt");
        box.playSong("Twinkle Twinkle Little Star", lyrics);
        
    }
    /**
     * loads the lyrics to Happy and you know it in English into an arraylist and calls the play method of the MusicBox
     **/ 
    public void pressHappyButton(){
        ArrayList<String> lyrics = populateArrayList("HappyEnglish.txt");
        box.playSong("If You're Happy and You Know It", lyrics);
        
    }
    /**
     * notifies user they are in English Mode
     * */
    public void pressEnglishButton(){
        System.out.println("You are already in English Mode");
    }
    /**
     * sets MusicBox's state to Spanish
     * */
    public void pressSpanishButton(){
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
    /**
     * sets MusicBox's state to French
     * */
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