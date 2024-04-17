package April06;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Jim Collins",
                2023, "Non-fiction",
                "Good to great", 49.99);

        book.printDetails();

        Book book1 = new Book("Robert Kiyoski",
                2014, "Non-fiction", "Rich Dad" +
                " Poor Dad", 35.99);
        book1.printDetails();

        Book book2 = new Book("J.K.Rowling",
                "Harry Potter");
        book2.printFewDetails();

        Book book3 = new Book("Michelle Obama",
                "The light you carry");
        book3.printFewDetails();



    }
}
