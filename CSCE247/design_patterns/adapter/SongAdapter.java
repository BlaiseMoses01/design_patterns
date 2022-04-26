/**
 * @author BlaiseMoses01
 * Adapter class to adapt Tune instances to fit the song abstract classe's getter and print formats
 */
public class SongAdapter extends Song{
    private Tune tune;
/**
 * constructor, initializes private variables for data manipulation.
 */
public SongAdapter(Tune tune){
    this.tune = tune;
}
/**
 * getter for song title
 * @return String of song title
 */
public String getTitle(){
    return tune.getDisplayTitle();
}
/**
 * getter for album title
 * @return String of album title
 */
public String getAlbum(){
    return tune.getAlbum();
}
/**
 * getter for Artists first name, reformats tune's artist full name variable by parsing.
 * @return String of artists first name
 */
public String getArtistFirstName(){
String artistName = tune.getArtistName();
String[] ret = artistName.split(" ");
return ret[0]+" ";
}
/**
 * getter for Artist's last name, reformats tune's artist full name variable by parsing.
 * @return String of artists last name.
 */
public String getArtistLastName(){
 String artistName = tune.getArtistName();
 String[] ret = artistName.split(" ");
return ret[1];
}
/**
 * getter for genre
 * @return String of song genre.
 */
public String getGenre(){
    return tune.getCategory();
}
}