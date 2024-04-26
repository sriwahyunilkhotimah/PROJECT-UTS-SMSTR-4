import java.util.List;
import java.util.ArrayList;

class Order {
    private List<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void displayOrder() {
        double total = 0;
        System.out.println("Your Order:");
        for (MenuItem item : items) {
            item.display();
            total += item.getPrice();
        }
        System.out.println("Total: Rp" + total);
    }
}
