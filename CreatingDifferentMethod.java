import java.util.Scanner;

public class CreatingDifferentMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The sum is: " + sumDigits(num));
    }

    public static int sumDigits(int num) {
        int res = 0;

        while (num > 0) {
            res += num % 10;
            num /= 10;
        }

        return res;
    }
}
