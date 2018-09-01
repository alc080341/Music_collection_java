
package musiccollection_core;


/**
 * Represents a single music track of an album in the music collection
 * @author Tony Chambers
 */

public class Track {

    private String name;
    private int position;
    private TrackArtist artist;

    public Track(String aName, String aArtist, int aPosition)
    {
        name = aName;
        position = aPosition;
        artist = new TrackArtist(aArtist);
    }



/**
 * Returns the name of the track to the receiver
 * @return name
 */
String getName()
{
   return name;
}
    



/**
 * Set the name of the track to vale of aName
 * @param aName
 */

void setName(String aName)
{
    name = aName;
}



/**
 * Returns the name of the artist to the receiver.
 * @return aName
 */

String getArtist()
{
    return name;
}





/**
 * Sets the name of the artist to the value aName
 * @param aName
 */

void setArtist(String aName)
{
    name = aName;
}






/**
* Returns the name of the track
*
* @return a string object representing the receiver
*/

@Override
public String toString()
{
   return name;
}




}


