package ca.bcit.comp2522.bookstore;

/**
 * Represents an author with a name, birth date, optional death date, and a
 * literary genre.
 *
 * @author  Lucas L
 * @author  Nathan O
 * @version 1.0 2025
 */
public class Author extends Person implements Printable
{
    private static final int MAX_GENRE_NAME_LENGTH = 30;

    private String genre;

    /**
     * Constructs an Author with a birth date, death date, name, and genre.
     *
     * @param dateOfBirth the birth date of the author
     * @param dateOfDeath the death date of the author (can be null if still
     *                    alive)
     * @param name        the name of the author
     * @param genre       the genre associated with the author
     */
    public Author(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name,
                  final String genre)
    {
        super(dateOfBirth,
              dateOfDeath,
              name);

        validateGenreName(genre);

        this.genre = genre;
    }

    /**
     * Constructs an Author with a birth date, name, and genre (assumes the
     * author is alive).
     *
     * @param dateOfBirth the birth date of the author
     * @param name        the name of the author
     * @param genre       the genre associated with the author
     */
    public Author(final Date dateOfBirth,
                  final Name name,
                  final String genre)
    {
        this(dateOfBirth,
              null,
              name,
              genre);
    }

    /**
     * Retrieves the genre associated with the author.
     *
     * @return the genre of the author
     */
    public final String getGenre()
    {
        return genre;
    }

    /**
     * Sets the genre associated with the author.
     *
     * @param genre the new genre
     */
    public final void setGenre(final String genre)
    {
        validateGenreName(genre);

        this.genre = genre;
    }

    /**
     * Displays the author's information, including the genre.
     */
    @Override
    public void display()
    {
        super.display();

        System.out.println("Genre: " + genre);
    }

    /**
     * Validates that the genre name is not null, blank, and does not exceed
     * the maximum length.
     *
     * @param genre the genre to validate
     */
    private static void validateGenreName(final String genre)
    {
        final boolean genreNameExceedsMaxLength;
        final int genreNameLength;

        if(genre == null)
        {
            throw new IllegalArgumentException("Genre cannot be null.");
        }

        if(genre.isBlank())
        {
            throw new IllegalArgumentException("Genre cannot be blank.");
        }

        genreNameLength = genre.length();

        genreNameExceedsMaxLength = genreNameLength > MAX_GENRE_NAME_LENGTH;

        if(genreNameExceedsMaxLength)
        {
            throw new IllegalArgumentException("Genre name too long: " +
                                               genreNameLength);
        }
    }


}
