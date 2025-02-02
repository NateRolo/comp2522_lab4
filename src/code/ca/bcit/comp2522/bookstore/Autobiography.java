package ca.bcit.comp2522.bookstore;

public class Autobiography extends Biography
                            implements Printable
{

    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author,
                         final Person subject) {
        //to be done once merged with person.
        super(title, yearPublished, author, subject);
    }

    public void display() {
        //to be added once merged.
    }
}
