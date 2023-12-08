public class Product implements Item {
    private String productName;
    private int price;

    public Product(String name, int price) {
        this.productName = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return productName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void displayInfo() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }
}
