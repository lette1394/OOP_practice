package Coffee;

public class Customer {
    private Menu menu;
    private Baristar baristar;

    private Coffee coffee;

    public Customer(Baristar baristar, Menu menu) {
        this.baristar = baristar;
        this.menu = menu;
    }

    public void order(String menuName) {
        final MenuItem item = menu.choose(menuName);
        final Coffee coffee = baristar.makeCoffee(item);

        this.coffee = coffee;
    }

    public void drink() {
        System.out.println("drink " + coffee);
    }
}
