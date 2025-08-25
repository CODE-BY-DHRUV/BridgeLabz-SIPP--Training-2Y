import java.util.Scanner;

public class leapYear {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if (year < 1582) {
                System.out.println("Leap year calculation is only valid for year >= 1582");
            } else {

                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year (Part 1).");
                } else if (year % 100 == 0) {
                    System.out.println(year + " is NOT a Leap Year (Part 1).");
                } else if (year % 4 == 0) {
                    System.out.println(year + " is a Leap Year (Part 1).");
                } else {
                    System.out.println(year + " is NOT a Leap Year (Part 1).");
                }

                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(year + " is a Leap Year (Part 2).");
                } else {
                    System.out.println(year + " is NOT a Leap Year (Part 2).");
                }
            }

            sc.close();
        }
    }

