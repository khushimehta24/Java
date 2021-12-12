public class PatternWhile {
    public static void main(String args[]) {
        int i = 5;

        while (i >= 0) {
            i--;
            int j = 0;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.print("\n");
        }

    }
}
