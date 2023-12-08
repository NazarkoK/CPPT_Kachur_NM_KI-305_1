import java.util.ArrayList;

public class ShoppingCart<T extends Item> {
    private ArrayList<T> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println(item.getName() + " added to the shopping cart.");
    }

    public void removeItem(T item) {
        items.remove(item);
        System.out.println(item.getName() + " removed from the shopping cart.");
    }

    public void displayItems() {
        System.out.println("Shopping Cart Contents:");
        for (T item : items) {
            item.displayInfo();
        }
    }

    public int calculateTotalPrice() {
        int total = 0;
        for (T item : items) {
            total += item.getPrice();
        }
        return total;
    }
    public String getProductWithMaxLetters() {
        if (items.isEmpty()) {
            return "Shopping cart is empty.";
        }

        T productWithMaxLetters = items.get(0);

        for (T item : items) {
            if (item.getName().length() > productWithMaxLetters.getName().length()) {
                productWithMaxLetters = item;
            }
        }

        return productWithMaxLetters.getName();
    }
}