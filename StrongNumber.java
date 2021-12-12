import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, fact = 1, temp, rem = 0, sum = 0;

        System.out.println("Enter the number: ");
        a = sc.nextInt();
        temp = a;

        while (temp > 0) {
            rem = temp % 10;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            temp = temp / 10;
            fact = 1;
        }
        System.out.println(sum);
        if (a == sum)
            System.out.println("The number is a strong number");
        else
            System.out.println("The number is not a strong number");

    }

}