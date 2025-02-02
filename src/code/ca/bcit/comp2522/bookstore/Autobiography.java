package ca.bcit.comp2522.bookstore;

/**
 * Represents an autobiography, which is a specialized {@code Biography} where the author
 * and the subject are the same person.
 * This class extends {@code Biography} and implements {@code Printable}.
 *
 * An autobiography is a book written by an author about their own life.
 *
 * @author Nathan O
 * @author Lucas L
 * @version 1.0
 */
public class Autobiography extends Biography
                            implements Printable
{
    /**
     * Constructs a new {@code Autobiography} instance with the specified title,
     * year of publication, and author.
     * Since an autobiography is written by the person it is about,
     * the {@code author} also serves as the {@code subject}.
     *
     * @param title         the title of the autobiography
     * @param yearPublished the year the autobiography was published
     * @param author        the author of the autobiography, who is also the subject
     */
    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author) {
        //to be done once merged with person.
        super(title, yearPublished, author, author);
    }

    /**
     * Displays the autobiography details, including title, year of publication, author, and subject.
     * Inherits behavior from {@code Biography}.
     */
    @Override
    public void display() {
        super.display();
    }
}
