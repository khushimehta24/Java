import java.util.Scanner;

public class Fibbonaci {

    public static void main(String[] args) {
        int a = 0, b = 1, result, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        j = sc.nextInt();
        System.out.println("The series is : ");
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i <= j; i++) {

            result = a + b;
            a = b;
            b = result;
            System.out.println(result);

        }

    }

}
