import java.util.Scanner;

public class EquationSolver {

    public static void solveLinearEquation(Scanner sc) {
        System.out.print("Nhap he so a (a != 0): ");
        double a = sc.nextDouble();

        if (a == 0) {
            System.out.println("He so a phai khac 0. Vui long nhap lai.");
            return;
        }

        System.out.print("Nhap hang so b: ");
        double b = sc.nextDouble();

        double x = -b / a;
        System.out.println("Nghiem cua phuong trinh la: x = " + x);
    }

    public static void solveLinearSystem(Scanner sc) {
        System.out.println("He phuong trinh:");
        System.out.println("a11*x1 + a12*x2 = b1");
        System.out.println("a21*x1 + a22*x2 = b2");

        System.out.print("Nhap he so a11: ");
        double a11 = sc.nextDouble();

        System.out.print("Nhap he so a12: ");
        double a12 = sc.nextDouble();

        System.out.print("Nhap hang so b1: ");
        double b1 = sc.nextDouble();

        System.out.print("Nhap he so a21: ");
        double a21 = sc.nextDouble();

        System.out.print("Nhap he so a22: ");
        double a22 = sc.nextDouble();

        System.out.print("Nhap hang so b2: ");
        double b2 = sc.nextDouble();

        double D = a11 * a22 - a12 * a21;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("He phuong trinh co nghiem duy nhat: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh khong co nghiem.");
            }
        }
    }

    public static void solveQuadraticEquation(Scanner sc) {
        System.out.print("Nhap he so a (a != 0): ");
        double a = sc.nextDouble();

        if (a == 0) {
            System.out.println("He so a phai khac 0. Vui long nhap lai.");
            return;
        }

        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap he so c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
            System.out.println("Phuong trinh khong co nghiem.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChon loai phuong trinh de giai:");
            System.out.println("1. Phuong trinh bac nhat 1 an (ax + b = 0)");
            System.out.println("2. He phuong trinh bac nhat 2 an");
            System.out.println("3. Phuong trinh bac hai (ax^2 + bx + c = 0)");
            System.out.println("0. Thoat");

            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation(sc);
                    break;
                case 2:
                    solveLinearSystem(sc);
                    break;
                case 3:
                    solveQuadraticEquation(sc);
                    break;
                case 0:
                    System.out.println("Thoat khoi chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);

        sc.close();
    }
}
