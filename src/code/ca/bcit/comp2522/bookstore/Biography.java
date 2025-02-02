package ca.bcit.comp2522.bookstore;

import java.util.Objects;

/**
 * Represents a biography book, which is a specialized {@code Book} that has a subject.
 * This class extends {@code Book} and implements {@code Printable} to display book details.
 *
 * @author Nathan O
 * @author Lucas L
 * @version 1.0
 */
public class Biography extends Book
        implements Printable
{
    private final Person subject;

    /**
     * Constructs a new {@code Biography} instance with the specified title, year of publication, author, and subject.
     *
     * @param title         the title of the biography
     * @param yearPublished the year the biography was published
     * @param author        the author of the biography
     * @param subject       the subject of the biography
     * @throws IllegalArgumentException if the subject is null
     */
    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject)
    {
        super(title, yearPublished, author);

        validateSubject(subject);

        this.subject = subject;
    }

    /**
     * Gets the subject of the biography.
     *
     * @return the subject of the biography
     */
    public final Person getSubject() {
        return subject;
    }

    /**
     * Displays the biography details including title, year of publication, author, and subject.
     * Implements the {@code Printable} interface.
     */
    @Override
    public void display() {
        final String str;

        str ="subject: " +
                subject.getName().getFullName();

        super.display();
        System.out.println(str);


    }

    /**
     * Checks if this biography is equal to another object.
     * Two biographies are considered equal if their subjects are the same.
     *
     * @param obj the object to compare with
     * @return {@code true} if the biographies have the same subject, {@code false} otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if(obj == null || !(obj instanceof Biography))
        {
            return false;
        }

        final Biography other;

        other = (Biography) obj;

        if(this.subject.equals(other.getSubject()))
        {
            return true;
        }

        return false;
    }

    /**
     * Generates a hash code for the biography based on its subject.
     *
     * @return the hash code of the biography
     */
    @Override
    public int hashCode()
    {
        final int hash;

        hash = subject.hashCode();

        return hash;
    }


    /*
     * Validates that the subject of the biography is not null.
     *
     * @param subject the subject to validate
     * @throws IllegalArgumentException if the subject is null
     */
    private static void validateSubject(final Person subject)
    {
        if(subject == null)
        {
            throw new IllegalArgumentException("invalid subject");
        }
    }
}