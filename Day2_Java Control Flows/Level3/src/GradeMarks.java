import java.util.Scanner;
public class GradeMarks {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter marks in Physics: ");
            int physics = sc.nextInt();

            System.out.print("Enter marks in Chemistry: ");
            int chemistry = sc.nextInt();

            System.out.print("Enter marks in Maths: ");
            int maths = sc.nextInt();

            int total = physics + chemistry + maths;
            double average = total / 3.0;

            String grade, remarks;

            if (average >= 90) {
                grade = "A+";
                remarks = "Outstanding Performance";
            } else if (average >= 80) {
                grade = "A";
                remarks = "Excellent Work";
            } else if (average >= 70) {
                grade = "B";
                remarks = "Good Job";
            } else if (average >= 60) {
                grade = "C";
                remarks = "Fair Performance";
            } else if (average >= 50) {
                grade = "D";
                remarks = "Needs Improvement";
            } else {
                grade = "F";
                remarks = "Failed - Work Harder";
            }

            System.out.println("\n--- Result ---");
            System.out.println("Physics Marks: " + physics);
            System.out.println("Chemistry Marks: " + chemistry);
            System.out.println("Maths Marks: " + maths);
            System.out.println("Average Marks: " + average + "%");
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
            sc.close();

        }
    }


