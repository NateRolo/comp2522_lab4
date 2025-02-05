package ca.bcit.comp2522.bookstore;

public class Main
{
    // Authors
    private static Author georgeOrwell;
    private static Author harperLee;
    private static Author janeAusten;
    private static Author fitzgerald;
    private static Author melville;
    private static Author robertCaro;
    private static Author walterIsaacson;
    private static Author martinGilbert;
    private static Author ronChernow;
    private static Author anneFrank;
    private static Author nelsonMandela;
    private static Author gandhi;
    private static Author mayaAngelou;
    private static Author malcolmX;

    // Biography Subjects
    private static Person robertMoses;
    private static Person steveJobs;
    private static Person churchill;
    private static Person hamilton;
    private static Person einstein;

    // Books
    private static Book book1984;
    private static Book mockingbird;
    private static Book prideAndPrejudice;
    private static Book greatGatsby;
    private static Book mobyDick;

    // Biographies
    private static Biography powerBroker;
    private static Biography steveJobsBio;
    private static Biography churchillLife;
    private static Biography hamiltonBio;
    private static Biography einsteinBio;

    // Autobiographies
    private static Autobiography diary;
    private static Autobiography longWalk;
    private static Autobiography experiments;
    private static Autobiography cagedBird;
    private static Autobiography malcolmXAuto;

    public static void main(final String[] args)
    {
        createAuthors();
        createBiographySubjects();
        createBooks();
        createBiographies();
        createAutobiographies();
    }

    private static void createAuthors()
    {
        georgeOrwell = new Author(new Date(1903, 6, 25),
                                 new Date(1950, 1, 21),
                                 new Name("George", "Orwell"),
                                 "Dystopian fiction");

        harperLee = new Author(new Date(1926, 4, 28),
                              new Date(2016, 2, 19),
                              new Name("Harper", "Lee"),
                              "Southern Gothic");

        janeAusten = new Author(new Date(1775, 12, 16),
                               new Date(1817, 7, 18),
                               new Name("Jane", "Austen"),
                               "Romantic fiction");

        fitzgerald = new Author(new Date(1896, 9, 24),
                              new Date(1940, 12, 21),
                              new Name("F. Scott", "Fitzgerald"),
                              "Tragedy");

        melville = new Author(new Date(1819, 8, 1),
                             new Date(1891, 9, 28),
                             new Name("Herman", "Melville"),
                             "Adventure fiction");

        robertCaro = new Author(new Date(1935, 10, 30),
                               null,
                               new Name("Robert", "Caro"),
                               "Biography");

        walterIsaacson = new Author(new Date(1952, 5, 20),
                                   null,
                                   new Name("Walter", "Isaacson"),
                                   "Biography");

        martinGilbert = new Author(new Date(1936, 10, 25),
                                  new Date(2015, 2, 3),
                                  new Name("Martin", "Gilbert"),
                                  "History");

        ronChernow = new Author(new Date(1949, 3, 3),
                               null,
                               new Name("Ron", "Chernow"),
                               "Biography");

        // Autobiography authors
        anneFrank = new Author(new Date(1929, 6, 12),
                              new Date(1945, 3, 1),
                              new Name("Anne", "Frank"),
                              "Autobiography");

        nelsonMandela = new Author(new Date(1918, 7, 18),
                                  new Date(2013, 12, 5),
                                  new Name("Nelson", "Mandela"),
                                  "Autobiography");

        gandhi = new Author(new Date(1869, 10, 2),
                           new Date(1948, 1, 30),
                           new Name("Mahatma", "Gandhi"),
                           "Autobiography");

        mayaAngelou = new Author(new Date(1928, 4, 4),
                                new Date(2014, 5, 28),
                                new Name("Maya", "Angelou"),
                                "Autobiography");

        malcolmX = new Author(new Date(1925, 5, 19),
                             new Date(1965, 2, 21),
                             new Name("Malcolm", "X"),
                             "Autobiography");
    }

    private static void createBiographySubjects()
    {
        robertMoses = new Person(new Date(1888, 12, 18),
                                new Date(1981, 7, 29),
                                new Name("Robert", "Moses"));

        steveJobs = new Person(new Date(1955, 2, 24),
                              new Date(2011, 10, 5),
                              new Name("Steve", "Jobs"));

        churchill = new Person(new Date(1874, 11, 30),
                             new Date(1965, 1, 24),
                             new Name("Winston", "Churchill"));

        hamilton = new Person(new Date(1757, 1, 11),
                            new Date(1804, 7, 12),
                            new Name("Alexander", "Hamilton"));

        einstein = new Person(new Date(1879, 3, 14),
                            new Date(1955, 4, 18),
                            new Name("Albert", "Einstein"));
    }

    private static void createBooks()
    {
        book1984 = new Book("1984",
                            1949,
                            georgeOrwell
        );
        mockingbird = new Book("To Kill a Mockingbird",
                               1960,
                               harperLee
        );
        prideAndPrejudice = new Book("Pride and Prejudice",
                                     1813,
                                     janeAusten
        );
        greatGatsby = new Book("The Great Gatsby",
                               1925,
                               fitzgerald
        );
        mobyDick = new Book("Moby-Dick",
                            1851,
                            melville
        );
    }

    private static void createBiographies()
    {
        powerBroker = new Biography("The Power Broker",
                                    1974,
                                    robertCaro,
                                    robertMoses
        );
        steveJobsBio = new Biography("Steve Jobs",
                                     2011,
                                     walterIsaacson,
                                     steveJobs
        );
        churchillLife = new Biography("Churchill: A Life",
                                      1991,
                                      martinGilbert,
                                      churchill
        );
        hamiltonBio = new Biography("Alexander Hamilton",
                                    2004,
                                    ronChernow,
                                    hamilton
        );
        einsteinBio = new Biography("Einstein: His Life and Universe",
                                    2007,
                                    walterIsaacson,
                                    einstein
        );
    }

    private static void createAutobiographies()
    {
        diary = new Autobiography("The Diary of a Young Girl",
                                  1947,
                                  anneFrank
        );
        longWalk = new Autobiography("Long Walk to Freedom",
                                     1994,
                                     nelsonMandela
        );
        experiments = new Autobiography("The Story of My Experiments with Truth",
                                        1927,
                                        gandhi
        );
        cagedBird = new Autobiography("I Know Why the Caged Bird Sings",
                                      1969,
                                      mayaAngelou
        );
        malcolmXAuto = new Autobiography("Autobiography of Malcolm X",
                                         1965,
                                         malcolmX
        );
    }
}
