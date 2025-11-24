package library.books;

public class Book {
    public String title;
    public String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public String toString() {
        return title + " by " + author;
    }
}
