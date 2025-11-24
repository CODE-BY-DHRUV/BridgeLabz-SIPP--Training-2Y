import library.books.*;
import library.members.*;
import library.transactions.*;

public class MainApp1 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James Gosling");
        Member m = new Member("Riya");
        Transaction t = new Transaction();

        t.issue(b, m);
    }
}

