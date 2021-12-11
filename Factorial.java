import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int a = 1, fact = 1;

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("the factorial is: " + fact);

    }

}
