import java.util.LinkedList;

public class Linked_List1 {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        int index = numbers.indexOf(2);
        System.out.println("Position of 2 is " + index);

        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);

    }

}
