import java.util.HashMap;
/**
 * @author BlaiseMoses01
 * Jukebox class, responsible for storing, adding, and playing songs.
 */
public class JukeBox{
    private HashMap<String, Song> songs;
    private int currentSongs;
/**
 * constructor class, initializes private variables for data manipulation.
 */
public JukeBox(){
    this.songs = new HashMap<String, Song>();
    this.currentSongs = 0;
}
/**
 * adds songs to Jukebox instance's song HashMap
 */
public void addSong(Song song){
    songs.put(song.getTitle(), song);
    currentSongs++;
}
/**
 * plays songs if they are contained in the Jukebox instance's song hashmap, otherwise outputs a sorry message.
 */
public void play(String songName){
    if(songs.containsKey(songName)){
       Song song =  songs.get(songName);
       System.out.println(song.toString());
    }
    else{
        System.out.println("Sorry, song not found");
    }
}
}