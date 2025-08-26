import java.util.Scanner;
public class LibraryBookManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String bookTitle = sc.nextLine();
        String authorName = sc.nextLine();
        String bookId = sc.next().toUpperCase();
        boolean isAvailable = sc.nextBoolean();
        int users = sc.nextInt();

        if (users == 0) {
            System.out.println("No ratings available!");
            return;
        }

        int[] bookRatings = new int[users];
        for (int i = 0; i < bookRatings.length; i++) {
            bookRatings[i] = sc.nextInt();
        }


        displayBookInfo(bookTitle, authorName, bookId, isAvailable);


        System.out.println("Author Name Length: " + authorName.length());
        compareAuthorNames(authorName, "Shakespeare");


        System.out.println("===== RATINGS =====");
        for (int i = 0; i < bookRatings.length; i++) {
            System.out.println("Rating " + (i + 1) + " → " + bookRatings[i]);
            if (bookRatings[i] == 1) {
                System.out.println("One user gave a poor rating!");
            }
        }

        int totalRatings = calculateTotalRatings(bookRatings);
        System.out.println("Total Ratings: " + totalRatings);

        double average = calculateAverageRating(bookRatings);
        System.out.println("Average Rating: " + average);

        if (average >= 4) {
            System.out.println("Book Status: Highly Rated Book!");
        } else {
            System.out.println("Book Status: Average Book");
        }
    }

    static void displayBookInfo(String bookTitle, String authorName, String bookId, Boolean isAvailable) {
        System.out.println("===== BOOK INFO =====");
        System.out.println("Title: " + bookTitle.toUpperCase());
        System.out.println("Author: " + authorName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    static double calculateAverageRating(int[] ratings) {
        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum += ratings[i];
        }
        return (double) sum / ratings.length; 
    }

    static int calculateTotalRatings(int[] ratings) {
        return ratings.length;
    }

    static void compareAuthorNames(String a1, String a2) {
        if (a1.equalsIgnoreCase(a2)) {
            System.out.println("Comparing with '" + a2 + "' → Same authors");
        } else {
            System.out.println("Comparing with '" + a2 + "' → Different authors");
        }
    }
}
