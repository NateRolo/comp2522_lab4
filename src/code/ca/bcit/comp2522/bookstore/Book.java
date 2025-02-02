package ca.bcit.comp2522.bookstore;

public class Book implements Comparable<Object>,
                                Printable,
                                Reversible
{
    private static final int MINIMUM_YEAR = 1;
    private static final int CURRENT_YEAR = 2025;
    private static final int MAXIMUM_TITLE_LENGTH = 100;

    final String    title;
    final int       yearPublished;
    final Author    author;

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

    public final String getTitle() {
        return title;
    }

    public final int getYearPublished() {
        return yearPublished;
    }

    public final Author getAuthor() {
        return author;
    }

    @Override
    public void display() {
        final String result;

        result = this.title +
                " published " +
                this.yearPublished +
                " by author ";
        //need author class to display the result once merged.
        System.out.println(result);
    }

    @Override
    public void backwards() {
        final StringBuilder str;
        final String result;

        str = new StringBuilder();

        str.append(this.title);
        result = str.reverse().toString();

        System.out.println(result);
    }

    @Override
    public int compareTo(Object o) {
        if(o == null || !(o instanceof Book))
        {
            throw new IllegalArgumentException("Cannot compare the two objects");
        }

        if(this == o)
        {
            return 0;
        }

        final Book other;
        final int result;

        other = (Book) o;
        result = this.yearPublished - other.getYearPublished();

        return result;
    }

    private static void validateTitle(final String title)
    {
        if(title == null || title.isBlank() || title.length() > MAXIMUM_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Invalid title " + title);
        }
    }

    private static void validateYear(final int year)
    {
        if(year < MINIMUM_YEAR || year > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Invalid year " + year);
        }
    }

    private static void validateAuthor(final Author author)
    {
        if(author == null)
        {
            throw new IllegalArgumentException("Author is null");
        }
    }
}
