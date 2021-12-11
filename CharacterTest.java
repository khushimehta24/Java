public class CharacterTest {

    public static void main(String[] args) {

        System.out.println("isLetter(): " + Character.isLetter('c'));

        System.out.println("isDigit(): " + Character.isDigit('9'));

        System.out.println("isWhitespace(): " + Character.isWhitespace('\n'));

        System.out.println("isUpperCase(): " + Character.isUpperCase('C'));

        System.out.println("isLowerCase(): " + Character.isLowerCase('c'));

        System.out.println("toUpperCase(): " + Character.toUpperCase('c'));

        System.out.println("toLowerCase(): " + Character.toLowerCase('C'));

        String str = Character.toString('C');
        System.out.println("toString(): " + str);
    }

}
