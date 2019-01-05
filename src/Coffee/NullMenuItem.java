package Coffee;

public class NullMenuItem implements MenuItem {
    private static NullMenuItem instance;

    private NullMenuItem() {}

    public static NullMenuItem getInstance() {
        if (instance == null) {
            instance = new NullMenuItem();
            return instance;
        }
        return instance;
    }

    @Override
    public String getName() {
        return "invalid menu item name";
    }

    @Override
    public int cost() {
        return -1;
    }

    @Override
    public String toString() {
        return "";
    }
}
