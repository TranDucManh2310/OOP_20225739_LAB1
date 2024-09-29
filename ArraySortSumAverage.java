import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = sc.nextDouble();
        }

        Arrays.sort(array);

        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        double average = sum / n;

        System.out.println("Mang sau khi sap xep: " + Arrays.toString(array));
        System.out.println("Tong cac phan tu trong mang: " + sum);
        System.out.println("Gia tri trung binh: " + average);

        sc.close();
    }
}
