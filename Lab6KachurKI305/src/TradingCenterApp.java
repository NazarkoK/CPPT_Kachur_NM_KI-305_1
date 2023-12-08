public class TradingCenterApp {
    public static void main(String[] args) {
        ShoppingCart<Item> shoppingCart1 = new ShoppingCart<>();
        ShoppingCart<Item> shoppingCart2 = new ShoppingCart<>();

        Product laptop = new Product("Laptop", 1200);
        Product phone = new Product("Smartphone", 800);
        Product headphones = new Product("Headphones", 100);
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Alice");

        System.out.println("\n" + customer1.getName() + "'s Shopping:");
        shoppingCart1.addItem(laptop);
        shoppingCart1.addItem(phone);
        shoppingCart1.displayItems();
        System.out.println("Total Price: $" + shoppingCart1.calculateTotalPrice());

        System.out.println("\n" + customer2.getName() + "'s Shopping:");
        shoppingCart2.addItem(headphones);
        shoppingCart2.addItem(laptop);
        shoppingCart2.displayItems();
        System.out.println("Total Price: $" + shoppingCart2.calculateTotalPrice());

        // Display the product with the most letters in its name for both customers
        System.out.println(customer1.getName() + "'s product with the most letters: " + shoppingCart1.getProductWithMaxLetters());
        System.out.println(customer2.getName() + "'s product with the most letters: " + shoppingCart2.getProductWithMaxLetters());
    }
}