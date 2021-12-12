public class NumberTest {

    public static void main(String[] args) {
        Integer x = 5;
        int y = 6;

        System.out.println("Byte Primitive: " + x.byteValue());
        System.out.println("Double Primitive: " + x.doubleValue());
        System.out.println("Long Primitive: " + x.longValue());

        System.out.println("equals(): " + x.equals(y));

        String str = x.toString();
        System.out.println("toString() : " + str);

        System.out.println("abs() :" + Math.abs(-9));
        System.out.println("ceil() :" + Math.ceil(9.4));
        System.out.println("floor() :" + Math.floor(9.5));
        System.out.println("round() :" + Math.round(9.5));

        System.out.println("min() :" + Math.min(2, 5));
        System.out.println("max() :" + Math.max(2, 5));

        System.out.println("pow() :" + Math.pow(2, 3));
        System.out.println("sqrt() :" + Math.sqrt(81));

        System.out.println("sin() :" + Math.sin(90.0));

        System.out.println("random() :" + Math.random());

    }

}