
    import java.util.Scanner;

    public class Calender {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();


            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                return;
            }

            displayCalendar(year, month);
            scanner.close();
        }


        public static void displayCalendar(int year, int month) {

            String monthName = getMonthName(month);
            int daysInMonth = getNumberOfDaysInMonth(year, month);


            int firstDay = getFirstDayOfMonth(year, month);


            System.out.println("\n   " + monthName + " " + year);
            System.out.println("---------------------------");
            System.out.printf("%-3s %-3s %-3s %-3s %-3s %-3s %-3s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");


            for (int i = 0; i < firstDay; i++) {
                System.out.print("    ");
            }


            for (int i = 1; i <= daysInMonth; i++) {
                System.out.printf("%-3d ", i);

                if ((i + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }

        public static String getMonthName(int month) {
            String[] monthNames = {
                    "", "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"
            };
            return monthNames[month];
        }

        public static int getNumberOfDaysInMonth(int year, int month) {
            if (month == 2) { // February
                return isLeapYear(year) ? 29 : 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            } else {
                return 31;
            }
        }


        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }


        public static int getFirstDayOfMonth(int year, int month) {

            int d = 1;


            if (month == 1 || month == 2) {
                month += 12;
                year--;
            }

            int y0 = year - (14 - month) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = month + 12 * ((14 - month) / 12) - 2;
            int d0 = (d + x + (31 * m0) / 12) % 7;

            return d0;
        }
    }


