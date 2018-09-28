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
public final class MusicCollection_Coord
{

    /**
     * a collection of all of the album objects
     */
    private final Collection<Album> albums;

    public MusicCollection_Coord()
    {
        albums = new HashSet<Album>();


        // populate with test data
        Album album1 = new Album("Example Album 1","Example artist");
        Track albumTrack1 = new Track("track 1","Example Artist");
        album1.addTrack(albumTrack1);
        Track albumTrack2 = new Track("track 2","Example Artist");
        album1.addTrack(albumTrack2);



        Album album2 = new Album("Example Album 2","Example artist 2");
        Track albumTrack3 = new Track("track 3","Example Artist");
        album2.addTrack(albumTrack3);
        Track albumTrack4 = new Track("track 4","Example Artist");
        album2.addTrack(albumTrack4);
        albums.add(album1);
        albums.add(album2);
    }




      /**
     * Creates a new album object with name of value aName and adds it to albums collection
     * returns true if album is added successfully
     * @param aName
     * @return true or false
     */
    public boolean addAlbum(String aName, String artistName)
    {
        Album newAlbum = new Album(aName, artistName);
        if(albums.add(newAlbum))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Removes the Album object anAlbum from the collection of album objects
     * @param anAlbum
     */
    public void removeAlbum(Album anAlbum)
    {
        albums.remove(anAlbum);
    }




     /**
     * Removes all of the Track objects from the collection
     * of Track objects linked to anAlbum
     * @param anAlbum
     */
    public void removeAllTracks(Album anAlbum)
    {
         anAlbum.removeAllTracks();
    }



    /**
     * Checks to see if the album exists in the collection of albums. If it does,
     * adds album to collection of albums and returns true. Otherwise, returns false.
     * @param aName
     * @return
     */
    public boolean addTrack(String aName, String aArtistName, Album anAlbum)
    {
        for (Album eachAlbum : albums)
        {
            if (eachAlbum == anAlbum)
            {
                Track track = new Track(aName, aArtistName);
                eachAlbum.addTrack(track);
                return true;
            }
        }
        return false;
    }




    /**
     * Checks to see if track aTrack exits in anAlbum. If it does, removes track from collection
     * of tracks linked to anAlbum and returns true. Otherwise returns false.
     * @param aTrack
     * @return true or false
     */
    public boolean removeTrack(Track aTrack, Album anAlbum)
    {
        for (Album eachAlbum : albums)
        {
            if (eachAlbum == anAlbum)
            {
                anAlbum.removeTrack(aTrack);
                return true;
            }
        }
        return false;
    }


    /**
     * Returns all the album objects.
     *
     * @return a collection of all the Album objects.
     */
    public Collection<Album> getAlbums()
    {
        return new HashSet<Album>(albums);
    }



    /**
     * Returns all of the Track objects linked to anAlbum
     * @param anAlbum
     * @return a collection of all Track objects linked to anAlbum
     */
    public Collection<Track> getAlbumTracks(Album anAlbum)
    {
        Collection trackCollection = new HashSet<Track>();
        trackCollection = anAlbum.getAllTracks();
        if(trackCollection.size() > 0)
        {
            return new HashSet<Track>(trackCollection);
        }
        else
        {
            Track aTrack = new Track("Please add a track", "Please add an artist");
            trackCollection.add(aTrack);
            return new HashSet<Track>(trackCollection);
        }
    }
}
