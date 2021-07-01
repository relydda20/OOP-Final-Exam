package OOPFinalExam;

public class Book {
    private String title;
    private double price;
    private int yearOfPublication;
    private String authorName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    public Book(String author, String title, double price, int year) {
        this.authorName = authorName;
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
    }




public static void main (String args[]) {
    Book bookstoreBook = new Book(" Raymond Bahana", "Superheroes are Real", 15.50, 1719);
    Book bookstoreBook2 = new Book("Nunung Nurul", "Falling in Love with Polymorphism", 12.80, 1902);
    Book bookstoreBook3 = new Book("Jude Martinez", "Bleh Bleh Bleh Bleh", 9.50, 1996);
    Book bookstoreBook4 = new Book("Ida Bagus", "The Young Doctor", 900, 1974);
}
}