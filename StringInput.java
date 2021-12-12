import java.util.Scanner;

public class StringInput {

    public static void main(String[] args) {
        String name;

        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();

        System.out.println("Your name is:" + name);

    }

}
