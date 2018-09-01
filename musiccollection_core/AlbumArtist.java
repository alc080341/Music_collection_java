
package musiccollection_core;


/**
 * An AlbumArtist represents the artist of an album
 * @author Tony Chambers
 */

public class AlbumArtist {

private String name;


/**
 * Initialises a new AlbumArtist object with the given name.
 * @param aName
 */

public AlbumArtist(String aName)
{
    name = aName;

}


/**
 * Returns the name of the album artist to the receiver
 * @return name
 */
String getName()
{
    return name;
}


/**
 * Set the name of the album artist to vale of aName
 * @param aName
 */

void setName(String aName)
{
    name = aName;
}




/**
* Returns the name of this album artist
*
* @return a string object representing the receiver
*/

@Override
public String toString()
{
   return name;
}



}
