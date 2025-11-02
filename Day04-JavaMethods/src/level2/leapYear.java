import java.util.Scanner;
public class leapYear {
        public static boolean isLeapYear(int year) {
            boolean conditionA = (year % 4 == 0 && year % 100 != 0);
            boolean conditionB = (year % 400 == 0);
            return conditionA || conditionB;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a year (>= 1582): ");
            int year = sc.nextInt();
            if (year < 1582) {
                System.out.println("Error: The program works only for years 1582 and above.");
            } else {
                if (isLeapYear(year)) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is NOT a Leap Year.");
                }
            }

            sc.close();
        }
    }


