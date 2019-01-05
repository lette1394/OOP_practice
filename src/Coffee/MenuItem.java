package Coffee;

public class MenuItem {
    private String name;
    private int price;

    MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int cost() {
        return price;
    }

    @Override
    public String toString() {
        return "[" + name + ", "+ price + "]";
    }
}
