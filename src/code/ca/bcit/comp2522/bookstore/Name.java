package ca.bcit.comp2522.bookstore;

public class Name implements Printable
{
    private final String fristName;
    private final String lastName;

    public Name(final String fristName,
                final String lastName)
    {
        validateName(fristName);
        validateName(lastName);

        this.fristName = fristName;
        this.lastName = lastName;
    }

    @Override
    public void display()
    {
        System.out.println(fristName + " " + lastName);
    }

    private static void validateName(final String name)
    {
        if(name == null || name.isEmpty() || name.length() > 50)
        {
            throw new IllegalArgumentException("invalid name" + name);
        }
    }
}
