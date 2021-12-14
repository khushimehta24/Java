import java.util.*;

public class Hashset {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println("HasMap after put(): " + set);

        boolean value1 = set.remove("Two");
        System.out.println("Is Two removed? " + value1);

        System.out.println("HashMap Removing Two: " + set);

        boolean value2 = set.removeAll(set);
        System.out.println("Are all elements removed? " + value2);

        System.out.println("HashMap Removing All: " + set);

    }

}
