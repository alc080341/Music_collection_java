package musiccollection_core;
import java.util.*;


/**
* An album represents an album in the music colleciton
* @author Tony Chambers
*/

public class Album {

private String name;
private final Collection<Track> tracks;
private AlbumArtist artist;




/**
* Initialises a new Album object with the given name. 
* @param aName
*/

public Album(String aName, String aArtist)
{
    name = aName;
    tracks = new HashSet<Track>();
    artist = new AlbumArtist(aArtist);
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
 * @return aName
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
* Adds Track aTrack to tracks
* @param aTrack
*/

void add(Track aTrack)
{
    tracks.add(aTrack);
}






/**
* Returns the tracks on the album
* @return a collection of all the linked flight objects
*/

Collection<Track> getTracks()
{
    return new HashSet<Track>(tracks);
}





/**
* Removed the given track (if present)
* from those linked to the album
* The reference to aTrack is removed.
* @param aTrack
*/

void remove(Track aTrack)
{
    tracks.remove(aTrack);
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
