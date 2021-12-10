import java.util.Scanner;
import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, sum = 0, temp, rem, digit = 0, b;
        System.out.println("Enter the number: ");
        a = sc.nextInt();
        temp = a;
        while (temp > 0) {
            rem = temp % 10;
            digit += 1;
            temp = temp / 10;
        }

        temp = a;
        while (temp > 0) {
            rem = temp % 10;
            b = (int) Math.pow(rem, digit);
            sum = sum + b;
            temp = temp / 10;
        }
        // System.out.println(sum);
        if (sum == a)
            System.out.println("The number is Armstrong number");
        else
            System.out.println("The number is not Armstrong number");

    }

}