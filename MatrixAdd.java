import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so hang cua ma tran: ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Nhap phan tu cho ma tran 1:");
        inputMatrix(sc, matrix1, rows, cols);
        
        System.out.println("Nhap phan tu cho ma tran 2:");
        inputMatrix(sc, matrix2, rows, cols);

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Ma tran 1:");
        printMatrix(matrix1);
        
        System.out.println("Ma tran 2:");
        printMatrix(matrix2);
        
        System.out.println("Tong hai ma tran:");
        printMatrix(sumMatrix);

        sc.close();
    }

    public static void inputMatrix(Scanner sc, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap phan tu [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "  ");
            }
            System.out.println();
        }
    }
}
