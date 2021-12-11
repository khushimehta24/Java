import java.util.Scanner;

public class Dayscalculator {

    public static void main(String[] args) {
        int month, year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        year = sc.nextInt();
        System.out.println("Enter the Month");
        month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 2) {
            if (year % 4 == 0) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
        } else {
            System.out.println("Invalid input! Please enter month number between (1-12).");
        }

    }

}
