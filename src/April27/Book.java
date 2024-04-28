package April27;

public class Book {
    public static void main(String[] args) {

        BookAnonymous book = new BookAnonymous() {
            @Override
            public void name() {
                System.out.println("I love Harry Potter.");
            }
        };

        book.name();
    }
}
