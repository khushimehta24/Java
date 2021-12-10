public class Array {

    public static void main(String[] args) {
        double[] myList = { 1.9, 2.9, 3.4, 3.5 };

        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " , ");
        }

        myList[1] = 2.0;
        System.out.println("\n" + myList[1]);

    }

}