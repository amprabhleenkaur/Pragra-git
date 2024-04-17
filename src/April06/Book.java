package April06;

public class Book {

    public String author;
    public int year;
    public String genre;
    public String name;
    public double price;

    Book(String author, int year, String genre,
         String name, double price){

        this.author = author;
        this.year = year;
        this.genre = genre;
        this.name = name;
        this.price = price;
    }

    Book(String author, String name){
        this.author = author;
        this.name = name;
    }

    public void printDetails(){
        System.out.println("\nName of book: " + name +
                "\nYear of publication: " + year +
                "\nGenre: " + genre +
                "\nAuthored by: " + author +
                "\nPrice: $" + price);
    }

    public void printFewDetails(){
        System.out.println("\nName of book: " +
                name + "\nAuthored by: " + author);
    }
}
