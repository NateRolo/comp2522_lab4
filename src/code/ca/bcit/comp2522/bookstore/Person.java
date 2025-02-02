package ca.bcit.comp2522.bookstore;

/**
 * Represents a person with a name, birth date, and optional death date.
 *
 * @author Lucas L
 * @author Nathan O
 * @version 1.0 2025
 */
public class Person implements Comparable<Object>,
                               Printable,
                               Reversible
{
    private final Date dateOfBirth;
    private final Date dateOfDeath;
    private final Name name;

    /**
     * Constructs a Person with a birth date, death date, and name.
     *
     * @param dateOfBirth the birth date of the person
     * @param dateOfDeath the death date of the person (can be null if still alive)
     * @param name        the name of the person
     */
    public Person(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name)
    {
        validateDateOfBirth(dateOfBirth);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name        = name;
    }

    /**
     * Constructs a Person with a birth date and name, assuming they are alive.
     *
     * @param dateOfBirth the birth date of the person
     * @param name        the name of the person
     */
    public Person(final Date dateOfBirth,
                  final Name name)
    {
        this(dateOfBirth,
             null,
             name);
    }

    /**
     * Retrieves the birth date of the person.
     *
     * @return the birth date
     */
    public final Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * Retrieves the death date of the person.
     *
     * @return the death date, or null if the person is still alive
     */
    public final Date getDateOfDeath()
    {
        if(dateOfDeath == null)
        {
            System.out.println("Person is still alive.");
        }

        return dateOfDeath;
    }

    /**
     * Retrieves the name of the person.
     *
     * @return the person's name
     */
    public final Name getName()
    {
        return name;
    }

    /**
     * Displays the person's details, including their name, birth date, and death date if applicable.
     */
    @Override
    public void display()
    {
        final StringBuilder builder;
        final String details;
        final String dateOfBirth;
        final String dateOfDeath;
        final String name;

        final boolean personIsAlive;

        personIsAlive = (this.dateOfDeath == null);
        dateOfBirth = this.dateOfBirth.getFullDate();
        name = this.name.getFullName();

        if(personIsAlive)
        {
            dateOfDeath = "Person is still alive.";
        }
        else
        {
            dateOfDeath = this.dateOfDeath.getFullDate();
        }

        builder = new StringBuilder();

        builder.append(name)
                .append("\n")
                .append("Date of birth: ")
                .append(dateOfBirth)
                .append("\n")
                .append("Date of death: ")
                .append(dateOfDeath);

        details = builder.toString();

        System.out.println(details);
    }

    /**
     * Prints the person's name in reverse order.
     */
    @Override
    public void backwards()
    {
        final StringBuilder builder;
        final String reversedName;

        builder = new StringBuilder();

        builder.append(this.name.getFullName());

        builder.reverse();

        reversedName = builder.toString();

        System.out.println(reversedName);
    }

    /**
     * Compares this person to another person based on birth year.
     *
     * @param o the object to compare to
     * @return the difference in birth years between this person and the other
     */
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

        objectIsNotAPerson = !(o instanceof Person);

        if(objectIsNotAPerson)
        {
            throw new IllegalArgumentException("Cannot compare this person" +
                                               " to non-person object.");
        }

        ageDifference = this.dateOfBirth.getYear() -
                        ((Person)o).getDateOfBirth().getYear();

        return ageDifference;
    }

    /*
     * Validates that the birth date is not null.
     *
     * @param dateOfBirth the birth date to validate
     */
    private static void validateDateOfBirth(final Date dateOfBirth)
    {
        if(dateOfBirth == null)
        {
            throw new IllegalArgumentException("Date of birth cannot be null,");
        }
    }

}
