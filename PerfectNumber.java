import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, sum = 0, temp, rem = 0;

        System.out.println("Enter a number: ");
        a = sc.nextInt();
        temp = a;

        for (int i = 1; i < temp; i++) {
            rem = temp % i;
            if (rem == 0) {
                sum = sum + i;
            }
        }
        if (sum == a)
            System.out.println("The number is a Perfect number");
        else
            System.out.println("The number is not a Perfect number");

    }

}