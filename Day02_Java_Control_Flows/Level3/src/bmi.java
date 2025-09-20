import java.util.Scanner;
public class bmi {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter weight in kilograms: ");
    double weight = sc.nextDouble();

    System.out.print("Enter height in centimeters: ");
    double heightCm = sc.nextDouble();
    double heightM = heightCm / 100;
    double bmi = weight / (heightM * heightM);
    System.out.printf("Your BMI is: %.2f%n", bmi);
    if (bmi < 18.5) {
        System.out.println("You are Underweight.");
    }
    else if (bmi >= 18.5 && bmi < 25) {
        System.out.println("You are Normal weight.");
            }
    else if (bmi >= 25 && bmi < 30) {
        System.out.println("You are Overweight.");
            }
    else {
        System.out.println("You are Obese.");
            }
        }
}




