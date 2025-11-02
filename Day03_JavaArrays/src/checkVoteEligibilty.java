import java.util.Scanner;
public class checkVoteEligibilty {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("===== MENU =====");
            System.out.println("1. Voting Eligibility for 10 Students");
            System.out.println("2. Check Positive/Negative for 5 Numbers");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int[] ages = new int[10];
                    System.out.println("Enter the ages of 10 students:");
                    for (int i = 0; i < ages.length; i++) {
                        System.out.print("Student " + (i + 1) + ": ");
                        ages[i] = sc.nextInt();
                    }

                    for (int i = 0; i < ages.length; i++) {
                        if (ages[i] < 0) {
                            System.out.println("Invalid age entered for student " + (i + 1));
                        } else if (ages[i] >= 18) {
                            System.out.println("The student with the age " + ages[i] + " can vote.");
                        } else {
                            System.out.println("The student with the age " + ages[i] + " cannot vote.");
                        }
                    }
                    break;

                case 2:
                    int[] numbers = new int[5];
                    System.out.println("Enter 5 numbers:");
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print("Number " + (i + 1) + ": ");
                        numbers[i] = sc.nextInt();
                    }

                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i] > 0) {
                            System.out.println("The number " + numbers[i] + " is Positive.");
                        } else if (numbers[i] < 0) {
                            System.out.println("The number " + numbers[i] + " is Negative.");
                        } else {
                            System.out.println("The number is Zero.");
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please run the program again.");
            }

            sc.close();
        }
    }


