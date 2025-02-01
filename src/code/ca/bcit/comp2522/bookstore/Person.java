package ca.bcit.comp2522.bookstore;

// Nate: Person, Date(implement {Printable}, author

public class Person implements Comparable,
                               Printable,
                               Reversible
{
    private final Date dateOfBirth;
    private final Date dateOfDeath;
    private final Name name;

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

    public final Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public final Date getDateOfDeath()
    {
        return dateOfDeath;
    }

    public final Name getName()
    {
        return name;
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
        final boolean objectIsNotAPerson;
        final boolean thisPersonIsOlder;
        final int ageDifference;

        if(o == null)
        {
            throw new IllegalArgumentException("Cannot compare to null object.");
        }

        objectIsNotAPerson = !(this.getClass().equals(o.getClass()));

        if(objectIsNotAPerson)
        {
            throw new IllegalArgumentException("Cannot compare this person" +
                                               " to non-person object.");
        }

        ageDifference = this.dateOfBirth.getYear() -
                        ((Person)o).getDateOfBirth().getYear();

        return ageDifference;
    }

    private static void validateDateOfBirth(final Date dateOfBirth)
    {
        if(dateOfBirth == null)
        {
            throw new IllegalArgumentException("Date of birth cannot be null,");
        }
    }

}
