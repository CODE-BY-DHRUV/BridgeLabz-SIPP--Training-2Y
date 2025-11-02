import java.util.Scanner;
public class bonusSalary {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter your years of service: ");
            int years = sc.nextInt();
            if (years > 5) {
                double bonus = salary * 0.05;
                System.out.println("Congratulations! Your bonus is: " + bonus);
            } else {
                System.out.println("No bonus. You need more than 5 years of service.");
            }

            sc.close();
        }
    }


