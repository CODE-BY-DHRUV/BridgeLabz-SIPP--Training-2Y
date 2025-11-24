import java.util.*;

public class Library {
    public static void main(String[] args) {
        Map<String, String> books = new TreeMap<>();

        books.put("978-001", "Java Basics");
        books.put("978-002", "Data Structures");
        books.put("978-003", "Algorithms");

        String isbn = "978-002";
        System.out.println(books.getOrDefault(isbn, "Book not found"));

        books.remove("978-003");

        for(String k : books.keySet())
            System.out.println(k + " = " + books.get(k));

        String title = "Java Basics";
        for(String k : books.keySet()){
            if(books.get(k).equals(title)){
                System.out.println("Found ISBN: " + k);
            }
        }
    }
}
