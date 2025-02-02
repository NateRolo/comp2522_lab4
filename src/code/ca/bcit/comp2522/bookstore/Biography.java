package ca.bcit.comp2522.bookstore;

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

    @Override
    public void display() {
        //to be added once merged.
    }

    @Override
    public boolean equals(final Object obj)
    {
        //to be added once merged with person class
        return true;
    }

    @Override
    public int hashCode()
    {
        //to be added once equals is implemented.
        return 0;
    }

    private static void validateSubject(final Person subject)
    {
        if(subject == null)
        {
            throw new IllegalArgumentException("invalid subject");
        }
    }
}
