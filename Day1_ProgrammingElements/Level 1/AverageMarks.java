import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int total = 300;
        int avg = (maths + physics + chemistry) * 100 / total;
        System.out.println(avg);
    }
}
