package Coffee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu() {

        List<MenuItem> initial = new ArrayList<>(
                Arrays.asList(
                    new CoffeeMenuItem("아메리카노", 4500),
                    new CoffeeMenuItem("카푸치노", 3500),
                    new CoffeeMenuItem("프라프치노", 6000),
                    new CoffeeMenuItem("허니브레드", 8000)
                )
        );

        items = new ArrayList<>();
        items.addAll(initial);
    }

    public MenuItem choose(String name) {
        for (MenuItem item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }

        return NullMenuItem.getInstance();
    }
}
