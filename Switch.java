import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        char grade;

        System.out.println("Enter your Grade : ");
        Scanner sc = new Scanner(System.in);
        grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }

}
