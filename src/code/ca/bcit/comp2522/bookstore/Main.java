package ca.bcit.comp2522.bookstore;

public class Main
{
    public static void main(final String[] args)
    {
        final Book B1;
        final Book B2;
        final Book B3;
        final Book B4;
        final Book B5;
        final Biography BG1;
        final Biography BG2;
        final Biography BG3;
        final Biography BG4;
        final Biography BG5;
        final Autobiography ABG1;
        final Autobiography ABG2;
        final Autobiography ABG3;
        final Autobiography ABG4;
        final Autobiography ABG5;

        B1 = new Book("1984",
                1949,
                new Author(
                        new Date(1903,
                                6,
                                25),
                        new Date(1950,
                                1,
                                21),
                        new Name("George",
                                "Orwell"),
                        "Dystopian Fiction"));

        B2 = new Book("To Kill a Mockingbird",
                1960,
                new Author(
                        new Date(1926,
                                4,
                                28),
                        new Date(2016,
                                2,
                                19),
                        new Name("Harper",
                                "Lee"),
                        "Fiction"));

        B3 = new Book("Pride and Prejudice",
            1813,
            new Author(
                    new Date(1775,
                            12,
                            16),
                    new Date(1817,
                            7,
                            18),
                    new Name("Jane",
                            "Austen"),
                    "Fiction"));

        B4 = new Book("The Great Gatsby",
                1925,
                new Author(
                        new Date(1896,
                                9,
                                24),
                        new Date(1940,
                                12,
                                21),
                        new Name("F.Scott",
                                "Fitzgerald"),
                        "Fiction"));

        B5 = new Book("Moby-Dick",
                1851,
                new Author(
                        new Date(1819,
                                8,
                                1),
                        new Date(1891,
                                9,
                                28),
                        new Name("Herman",
                                "Melville"),
                        "Fiction"));

        BG1 = new Biography("The Power Broker",
                            1974,
                            new Author(
                                new Date(1935,
                                         10,
                                         30),
                                null,
                                new Name("Robert",
                                         "Caro"),
                            "Non-Fiction"),
                            new Person(
                                new Date(1888,
                                         12,
                                         18),
                                new Date(1981,
                                         7,
                                         29),
                                new Name("Robert",
                                         "Moses")));

        BG2 = new Biography("Steve Jobs",
                2011,
                new Author(
                        new Date(1952,
                                5,
                                20),
                        null,
                        new Name("Walter",
                                "Isaacson"),
                        "Non-Fiction"),
                new Person(
                        new Date(1955,
                                2,
                                24),
                        new Date(2011,
                                10,
                                5),
                        new Name("Steve",
                                 "Jobs")));

        BG3 = new Biography("Churchill: A life",
                1991,
                new Author(
                        new Date(1936,
                                10,
                                25),
                        new Date(2015,
                                2,
                                3),
                        new Name("Martin",
                                "Gilbert"),
                        "Non-Fiction"),
                new Person(
                        new Date(1874,
                                11,
                                30),
                        new Date(1965,
                                1,
                                24),
                        new Name("Winston",
                                "Churchill")));

        BG4 = new Biography("Aexander Hamilton",
                2004,
                new Author(
                        new Date(1949,
                                3,
                                3),
                        null,
                        new Name("Ron",
                                "Churnow"),
                        "Non-Fiction"),
                new Person(
                        new Date(1755,
                                1,
                                11),
                        new Date(1804,
                                7,
                                12),
                        new Name("Alexander",
                                 "Hamilton")));

        BG5 = new Biography("Einstein: His Life and Universe",
                            2007,
                            new Author(
                                 new Date(1952,
                                          5,
                                          20),
                                          null,
                            new Name("Walter",
                                     "Isaacson"),
                            "Non-Fiction"),
                            new Person(
                                    new Date(1897,
                                             3,
                                             14),
                            new Date(1955,
                                     4,
                                     18),
                            new Name("Albert",
                                     "Einsein")));

        ABG1 = new Autobiography("The Diary of a Young Girl",
                                 1947,
                                 new Author(
                                         new Date(1929,
                                                  6,
                                                  12),
                                         new Date(1945,
                                                  3,
                                                  1),
                                         new Name("Ann",
                                                  "Frank"),
                                         "Non-Fiction"));

        ABG2 = new Autobiography("The Long Walk to Freedom",
                1994,
                new Author(
                        new Date(1918,
                                7,
                                18),
                        new Date(2013,
                                12,
                                5),
                        new Name("Nelson",
                                "Mandela"),
                        "Non-Fiction"));



        ABG3 = new Autobiography("The Story of My Experiments with Truth",
                1927,
                new Author(
                        new Date(1869,
                                10,
                                2),
                        new Date(1948,
                                1,
                                30),
                        new Name("Mahatama",
                                "Gandhi"),
                        "Non-Fiction"));

        ABG4 = new Autobiography("I Know Why the Caged Bird Sings",
                1969,
                new Author(
                        new Date(1928,
                                4,
                                4),
                        new Date(2014,
                                5,
                                28),
                        new Name("Maya",
                                "Angelou"),
                        "Non-Fiction"));

        ABG5 = new Autobiography("The Autobiography of Malcom X",
                1965,
                new Author(
                        new Date(1925,
                                5,
                                19),
                        new Date(1965,
                                2,
                                21),
                        new Name("Malcom",
                                "X"),
                        "Non-Fiction"));

        B1.display();
        B2.display();
        B3.display();
        B4.display();
        B5.display();
        BG1.display();
        BG2.display();
        BG3.display();
        BG4.display();
        BG5.display();
        ABG1.display();
        ABG2.display();
        ABG3.display();
        ABG4.display();
        ABG5.display();


    }


}
