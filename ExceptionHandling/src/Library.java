import java.util.*;

class BookNotAvailableException extends Exception { public BookNotAvailableException(String m){super(m);} }
class InvalidReturnException extends Exception { public InvalidReturnException(String m){super(m);} }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String m){super(m);} }

class Library {
    Map<String, Boolean> books = new HashMap<>();
    int borrowedCount = 0;

    public Library() {
        books.put("Java", true);
        books.put("Python", false);
    }

    public void borrow(String book) throws Exception {
        if (borrowedCount >= 5)
            throw new UserLimitExceededException("You cannot borrow more than 5 books!");

        if (!books.containsKey(book) || !books.get(book))
            throw new BookNotAvailableException("Book is not available!");

        books.put(book, false);
        borrowedCount++;
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook(String book) throws InvalidReturnException {
        if (!books.containsKey(book) || books.get(book))
            throw new InvalidReturnException("Invalid return attempt!");

        books.put(book, true);
        System.out.println("Book returned!");
    }
}

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        try {
            lib.borrow("Python");
        } catch (Exception e) {
            System.out.println("Library Error: " + e.getMessage());
        }
    }
}

