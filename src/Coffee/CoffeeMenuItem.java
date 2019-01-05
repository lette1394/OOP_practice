package Coffee;

public class CoffeeMenuItem implements MenuItem {
    private String name;
    private int price;

    CoffeeMenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int cost() {
        return price;
    }

    @Override
    public String toString() {
        return "[" + name + ", "+ price + "]";
    }
}
