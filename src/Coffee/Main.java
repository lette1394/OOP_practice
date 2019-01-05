package Coffee;

public class Main {
    public static void main(String[] args) {
        Baristar baristar = new Baristar();
        Menu menu = new Menu();

        Customer customer = new Customer(baristar, menu);

        customer.order("아메리카노");
        customer.drink();

        customer.order("없는메뉴");
        customer.drink();
    }
}
