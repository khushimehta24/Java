import java.util.Scanner;

public class ArrayTwo {

    public static void main(String[] args) {
        int n, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:  ");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.print("\nEnter all the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        System.out.println("\nSum of numbers:" + sum);
    }

}
