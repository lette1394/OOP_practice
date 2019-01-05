package Coffee;

public class Customer {
    private Menu menu;
    private Baristar baristar;

    public void order(String menuName) {
        final MenuItem item = menu.choose(menuName);
        final Coffee coffee = baristar.makeCoffee(item);

        this.drink(coffee);
    }

    private void drink(Coffee coffee) {
        System.out.println("drink " + coffee);
    }
}
