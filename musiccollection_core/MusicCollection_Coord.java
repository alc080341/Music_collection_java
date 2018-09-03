

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package musiccollection_core;
import java.util.*;


/**
 * The coordinating class for the music collection system
 * @author Tony Chambers
 */
public class MusicCollection_Coord {

    /**
     * a collection of all of the album objects
     */
    private final Collection<Album> albums;


    /**
     * a collection of all of the track objects
     */
    private final Collection<Track> tracks;


    /**
     * a collection of all of the artist objects
     */
    private final  Collection<Artist> artist;


   public MusicCollection_Coord()
   {
        albums = new HashSet<Album>();
        tracks = new HashSet<Track>();
        artist = new HashSet<Artist>();
   }



  


/**
* Adds Track aTrack to tracks
* @param aTrack
*/

void addTrack(Track aTrack)
{
    tracks.add(aTrack);
}






/**
* Returns the tracks on the album
* @return a collection of all the linked flight objects
*/

Collection<Track> getAllTracks()
{
    return new HashSet<Track>(tracks);
}





/**
* Removed the given track (if present)
* from those linked to the album
* The reference to aTrack is removed.
* @param aTrack
*/

void removeTrack(Track aTrack)
{
    tracks.remove(aTrack);
}





}
