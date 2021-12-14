class Area {
    private int length;
    private int breadth;

    public void setArea(int length, int breadth) // SETTERS(USED FOR PRIVATE VALUE)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int[] getArea() // GETTERS (USED FOR TAKING DATA)
    {
        return new int[] { length, breadth };
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Area rectangle = new Area();
        rectangle.setArea(5, 6);
        int res[] = rectangle.getArea();
        System.out.println("Length is: " + res[0] +
                "\nBreadth is: " + res[1]);
    }
}
