import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        int a, b, c;

        System.out.println("Enter 2 number:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the Operation you want to perform (+, -, *, %, /) : ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                c = a + b;
                System.out.println(c);
                break;
            case '-':
                c = a - b;
                System.out.println(c);
                break;
            case '*':
                c = a * b;
                System.out.println(c);
                break;
            case '%':
                c = a % b;
                System.out.println(c);
                break;
            case '/':
                c = a / b;
                System.out.println(c);
                break;
            default:
                System.out.println("No ouput");
                break;
        }

    }

}
