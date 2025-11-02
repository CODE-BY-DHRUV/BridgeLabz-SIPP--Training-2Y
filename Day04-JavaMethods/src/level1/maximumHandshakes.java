
    import java.util.Scanner;
    public class maximumHandshakes {
        public static int calculateHandshakes(int numberOfStudents) {
            return (numberOfStudents * (numberOfStudents - 1)) / 2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of students: ");
            int numberOfStudents = sc.nextInt();

            if (numberOfStudents <= 1) {
                System.out.println("At least 2 students are needed for a handshake.");
            } else {

                int maxHandshakes = calculateHandshakes(numberOfStudents);

                System.out.println("The maximum number of possible handshakes among "
                        + numberOfStudents + " students is: " + maxHandshakes);
            }

            sc.close();
        }
    }


