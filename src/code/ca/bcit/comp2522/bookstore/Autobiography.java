package ca.bcit.comp2522.bookstore;

public class Autobiography extends Biography
                            implements Printable
{

    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author) {
        //to be done once merged with person.
        super(title, yearPublished, author, author);
    }

    public void display() {
        super.display();
    }
}
