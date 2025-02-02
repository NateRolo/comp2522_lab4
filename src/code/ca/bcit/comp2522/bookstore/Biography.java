package ca.bcit.comp2522.bookstore;

import java.util.Objects;

public class Biography extends Book
                        implements Printable
{
    private final Person subject;

    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject)
    {
        super(title, yearPublished, author);

        validateSubject(subject);

        this.subject = subject;
    }

    public final Person getSubject() {
        return subject;
    }

    @Override
    public void display() {
       final String str;

       str ="subject: " +
            subject.getName().getFullName();

       super.display();
       System.out.println(str);


    }

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

    @Override
    public int hashCode()
    {
        final int hash;

        hash = subject.hashCode();

        return hash;
    }

    private static void validateSubject(final Person subject)
    {
        if(subject == null)
        {
            throw new IllegalArgumentException("invalid subject");
        }
    }
}
