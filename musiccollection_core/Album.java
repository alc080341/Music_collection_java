package musiccollection_core;

import java.util.*;

/**
 * An album represents an album in the music colleciton
 * @author Tony Chambers
 */
public class Album
{

    private String name;
    private Artist artist;
    private Collection tracks;

    /**
     * Initialises a new Album object with the given name.
     * @param aName
     */
    Album(String aName, String artistName)
    {
        name = aName;
        tracks = new HashSet<Track>();
        artist = new Artist(artistName);
    }

    /**
     * Adds Track aTrack to tracks on this album
     * A reference to aTrack is recorded.
     * aTrack records a reference to the receiver.
     * @param aTrack
     */
    void addTrack(Track aTrack)
    {
        tracks.add(aTrack);
        aTrack.addAlbum(this);
    }

    /**
     * Returns the tracks on the album
     * @return a collection of all the track objects
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


    /**
     * Removes all track object links from the collection of tracks. Returns true if successful
     */
    void removeAllTracks()
    {
        tracks = new HashSet<Track>();
    }

     /**
     * Returns the name of the Album object to the receiver
     * @return name
     */
    String getName()
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
        return getName() + " by " + getArtistName();
    }
}
