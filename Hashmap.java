import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();

        System.out.println("Initial HashMap: " + numbers);

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap after put(): " + numbers);

        System.out.println("Keys: " + numbers.keySet());

        System.out.println("Values: " + numbers.values());

        System.out.println("Key/Value mappings: " + numbers.entrySet());

        numbers.remove("Two");
        System.out.println("HashMap after remove(): " + numbers);

    }

}
