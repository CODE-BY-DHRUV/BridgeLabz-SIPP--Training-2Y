import java.util.Scanner;

public class gradeMarks {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks in Physics: ");
            int physics = sc.nextInt();
            System.out.print("Enter marks in Chemistry: ");
            int chemistry = sc.nextInt();
            System.out.print("Enter marks in Maths: ");
            int maths = sc.nextInt();
            int total = physics + chemistry + maths;
            double average = (double)total / (double)3.0F;
            String grade;
            String remarks;
            if (average >= (double)90.0F) {
                grade = "A+";
                remarks = "Outstanding Performance";
            } else if (average >= (double)80.0F) {
                grade = "A";
                remarks = "Excellent Work";
            } else if (average >= (double)70.0F) {
                grade = "B";
                remarks = "Good Job";
            } else if (average >= (double)60.0F) {
                grade = "C";
                remarks = "Fair Performance";
            } else if (average >= (double)50.0F) {
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


