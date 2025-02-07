package ca.bcit.comp2522.bookstore;

/**
 * Represents a book with a title, year of publication, and an author.
 * Implements {@code Comparable} to allow sorting by year of publication.
 * Implements {@code Printable} to display book details.
 * Implements {@code Reversible} to display the title in reverse order.
 *
 * @author Nathan O
 * @author Lucas L
 * @version 1.0
 */
public class Book implements Comparable<Book>,
        Printable,
        Reversible
{
    private static final int MINIMUM_YEAR = 1;
    private static final int CURRENT_YEAR = 2025;
    private static final int MAXIMUM_TITLE_LENGTH = 100;

    final String    title;
    final int       yearPublished;
    final Author    author;

    /**
     * Constructs a new {@code Book} instance with the specified title, year of publication, and author.
     *
     * @param title         the title of the book
     * @param yearPublished the year the book was published
     * @param author        the author of the book
     * @throws IllegalArgumentException if the title is invalid, the year is out of range, or the author is null
     */
    public Book(final String title,
                final int yearPublished,
                final Author author)
    {
        validateTitle(title);
        validateYear(yearPublished);
        validateAuthor(author);

        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    /**
     * Gets the title of the book.
     *
     * @return the title of the book
     */
    public final String getTitle() {
        return title;
    }

    /**
     * Gets the year the book was published.
     *
     * @return the year of publication
     */
    public final int getYearPublished() {
        return yearPublished;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public final Author getAuthor() {
        return author;
    }

    /**
     * Displays the book details including title, year of publication, and author.
     * Implements the {@code Printable} interface.
     */
    @Override
    public void display() {
        final String result;

        result = "Title: " +
                this.title +
                "\nYear Published: " +
                this.yearPublished +
                "\nAuthor: " +
                this.author.getName().getFullName();

        System.out.println(result);
    }

    /**
     * Prints the title of the book in reverse order.
     * Implements the {@code Reversible} interface.
     */
    @Override
    public void backwards() {
        final StringBuilder str;
        final String result;

        str = new StringBuilder();

        str.append(this.title);
        result = str.reverse().toString();

        System.out.println(result);
    }

    /**
     * Compares this book with another object based on the year of publication.
     * Implements the {@code Comparable} interface.
     *
     * @param o the object to compare with
     * @return a negative integer if this book was published earlier,
     *         zero if published in the same year,
     *         or a positive integer if published later
     * @throws IllegalArgumentException if the object is null or not a {@code Book}
     */
    @Override
    public int compareTo(Book otherBook)
    {
        if(otherBook == null)
        {
            throw new NullPointerException("Cannot compare the two objects");
        }

        if(this == otherBook)
        {
            return 0;
        }

        final int result;

        result = this.yearPublished - otherBook.yearPublished;

        return result;
    }

    /*
     * Validates the book title to ensure it is not null, empty, or too long.
     *
     * @param title the title to validate
     * @throws IllegalArgumentException if the title is invalid
     */
    private static void validateTitle(final String title)
    {
        if(title == null || title.isBlank() || title.length() > MAXIMUM_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Invalid title " + title);
        }
    }

    /*
     * Validates the year of publication to ensure it is within an acceptable range.
     *
     * @param year the year to validate
     * @throws IllegalArgumentException if the year is out of range
     */
    private static void validateYear(final int year)
    {
        if(year < MINIMUM_YEAR || year > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Invalid year " + year);
        }
    }

    /*
     * Validates the author to ensure it is not null.
     *
     * @param author the author to validate
     * @throws IllegalArgumentException if the author is null
     */
    private static void validateAuthor(final Author author)
    {
        if(author == null)
        {
            throw new IllegalArgumentException("Author is null");
        }
    }
}