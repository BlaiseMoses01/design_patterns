/**
 * @author BlaiseMoses01
 * abstract class creating default methods for all getters and toString methods for both Track and SongAdapter classes
 */
public abstract class Song{
    /**
     * getter method for song title
     * @return String of song title
     */
    public String getTitle(){
    return "no title";
    }
    /**
     * getter method for album title
     * @return String of album title
     */
    public String getAlbum(){
    return "no album";
    }
    /**
     * getter method for artist first name
     * @return String of artist's first name
     */
    public String getArtistFirstName(){
    return "no artist";
    }
    /**
     * getter method for artist's last name
     * @return String of artists last name
     */
    public String getArtistLastName(){
    return "no artist";
    }
    /**
     * getter method for Genre of song
     * @return String of song genre
     */
    public String getGenre(){
    return "no genre";
    }
    /**
     * returns the string of the song playing (all song info formatted as wished)
     * @return formatted String for played songs.
     */
    public String toString(){
    return getTitle()+"\nAlbum: "+getAlbum()+"\nBy: "+getArtistFirstName()+getArtistLastName()+"\nGenre: "+getGenre()+"\n";
}
}