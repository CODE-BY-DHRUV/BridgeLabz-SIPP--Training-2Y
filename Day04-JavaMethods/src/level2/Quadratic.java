import java.util.Scanner;
public class Quadratic {
        public static double[] findRoots(double a, double b, double c) {
            double delta = Math.pow(b, 2) - 4 * a * c; // discriminant


            if (delta < 0) {
                return new double[0];
            }


            if (delta == 0) {
                double root = -b / (2 * a);
                return new double[]{root};
            }

            double sqrtDelta = Math.sqrt(delta);
            double root1 = (-b + sqrtDelta) / (2 * a);
            double root2 = (-b - sqrtDelta) / (2 * a);
            return new double[]{root1, root2};
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("=== Quadratic Equation Solver ===");
            System.out.print("Enter coefficient a: ");
            double a = sc.nextDouble();
            System.out.print("Enter coefficient b: ");
            double b = sc.nextDouble();
            System.out.print("Enter coefficient c: ");
            double c = sc.nextDouble();


            if (a == 0) {
                System.out.println("Coefficient 'a' cannot be 0 for a quadratic equation.");
                return;
            }


            double[] roots = findRoots(a, b, c);


            if (roots.length == 0) {
                System.out.println("No real roots exist for the given quadratic equation.");
            } else if (roots.length == 1) {
                System.out.println("The quadratic equation has one root: " + roots[0]);
            } else {
                System.out.println("The quadratic equation has two roots: " + roots[0] + " and " + roots[1]);
            }

            sc.close();
        }
    }


