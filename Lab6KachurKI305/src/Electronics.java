public class Electronics implements Item {
    private String electronicName;
    private int price;

    public Electronics(String name, int price) {
        this.electronicName = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return electronicName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + electronicName + ", Price: " + price);
    }
}
