public class ClothingItem {

    private String itemId;
    private String name;
    private String size;
    private double price;
    private String brand;


    public ClothingItem(String itemId, String name, String size, double price, String brand) {
        this.itemId = itemId;
        this.name = name;
        this.size = size;
        this.price = price;
        this.brand = brand;
    }


    public String getItemId() { return itemId; }
    public String getName() { return name; }
    public String getSize() { return size; }
    public double getPrice() { return price; }
    public String getBrand() { return brand; }


    public void setItemId(String itemId) { this.itemId = itemId; }
    public void setName(String name) { this.name = name; }
    public void setSize(String size) { this.size = size; }
    public void setPrice(double price) { this.price = price; }
    public void setBrand(String brand) { this.brand = brand; }


    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
        System.out.println(name + " discount was applied for. New price: " + price);
    }

    public boolean isPremium() {
        return price > 50000;
    }


    @Override
    public String toString() {
        return "ClothingItem [ID=" + itemId + ", Name=" + name + ", Size=" + size + ", Price=" + price + ", Brand=" + brand + "]";
    }
}