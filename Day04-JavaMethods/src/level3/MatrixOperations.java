import java.util.Scanner;
public class MatrixOperations {
        public static int[][] createRandomMatrix(int rows, int cols) {
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = (int) (Math.random() * 10); // Random values between 0-9
                }
            }
            return matrix;
        }

        public static void displayMatrix(int[][] matrix, String name) {
            System.out.println("\n" + name + " Matrix:");
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.printf("%4d", val);
                }
                System.out.println();
            }
        }

        public static int[][] addMatrices(int[][] A, int[][] B) {
            int rows = A.length;
            int cols = A[0].length;
            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = A[i][j] + B[i][j];
                }
            }
            return result;
        }

        public static int[][] subtractMatrices(int[][] A, int[][] B) {
            int rows = A.length;
            int cols = A[0].length;
            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = A[i][j] - B[i][j];
                }
            }
            return result;
        }

        public static int[][] multiplyMatrices(int[][] A, int[][] B) {
            int rowsA = A.length;
            int colsA = A[0].length;
            int rowsB = B.length;
            int colsB = B[0].length;

            if (colsA != rowsB) {
                System.out.println("\nMatrix multiplication not possible: Columns of A != Rows of B");
                return null;
            }

            int[][] result = new int[rowsA][colsB];

            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < colsA; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of rows for Matrix A: ");
            int rowsA = sc.nextInt();
            System.out.print("Enter number of columns for Matrix A: ");
            int colsA = sc.nextInt();

            System.out.print("Enter number of rows for Matrix B: ");
            int rowsB = sc.nextInt();
            System.out.print("Enter number of columns for Matrix B: ");
            int colsB = sc.nextInt();

            int[][] A = createRandomMatrix(rowsA, colsA);
            int[][] B = createRandomMatrix(rowsB, colsB);


            displayMatrix(A, "Matrix A");
            displayMatrix(B, "Matrix B");

            if (rowsA == rowsB && colsA == colsB) {
                displayMatrix(addMatrices(A, B), "A + B (Addition)");
                displayMatrix(subtractMatrices(A, B), "A - B (Subtraction)");
            } else {
                System.out.println("\nAddition and Subtraction not possible: Matrix dimensions do not match.");
            }

            int[][] product = multiplyMatrices(A, B);
            if (product != null) {
                displayMatrix(product, "A x B (Multiplication)");
            }

            sc.close();
        }
    }



