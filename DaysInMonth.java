
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            System.out.print("Nhap thang (ten, viet tat, hoac so): ");
            monthInput = sc.nextLine().trim();
            
            System.out.print("Nhap nam (so khong am): ");
            year = sc.nextInt();
            sc.nextLine();

            if (year < 0) {
                System.out.println("Nam khong hop le. Vui long nhap lai.");
                continue;
            }

            int month = convertMonthInput(monthInput);
            if (month == -1) {
                System.out.println("Thang khong hop le. Vui long nhap lai.");
                continue;
            }

            int days = getDaysInMonth(month, year);
            System.out.println("So ngay trong " + monthInput + " " + year + " la: " + days);
            break;
        }

        sc.close();
    }

    public static int convertMonthInput(String monthInput) {
        monthInput = monthInput.toLowerCase();
        switch (monthInput) {
            case "january": case "jan": case "jan.": case "1": return 1;
            case "february": case "feb": case "feb.": case "2": return 2;
            case "march": case "mar": case "mar.": case "3": return 3;
            case "april": case "apr": case "apr.": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "jun.": case "6": return 6;
            case "july": case "jul": case "jul.": case "7": return 7;
            case "august": case "aug": case "aug.": case "8": return 8;
            case "september": case "sep": case "sep.": case "9": return 9;
            case "october": case "oct": case "oct.": case "10": return 10;
            case "november": case "nov": case "nov.": case "11": return 11;
            case "december": case "dec": case "dec.": case "12": return 12;
            default: return -1;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}