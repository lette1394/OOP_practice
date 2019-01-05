package Coffee;

public class Coffee {
    private MenuItem menuItem;

    public Coffee(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public String getName() {
        return menuItem.getName();
    }

    public int price() {
        return menuItem.cost();
    }

    @Override
    public String toString() {
        return getName() + price();
    }
}
