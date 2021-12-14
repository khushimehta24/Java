enum Size1 {
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    private Size1(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}

public class EnumConstructor {

    public static void main(String[] args) {
        Size1 size = Size1.SMALL;
        System.out.println(size.getSize());

    }

}
