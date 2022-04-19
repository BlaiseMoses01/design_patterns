import java.util.ArrayList;
/**
 * @author BliaseMoses01
 * MusicBox class, handles state changes and plays songs to user.
 */
public class MusicBox{
private StateInterface englishState;
private StateInterface spanishState;
private StateInterface frenchState;
private StateInterface state;
/**
 * constructor class, initializes all states for use by user.Defaults current state to English
 */
public MusicBox(){
    System.out.println("Starting up the music box");
    this.englishState= new EnglishState(this);
    this.spanishState= new SpanishState(this);
    this.frenchState= new FrenchState(this);
    this.state = englishState;
}
/** 
 * sets the state of the music box based on a passed in state type.
*/
public void setState(StateInterface state){
    this.state = state;
}
/**
 * returns the music boxes EnglishState instance
 * @return instance of EnglishState
 */
public StateInterface getEnglishState(){
    return this.englishState;
}
/**
 * returns the music boxes SpanishState instance
 * @return instance of SpanishState
 */
public StateInterface getSpanishState(){
    return this.spanishState;
}
/**
 * returns the music boxes FrenchState instance
 * @return instance of FrenchState
 */
public StateInterface getFrenchState(){
    return this.frenchState;

}
/**
 * calls current state's pressStarButton method
 */
public void pressStarButton(){
    state.pressStarButton();
}
/**
 * calls current state's pressHappyButton method
 */
public void pressHappyButton(){
    state.pressHappyButton();
}
/**
 * calls current state's pressEnglishButton method
 */
public void pressEnglishButton(){
    state.pressEnglishButton();
}
/**
 * calls current state's pressSpanishButton method
 */
public void pressSpanishButton(){
    state.pressSpanishButton();
}
/**
 * calls current state's pressFrenchButton method
 */
public void pressFrenchButton(){
    state.pressFrenchButton();
}
/**
 * takes in a title and an arraylist of lyrics and prints the tile, then the song lyrics to the user.
 */
public void playSong(String songName, ArrayList<String> lyrics){
    System.out.print("Playing: ");
    System.out.print(songName+"\n");
    for(int i=0;i<lyrics.size();i++){
        System.out.println(lyrics.get(i));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}