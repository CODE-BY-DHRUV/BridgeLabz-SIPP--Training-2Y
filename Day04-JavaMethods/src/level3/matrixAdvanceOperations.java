import java.util.Scanner;
public class matrixAdvanceOperations {
        public static int[][] createRandomMatrix(int rows, int cols) {
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = (int) (Math.random() * 10); // Random numbers between 0-9
                }
            }
            return matrix;
        }
        public static void displayMatrix(double[][] matrix, String name) {
            System.out.println("\n" + name + " Matrix:");
            for (double[] row : matrix) {
                for (double val : row) {
                    System.out.printf("%8.2f", val);
                }
                System.out.println();
            }
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
        public static int[][] transposeMatrix(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] transpose = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }
            return transpose;
        }

        public static int determinant2x2(int[][] matrix) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }

        public static int determinant3x3(int[][] matrix) {
            int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
            int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
            int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];

            return (a * (e * i - f * h)) - (b * (d * i - f * g)) + (c * (d * h - e * g));
        }

        public static double[][] inverse2x2(int[][] matrix) {
            double det = determinant2x2(matrix);
            if (det == 0) {
                System.out.println("Inverse not possible, determinant is 0.");
                return null;
            }

            double[][] inverse = new double[2][2];
            inverse[0][0] = matrix[1][1] / det;
            inverse[0][1] = -matrix[0][1] / det;
            inverse[1][0] = -matrix[1][0] / det;
            inverse[1][1] = matrix[0][0] / det;
            return inverse;
        }

        public static double[][] inverse3x3(int[][] matrix) {
            double det = determinant3x3(matrix);
            if (det == 0) {
                System.out.println("Inverse not possible, determinant is 0.");
                return null;
            }

            double[][] inverse = new double[3][3];


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int[][] minor = new int[2][2];
                    int mRow = 0, mCol;

                    for (int row = 0; row < 3; row++) {
                        if (row == i) continue;
                        mCol = 0;
                        for (int col = 0; col < 3; col++) {
                            if (col == j) continue;
                            minor[mRow][mCol++] = matrix[row][col];
                        }
                        mRow++;
                    }


                    double cofactor = Math.pow(-1, i + j) * determinant2x2(minor);
                    inverse[j][i] = cofactor / det; // transpose here
                }
            }
            return inverse;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Matrix Operations: Transpose, Determinant, and Inverse");
            System.out.print("Enter matrix size (2 or 3): ");
            int size = sc.nextInt();

            if (size != 2 && size != 3) {
                System.out.println("Only 2x2 or 3x3 matrices are supported.");
                return;
            }


            int[][] matrix = createRandomMatrix(size, size);


            displayMatrix(matrix, "Original");

            int[][] transpose = transposeMatrix(matrix);
            displayMatrix(transpose, "Transpose");


            if (size == 2) {
                int det = determinant2x2(matrix);
                System.out.println("\nDeterminant: " + det);


                double[][] inverse = inverse2x2(matrix);
                if (inverse != null) {
                    displayMatrix(inverse, "Inverse");
                }

            } else if (size == 3) {
                int det = determinant3x3(matrix);
                System.out.println("\nDeterminant: " + det);


                double[][] inverse = inverse3x3(matrix);
                if (inverse != null) {
                    displayMatrix(inverse, "Inverse");
                }
            }

            sc.close();
        }
    }


