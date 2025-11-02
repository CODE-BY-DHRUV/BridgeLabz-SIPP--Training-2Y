import java.util.Scanner;
public class bonusSalary {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                final int EMPLOYEES = 10;

                double[] salary = new double[EMPLOYEES];
                double[] serviceYears = new double[EMPLOYEES];
                double[] bonus = new double[EMPLOYEES];
                double[] newSalary = new double[EMPLOYEES];
                double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

                System.out.println("=== Zara Company Bonus Calculator ===");


                for (int i = 0; i < EMPLOYEES; i++) {
                    System.out.println("\nEnter details for Employee " + (i + 1) + ":");

                    System.out.print("Enter salary: ");
                    double s = sc.nextDouble();
                    if (s <= 0) {
                        System.out.println("Invalid salary! Salary must be greater than 0.");
                        i--;
                        continue;
                    }

                    System.out.print("Enter years of service: ");
                    double y = sc.nextDouble();
                    if (y < 0) {
                        System.out.println("Invalid years of service! Must be 0 or more.");
                        i--;
                        continue;
                    }

                    salary[i] = s;
                    serviceYears[i] = y;
                }


                for (int i = 0; i < EMPLOYEES; i++) {

                    if (serviceYears[i] > 5) {
                        bonus[i] = salary[i] * 0.05;
                    } else {
                        bonus[i] = salary[i] * 0.02;
                    }


                    newSalary[i] = salary[i] + bonus[i];


                    totalBonus += bonus[i];
                    totalOldSalary += salary[i];
                    totalNewSalary += newSalary[i];
                }


                System.out.println("\n=== Bonus Report ===");
                System.out.println("Employee\tOld Salary\tYears of Service\tBonus\t\tNew Salary");
                System.out.println("--------------------------------------------------------------------------");
                for (int i = 0; i < EMPLOYEES; i++) {
                    System.out.printf("%d\t\t%.2f\t\t%.1f\t\t\t%.2f\t\t%.2f\n",
                            (i + 1), salary[i], serviceYears[i], bonus[i], newSalary[i]);
                }

                System.out.println("\n=== Company Totals ===");
                System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
                System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
                System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

                sc.close();
            }
        }


