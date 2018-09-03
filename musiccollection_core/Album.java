package musiccollection_core;
import java.util.*;


/**
* An album represents an album in the music colleciton
* @author Tony Chambers
*/

public class Album {

private String name;
private Artist artist;




/**
* Initialises a new Album object with the given name. 
* @param aName
*/

public Album(String aName, String aArtist)
{
    name = aName;
    artist = new Artist(aArtist);
}




/**
* Returns the name of the Album object to the receiver
* @return name
*/

public String getName()
{
    return name;
}





/**
* Set the name of the Album to vale of aName
* @param aName
*/

void setName(String aName)
{
    name = aName;
}



/**
 * Sends the name of the album artist to the receiver
 * @return artist name
 */

String getArtistName()
{
    return artist.getName();
}





/**
 * Sets the name of the album artist to the value of aName
 * @param aName
 */

void setArtistName(String aName)
{
    artist.setName(aName);
}






 /**
 * Returns the name of the album
 *
 * @return a string object representing the receiver
 */
@Override
public String toString()
{
    return name;
}


}
