import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        System.out.println("=== Student Voting Eligibility Checker ===");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < 10; i++) {
            int age = ages[i];
            boolean eligible = checker.canStudentVote(age);

            if (age < 0) {
                System.out.println("Student " + (i + 1) + " has invalid age: " + age);
            } else if (eligible) {
                System.out.println("Student " + (i + 1) + " (Age: " + age + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + age + ") is NOT eligible to vote.");
            }
        }

        sc.close();
    }
}
