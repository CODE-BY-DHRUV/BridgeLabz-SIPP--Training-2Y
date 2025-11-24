import java.util.Random;
public class EmployeeBonusCalculator {

        public static int[][] generateSalaryAndService(int numberOfEmployees) {
            Random random = new Random();
            int[][] data = new int[numberOfEmployees][2]; // [salary, yearsOfService]

            for (int i = 0; i < numberOfEmployees; i++) {
                data[i][0] = 10000 + random.nextInt(90000); // 5-digit salary (10000 - 99999)
                data[i][1] = 1 + random.nextInt(10); // years of service (1 - 10)
            }
            return data;
        }

        public static double[][] calculateNewSalaryAndBonus(int[][] data) {
            double[][] result = new double[data.length][2]; // [bonus, newSalary]

            for (int i = 0; i < data.length; i++) {
                int salary = data[i][0];
                int years = data[i][1];

                double bonusRate = (years > 5) ? 0.05 : 0.02; // 5% if >5 years, else 2%
                double bonus = salary * bonusRate;
                double newSalary = salary + bonus;

                result[i][0] = bonus;
                result[i][1] = newSalary;
            }
            return result;
        }


        public static void calculateTotals(int[][] data, double[][] updatedData) {
            double totalOldSalary = 0;
            double totalNewSalary = 0;
            double totalBonus = 0;

            System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Emp ID", "Old Salary", "Years Service", "Bonus", "New Salary");
            System.out.println("--------------------------------------------------------------------------------");

            for (int i = 0; i < data.length; i++) {
                int salary = data[i][0];
                int years = data[i][1];
                double bonus = updatedData[i][0];
                double newSalary = updatedData[i][1];

                System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f%n",
                        (i + 1), (double) salary, years, bonus, newSalary);


                totalOldSalary += salary;
                totalNewSalary += newSalary;
                totalBonus += bonus;
            }

            System.out.println("--------------------------------------------------------------------------------");
            System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n",
                    "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
        }

        public static void main(String[] args) {
            int numberOfEmployees = 10;


            int[][] data = generateSalaryAndService(numberOfEmployees);


            double[][] updatedData = calculateNewSalaryAndBonus(data);


            calculateTotals(data, updatedData);
        }
    }


