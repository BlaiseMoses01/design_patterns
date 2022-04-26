/**
 * @author BlaiseMoses01
 * Track class, contains info about a song for data manipulation.
 */
public class Track extends Song{
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;
/**
 *constructor, takes in variables and uses them to populate a track instance's variables.
 */
public Track(String title, String album, String firstName, String lastName, Genre genre){
    this.title = title;
    this.album = album;
    this.firstName = firstName;
    this.lastName= lastName;
    this.genre = genre;
}
/**
 * getter method for title, returns the track instance's title
 * @return String of song title
 */
public String getTitle(){
    return this.title;
}
/**
 * getter method for album, returns the track instance's album
 * @return String of album title.
 */
public String getAlbum(){
    return this.album;
}
/**
 * getter method for Artist's first name, returns track instance's first name variable's contents.
 * @return String of artist's first name
 */
public String getArtistFirstName(){
    return this.firstName;
}
/**
 * getter method for Artists last name, returns track instance's last name variable's contents.
 * @return String of artist's last name
 */
public String getArtistLastName(){
    return this.lastName;
}
/**
 * getter method for genre, returns a string of the track instance's genre
 * @return String of Track's genre
 */
public String getGenre(){
    switch(this.genre){
        case ROCK:
            return "Rock";
        case POP:
            return "Pop";
        case HIPHOP:
            return "HipHop";
        case JAZZ:
            return "Jazz";
        case COUNTRY:
            return "Country";
        case OTHER:
            return "Other";
    }
    return null;
}
}