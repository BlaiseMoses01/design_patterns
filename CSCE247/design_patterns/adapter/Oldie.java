/**
 * @author BlaiseMoses01
 * Oldie class, implements Tune to create a unique type of song that is still adaptable to Song abstract
 */
public class Oldie implements Tune{
private String artistName;
private String songTitle;
private String recordTitle;
private String category;
/**
 * constructor, takes in values and uses them to populate the instance's variables
 */
public Oldie(String artistName, String songTitle, String recordTitle, String category){
    this.artistName = artistName;
    this.songTitle = songTitle;
    this.recordTitle = recordTitle;
    this.category = category;
}
/**
 * getter for artist name, returns string of artist's full name
 * @return String of artist's full name
 */
public String getArtistName(){
    return this.artistName;
}
/**
 * getter for tune title
 *@return String of tune title
 */
public String getDisplayTitle(){
    return this.songTitle;
}
/**
 * getter for category
 * @return String of tune's category
 */
public String getCategory(){
    return this.category;
}
/**
 * getter for album title
 * @return String of album title.
 */
public String getAlbum(){
    return this.recordTitle;
}
}