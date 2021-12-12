public class StringTest {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);

        System.out.println("String Length is : " + str.length());
        System.out.println("charAt(): " + str.charAt(0));
        System.out.println("endsWith(): " + str.endsWith("World ! !"));
        System.out.println("indexOf(): " + str.indexOf('o', 5));
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("replace(): " + str.replace('!', '.'));

        String str1 = "Hello,";
        String str2 = "Hello,";
        System.out.println("concat() : " + str1.concat(str2));
        System.out.println("equals():" + str1.equals(str2));

    }

}
