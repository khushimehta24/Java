import java.util.ArrayList;

public class Lambda {

    public static void main(String[] args) {

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(n -> System.out.print(n + " "));

        System.out.println("\nOutput : ");

        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

    }

}

// Lambda function is a small block of code which takes in a parameter and
// returns a value
