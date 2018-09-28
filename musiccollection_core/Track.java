package musiccollection_core;

/**
 * Represents a single music track of an album in the music collection
 * @author Tony Chambers
 */
public class Track
{

    private String name;
    private int position;
    private Artist artist;
    private Album album;

    Track(String aName, String aArtist)
    {
        name = aName;
        artist = new Artist(aArtist);
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
     * Adds a link to an Album object
     * @param anAlbum
     */
    void addAlbum(Album anAlbum)
    {
        album = anAlbum;
    }

    /**
     * Returns the album object linked to the track object
     * @return album
     */
    Album getAlbum()
    {
        return album;
    }

    /**
     * Returns the name of the track
     * @return a string object representing the receiver
     */
    @Override
    public String toString()
    {
        return getName() + " by " + getArtistName();
    }
}
