package musiccollection_core;

/**
 * A track artist represents the artist of a music track.
 * @author Tony Chambers
 */

public class TrackArtist {


    private String name;


/**
 * Initialises a new TrackArtist object with the given name.
 * @param aName
 */

public TrackArtist(String aName)
{
    name = aName;

}


/**
 * Returns the name of the track artist to the receiver
 * @return name
 */
String getName()
{
    return name;
}


/**
 * Set the name of the track artist to vale of aName
 * @param aName
 */

void setName(String aName)
{
    name = aName;
}




/**
* Returns the name of this track artist
*
* @return a string object representing the receiver
*/

@Override
public String toString()
{
   return name;
}





}
