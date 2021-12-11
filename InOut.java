import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {
        int x, y, z;

        System.out.print("Enter two integers to calculate their sum: ");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        z = x + y;
        System.out.print("\nAdd two number: " + z);

    }

}
