package ca.bcit.comp2522.bookstore;

public class Author extends Person
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

        validateGenre(genre);

        this.genre = genre;
    }

    private static void validateGenre(final String genre)
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
