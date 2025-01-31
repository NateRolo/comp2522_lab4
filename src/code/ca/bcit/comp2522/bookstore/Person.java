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
        validateDateOfDeath(dateOfDeath);
        validateName(name);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name        = name;
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

    private static void validateDate(final Date date)
    {

    }

    private static void validateName(final Name name)
    {

    }
}
