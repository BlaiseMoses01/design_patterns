import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * @author BlaiseMoses01
 * state class for French
 */
public class FrenchState implements StateInterface{
    private MusicBox box;
    /**
    * constructor class, takes in an instance of music box and initializes the class's MusicBox variable for data manipulation.
    */
    public FrenchState(MusicBox box){
        this.box = box;
    }
    /**
     * loads the lyrics of Twinkle Twinkle in French into an ArrayList and uses it to call the MusicBox's playSong method.
     */
    public void pressStarButton(){
        ArrayList<String> lyrics = populateArrayList("TwinkleFrench.txt");
        box.playSong("petite étoile scintillante scintillante", lyrics);
    }
    /**
     * loads the lyrics of Happy and You Know it in French into an ArrayList and uses it to call the MusicBox's playSong method.
     */
    public void  pressHappyButton(){
        ArrayList<String> lyrics = populateArrayList("HappyFrench.txt");
        box.playSong(" Si Tu as D' la Joie au Coeur", lyrics);
    }
    /**
     * sets MusicBox's state to English
     **/
    public void pressEnglishButton(){
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
    /**
     * sets MusicBox's state to Spanish
     **/
    public void pressSpanishButton(){
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
    /**
     * notifies user they are in French state
     * */
    public void pressFrenchButton(){
        System.out.println("you are already in French mode");
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