import java.util.Scanner;
public class FindHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Formula: (n * (n - 1)) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.printf("The maximum number of possible handshakes among %d students is %d%n",
                numberOfStudents, handshakes);

        sc.close();
    }
}
