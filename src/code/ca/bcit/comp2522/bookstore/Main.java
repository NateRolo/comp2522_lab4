package ca.bcit.comp2522.bookstore;

/**
 * The {@code Main} class serves as the entry point for the {@code Bookstore} application.
 * <p>
 * It initializes and displays various books, biographies, and autobiographies,
 * along with their respective authors and subjects.
 * </p>
 * <p>
 * The program also demonstrates comparisons between books, authors, and biography subjects,
 * as well as the functionality of the {@code Reversible} interface.
 * </p>
 * 
 * @author Lucas L
 * @author Nathan O
 * @version 1.0 2025
 */
public class Main
{
    /**
     * The main method initializes data related to books, authors, biographies,
     * autobiographies, and their subjects, then displays the information and
     * performs comparisons.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(final String[] args)
    {
        // Birth dates for book authors
        final Date orwellBirth;
        final Date orwellDeath;
        final Date leeBirth;
        final Date leeDeath;
        final Date austenBirth;
        final Date austenDeath;
        final Date fitzgeraldBirth;
        final Date fitzgeraldDeath;
        final Date melvilleBirth;
        final Date melvilleDeath;

        // Birth dates for biography authors
        final Date caroBirth;
        final Date isaacsonBirth;
        final Date gilbertBirth;
        final Date gilbertDeath;
        final Date chernowBirth;

        // Birth dates for autobiography authors
        final Date frankBirth;
        final Date frankDeath;
        final Date mandelaBirth;
        final Date mandelaDeath;
        final Date gandhiBirth;
        final Date gandhiDeath;
        final Date angelouBirth;
        final Date angelouDeath;
        final Date malcolmBirth;
        final Date malcolmDeath;

        // Birth dates for biography subjects
        final Date mosesBirth;
        final Date mosesDeath;
        final Date jobsBirth;
        final Date jobsDeath;
        final Date churchillBirth;
        final Date churchillDeath;
        final Date hamiltonBirth;
        final Date hamiltonDeath;
        final Date einsteinBirth;
        final Date einsteinDeath;

        // Authors for books
        final Author georgeOrwell;
        final Author harperLee;
        final Author janeAusten;
        final Author fitzgerald;
        final Author melville;

        // Authors for biographies
        final Author robertCaro;
        final Author walterIsaacson;
        final Author martinGilbert;
        final Author ronChernow;

        // Authors/Subjects for autobiographies
        final Author anneFrank;
        final Author nelsonMandela;
        final Author gandhi;
        final Author mayaAngelou;
        final Author malcolmX;

        // Biography subjects
        final Person robertMoses;
        final Person steveJobs;
        final Person churchill;
        final Person hamilton;
        final Person einstein;

        // Books
        final Book nineteenEightyFour;
        final Book toKillAMockingbird;
        final Book prideAndPrejudice;
        final Book greatGatsby;
        final Book mobyDick;

        // Biographies
        final Biography powerBroker;
        final Biography steveJobsBio;
        final Biography churchillLife;
        final Biography hamiltonBio;
        final Biography einsteinBio;

        // Autobiographies
        final Autobiography diaryOfAYoungGirl;
        final Autobiography longWalkToFreedom;
        final Autobiography experimentsWithTruth;
        final Autobiography cagedBirdSings;
        final Autobiography malcolmXAutobiography;

        // birth/death dates for book authors
        orwellBirth     = new Date(1903,
                                   6,
                                   25);
        orwellDeath     = new Date(1950,
                                   1,
                                   21);
        leeBirth        = new Date(1926,
                                   4,
                                   28);
        leeDeath        = new Date(2016,
                                   2,
                                   19);
        austenBirth     = new Date(1775,
                                   12,
                                   16);
        austenDeath     = new Date(1817,
                                   7,
                                   18);
        fitzgeraldBirth = new Date(1896,
                                   9,
                                   24);
        fitzgeraldDeath = new Date(1940,
                                   12,
                                   21);
        melvilleBirth   = new Date(1819,
                                   8,
                                   1);
        melvilleDeath   = new Date(1891,
                                   9,
                                   28);

        // birth/death dates for biography authors
        caroBirth       = new Date(1935,
                                   10,
                                   30);
        isaacsonBirth   = new Date(1952,
                                   5,
                                   20);
        gilbertBirth    = new Date(1936,
                                   10,
                                   25);
        gilbertDeath    = new Date(2015,
                                   2,
                                   3);
        chernowBirth    = new Date(1949,
                                   3,
                                   3);

        // birth/death dates for autobiography authors
        frankBirth      = new Date(1929,
                                   6,
                                   12);
        frankDeath      = new Date(1945,
                                   3,
                                   1);
        mandelaBirth    = new Date(1918,
                                   7,
                                   18);
        mandelaDeath    = new Date(2013,
                                   12,
                                   5);
        gandhiBirth     = new Date(1869,
                                   10,
                                   2);
        gandhiDeath     = new Date(1948,
                                   1,
                                   30);
        angelouBirth    = new Date(1928,
                                   4,
                                   4);
        angelouDeath    = new Date(2014,
                                   5,
                                   28);
        malcolmBirth    = new Date(1925,
                                   5,
                                   19);
        malcolmDeath    = new Date(1965,
                                   2,
                                   21);

        // birth/death dates for biography subjects
        mosesBirth      = new Date(1888,
                                   12,
                                   18);
        mosesDeath      = new Date(1981,
                                   7,
                                   29);
        jobsBirth       = new Date(1955,
                                   2,
                                   24);
        jobsDeath       = new Date(2011,
                                   10,
                                   5);
        churchillBirth  = new Date(1874,
                                   11,
                                   30);
        churchillDeath  = new Date(1965,
                                   1,
                                   24);
        hamiltonBirth   = new Date(1755,
                                   1,
                                   11);
        hamiltonDeath   = new Date(1804,
                                   7,
                                   12);
        einsteinBirth   = new Date(1897,
                                   3,
                                   14);
        einsteinDeath   = new Date(1955,
                                   4,
                                   18);

        // Create authors for books
        georgeOrwell   = new Author(orwellBirth,
                                    orwellDeath,
                                    new Name("George", 
                                             "Orwell"),
                                    "Dystopian Fiction");

        harperLee      = new Author(leeBirth,
                                    leeDeath,
                                    new Name("Harper", 
                                             "Lee"),
                                    "Fiction");

        janeAusten     = new Author(austenBirth,
                                    austenDeath,
                                    new Name("Jane", 
                                             "Austen"),
                                    "Fiction");

        fitzgerald     = new Author(fitzgeraldBirth,
                                    fitzgeraldDeath,
                                    new Name("F.Scott", 
                                             "Fitzgerald"),
                                    "Fiction");

        melville       = new Author(melvilleBirth,
                                    melvilleDeath,
                                    new Name("Herman", 
                                             "Melville"),
                                    "Fiction");

        // Create authors for biographies
        robertCaro     = new Author(caroBirth,
                                    null,
                                    new Name("Robert", 
                                             "Caro"),
                                    "Non-Fiction");

        walterIsaacson = new Author(isaacsonBirth,
                                    null,
                                    new Name("Walter", 
                                             "Isaacson"),
                                    "Non-Fiction");

        martinGilbert  = new Author(gilbertBirth,
                                    gilbertDeath,
                                    new Name("Martin", 
                                             "Gilbert"),
                                    "Non-Fiction");

        ronChernow     = new Author(chernowBirth,
                                    null,
                                    new Name("Ron", 
                                             "Chernow"),
                                    "Non-Fiction");

        // Create authors for autobiographies
        anneFrank      = new Author(frankBirth,
                                    frankDeath,
                                    new Name("Anne", 
                                             "Frank"),
                                    "Non-Fiction");

        nelsonMandela  = new Author(mandelaBirth,
                                    mandelaDeath,
                                    new Name("Nelson", 
                                             "Mandela"),
                                    "Non-Fiction");

        gandhi         = new Author(gandhiBirth,
                                    gandhiDeath,
                                    new Name("Mahatma", 
                                             "Gandhi"),
                                    "Non-Fiction");

        mayaAngelou    = new Author(angelouBirth,
                                    angelouDeath,
                                    new Name("Maya", 
                                             "Angelou"),
                                    "Non-Fiction");

        malcolmX       = new Author(malcolmBirth,
                                    malcolmDeath,
                                    new Name("Malcolm", 
                                             "X"),
                                    "Non-Fiction");

        // Create biography subjects
        robertMoses    = new Person(mosesBirth,
                                    mosesDeath,
                                    new Name("Robert", 
                                             "Moses"));

        steveJobs      = new Person(jobsBirth,
                                    jobsDeath,
                                    new Name("Steve", 
                                             "Jobs"));

        churchill      = new Person(churchillBirth,
                                    churchillDeath,
                                    new Name("Winston", 
                                             "Churchill"));

        hamilton       = new Person(hamiltonBirth,
                                    hamiltonDeath,
                                    new Name("Alexander", 
                                             "Hamilton"));

        einstein       = new Person(einsteinBirth,
                                    einsteinDeath,
                                    new Name("Albert", 
                                             "Einstein"));

        // Create books
        nineteenEightyFour   = new Book("1984",
                                       1949,
                                       georgeOrwell);
        toKillAMockingbird   = new Book("To Kill a Mockingbird",
                                       1960,
                                       harperLee);
        prideAndPrejudice    = new Book("Pride and Prejudice",
                                       1813,
                                       janeAusten);
        greatGatsby          = new Book("The Great Gatsby",
                                       1925,
                                       fitzgerald);
        mobyDick             = new Book("Moby-Dick",
                                       1851,
                                       melville);

        // Create biographies
        powerBroker          = new Biography("The Power Broker",
                                           1974,
                                           robertCaro,
                                           robertMoses);
        steveJobsBio         = new Biography("Steve Jobs",
                                           2011,
                                           walterIsaacson,
                                           steveJobs);
        churchillLife        = new Biography("Churchill: A Life",
                                           1991,
                                           martinGilbert,
                                           churchill);
        hamiltonBio          = new Biography("Alexander Hamilton",
                                           2004,
                                           ronChernow,
                                           hamilton);
        einsteinBio          = new Biography("Einstein: His Life and Universe",
                                           2007,
                                           walterIsaacson,
                                           einstein);

        // Create autobiographies
        diaryOfAYoungGirl    = new Autobiography("The Diary of a Young Girl",
                                                1947,
                                                anneFrank);
        longWalkToFreedom    = new Autobiography("Long Walk to Freedom",
                                                1994,
                                                nelsonMandela);
        experimentsWithTruth  = new Autobiography("The Story of My Experiments with Truth",
                                                1927,
                                                gandhi);
        cagedBirdSings       = new Autobiography("I Know Why the Caged Bird Sings",
                                                1969,
                                                mayaAngelou);
        malcolmXAutobiography = new Autobiography("The Autobiography of Malcolm X",
                                                1965,
                                                malcolmX);

        // Display all books
        nineteenEightyFour.display();
        toKillAMockingbird.display();
        prideAndPrejudice.display();
        greatGatsby.display();
        mobyDick.display();
        powerBroker.display();
        steveJobsBio.display();
        churchillLife.display();
        hamiltonBio.display();
        einsteinBio.display();
        diaryOfAYoungGirl.display();
        longWalkToFreedom.display();
        experimentsWithTruth.display();
        cagedBirdSings.display();
        malcolmXAutobiography.display();

        // Book comparisons by publication year
        System.out.println("\n=== Book Comparisons by Publication Year ===");
        System.out.println("Comparing 1984 (1949) to Moby-Dick (1851):");
        System.out.println("Result: " + nineteenEightyFour.compareTo(mobyDick));

        System.out.println("\nComparing Pride and Prejudice (1813) to Great Gatsby (1925):");
        System.out.println("Result: " + prideAndPrejudice.compareTo(greatGatsby));

        System.out.println("\nChecking if To Kill a Mockingbird equals 1984:");
        System.out.println("Result: " + toKillAMockingbird.equals(nineteenEightyFour));

        // Author comparisons by birth date
        System.out.println("\n=== Author Comparisons by Birth Date ===");
        System.out.println("Comparing George Orwell to Jane Austen:");
        System.out.println("Result: " + georgeOrwell.compareTo(janeAusten));

        System.out.println("\nComparing Maya Angelou to Malcolm X:");
        System.out.println("Result: " + mayaAngelou.compareTo(malcolmX));

        System.out.println("\nChecking if Walter Isaacson equals Ron Chernow:");
        System.out.println("Result: " + walterIsaacson.equals(ronChernow));

        // Biography subject comparisons
        System.out.println("\n=== Biography Subject Comparisons ===");
        System.out.println("Comparing Einstein to Churchill:");
        System.out.println("Result: " + einstein.compareTo(churchill));

        System.out.println("\nComparing Hamilton to Robert Moses:");
        System.out.println("Result: " + hamilton.compareTo(robertMoses));

        System.out.println("\nChecking if Steve Jobs equals Einstein:");
        System.out.println("Result: " + steveJobs.equals(einstein));

        // Demonstrate Reversible interface
        System.out.println("\n=== Reversible Interface Demonstrations ===");
        
        System.out.println("\nOriginal Book Title:");
        nineteenEightyFour.display();
        System.out.println("Reversed Book Title:");
        nineteenEightyFour.backwards();

        System.out.println("\nOriginal Author Name:");
        georgeOrwell.display();
        System.out.println("Reversed Author Name:");
        georgeOrwell.backwards();

        System.out.println("\nOriginal Biography:");
        powerBroker.display();
        System.out.println("Reversed Biography:");
        powerBroker.backwards();

        System.out.println("\nOriginal Autobiography:");
        diaryOfAYoungGirl.display();
        System.out.println("Reversed Autobiography:");
        diaryOfAYoungGirl.backwards();
    }
}
