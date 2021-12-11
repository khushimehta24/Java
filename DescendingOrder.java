import java.util.Scanner;

public class DescendingOrder {

    public static void main(String[] args) {
        int n;
        int temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:  ");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.print("\nEnter all the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.println("The ascending order is: " + a[k]);

        }

    }
}
