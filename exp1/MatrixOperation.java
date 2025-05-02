import java.util.Scanner;

public class MatrixOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];
        int[][] res = new int[2][2];

        // Input matrices
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Transpose of Matrix 1\n5. Transpose of Matrix 2");
        System.out.println("\nSelect an operation:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Matrix Addition
                System.out.println("Result of Matrix Addition:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        res[i][j] = m1[i][j] + m2[i][j];
                    }
                }
                displayMatrix(res);
                break;

            case 2: // Matrix Subtraction
                System.out.println("Result of Matrix Subtraction:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        res[i][j] = m1[i][j] - m2[i][j];
                    }
                }
                displayMatrix(res);
                break;

            case 3: // Matrix Multiplication
                System.out.println("Result of Matrix Multiplication:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        res[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            res[i][j] += m1[i][k] * m2[k][j];
                        }
                    }
                }
                displayMatrix(res);
                break;

            case 4: // Transpose of Matrix 1
                System.out.println("Transpose of Matrix 1:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        res[i][j] = m1[j][i];
                    }
                }
                displayMatrix(res);
                break;

            case 5: // Transpose of Matrix 2
                System.out.println("Transpose of Matrix 2:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        res[i][j] = m2[j][i];
                    }
                }
                displayMatrix(res);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }

        sc.close();
    }


    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
