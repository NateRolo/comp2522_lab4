package ca.bcit.comp2522.bookstore;

// Nate: Person, Date(implement {Printable}, author

public class Person implements Comparable,
                               Printable,
                               Reversible
{
    final Date dateOfBirth;
    final Date dateOfDeath;
    final Name name;

    public Person(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name)
    {
        validateDateOfBirth(dateOfBirth);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name        = name;
    }

    public Person(final Date dateOfBirth,
                  final Name name)
    {
        this(dateOfBirth,
             null,
             name);
    }



    @Override
    public void display()
    {

    }

    @Override
    public void backwards()
    {

    }

    @Override
    public int compareTo(final Object o)
    {
        return 0;
    }

    private static void validateDateOfBirth(final Date dateOfBirth)
    {
        if(dateOfBirth == null)
        {
            throw new IllegalArgumentException("Date of birth cannot be null,");
        }
    }

}
