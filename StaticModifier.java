public class StaticModifier {
    public static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public StaticModifier() {
        addInstance();
    }

    public static void main(String[] args) {
        System.out.println("Starting with " + StaticModifier.getCount() + "instances");

        for (int i = 0; i < 10; ++i) {
            new StaticModifier();
        }
        System.out.println("Created " + StaticModifier.numInstances + " instances");
    }

}