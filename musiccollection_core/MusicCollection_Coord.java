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
public class MusicCollection_Coord
{

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
    private final Collection<Artist> artist;

    public MusicCollection_Coord()
    {
        albums = new HashSet<Album>();
        tracks = new HashSet<Track>();
        artist = new HashSet<Artist>();
    }

    /**
     * Creates a new album object with name of value aName and adds it to albums collection
     * returns true if album is added successfully
     * @param aName
     */
    public void addAlbum(String aName, String artistName)
    {
        Album newAlbum = new Album(aName, artistName);
        albums.add(newAlbum);
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
     * Changes the name of Album object anAlbum to aName, and changes name of Artist object aArtist to aArtistName
     * @param anAlbum
     * @param aName
     * @param aArtistName
     */
    public void editAlbum(Album anAlbum, String aName, String aArtistName)
    {
        anAlbum.setName(aName);
        anAlbum.setArtistName(aArtistName);
    }



    /**
     * If there is not already a track with the given name then records a track with given name
     * and returns true. Else returns false.
     * @param aName
     * @return
     */
    public boolean addTrack(String aName, String aArtistName, Album anAlbum)
    {
        boolean alreadyExists = true;
        for (Track eachTrack : tracks)
        {
            if (eachTrack.getName().equals(aName))
            {
                return false;
            }
        }

        for (Album eachAlbum : albums)
        {
            if (eachAlbum == anAlbum)
            {
                Track track = new Track(aName, aArtistName, anAlbum);
                eachAlbum.addTrack(track);
                tracks.add(track);
            }
        }

        return true;
    }


    /**
     * Sets the name of Track object aTrack to aName, and sets the name of linked Artist object to aArtistName
     * @param aTrack
     * @param aName
     * @param aArtistName
     * @return boolean
     */
    public boolean editTrack(Track aTrack, String aName, String aArtistName)
    {
        boolean alreadyExists = true;
        for (Track eachTrack : tracks)
        {
            if (eachTrack == aTrack)
            {
                aTrack.setName(aName);
                aTrack.setArtistName(aArtistName);
                return false;
            }
        }
        return true;
    }


    /**
     * Removes Track object aTrack
     * @param aTrack
     */
    public void removeTrack(Track aTrack)
    {
        tracks.remove(aTrack);
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
        return new HashSet<Track>(trackCollection);
    }
}
