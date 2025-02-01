package ca.bcit.comp2522.bookstore;

public class Author extends Person implements Printable
{
    private static final int MAX_GENRE_NAME_LENGTH = 30;

    private String genre;

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

    public Author(final Date dateOfBirth,
                  final Name name,
                  final String genre)
    {
        this(dateOfBirth,
              null,
              name,
              genre);
    }

    public final String getGenre()
    {
        return genre;
    }

    public final void setGenre(final String genre)
    {
        validateGenreName(genre);

        this.genre = genre;
    }

    @Override
    public void display()
    {
        super.display();

        System.out.println("Genre: " + genre);
    }

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
