import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int a, sum = 0, rem = 0, temp;

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        temp = a;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;
        }
        if (sum == a)
            System.out.println("The no. is a palindrome ");
        else
            System.out.println("The no. is not a palindrome ");

    }

}
