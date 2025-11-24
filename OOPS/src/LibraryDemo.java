
import java.util.*;
    abstract class LibraryItem {
        private String itemId;
        private String title;
        private String author;

        public LibraryItem(String itemId, String title, String author) {
            this.itemId = itemId;
            this.title = title;
            this.author = author;
        }
        public String getItemId() { return itemId; }
        public String getTitle() { return title; }
        public String getAuthor() { return author; }

        public abstract int getLoanDuration(); // in days

        public void getItemDetails() {
            System.out.printf("%s | %s by %s | Loan days: %d%n",
                    itemId, title, author, getLoanDuration());
        }
    }

    interface Reservable {
        boolean reserveItem(String userId);
        boolean checkAvailability();
    }

    class Book extends LibraryItem implements Reservable {
        private boolean available = true;

        public Book(String id, String title, String author) {
            super(id, title, author);
        }

        @Override
        public int getLoanDuration() { return 21; }

        @Override
        public boolean reserveItem(String userId) {
            if (available) {
                available = false;
                return true;
            }
            return false;
        }

        @Override
        public boolean checkAvailability() { return available; }
    }

    class Magazine extends LibraryItem {
        public Magazine(String id, String title, String author) {
            super(id, title, author);
        }

        @Override
        public int getLoanDuration() { return 7; }
    }

    class DVD extends LibraryItem implements Reservable {
        private boolean available = true;

        public DVD(String id, String title, String director) {
            super(id, title, director);
        }

        @Override
        public int getLoanDuration() { return 3; }

        @Override
        public boolean reserveItem(String userId) {
            if (available) {
                available = false;
                return true;
            }
            return false;
        }

        @Override
        public boolean checkAvailability() { return available; }
    }
    public class LibraryDemo {
        public static void main(String[] args) {
            List<LibraryItem> items = Arrays.asList(
                    new Book("B001", "Java Fundamentals", "K. Author"),
                    new Magazine("M001", "Tech Monthly", "Editorial"),
                    new DVD("D001", "Inception", "Christopher Nolan")
            );
            for (LibraryItem it : items) {
                it.getItemDetails();
                if (it instanceof Reservable) {
                    Reservable r = (Reservable) it;
                    System.out.println(" Available for reservation: " + r.checkAvailability());
                }
            }
            Book book = (Book) items.get(0);
            System.out.println("Reserving book: " + book.reserveItem("user123"));
            System.out.println("Available now? " + book.checkAvailability());
        }
    }
