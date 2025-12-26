public class Main {
    public static void main(String[] args) {
        System.out.println("The clothing store system has been launched\n");

        ClothingItem item1 = new ClothingItem("I001", "Short", "L", 55000, "Zara");
        Customer customer1 = new Customer("C001", "Aibek", "L", 1200);
        Order order1 = new Order("O555", customer1.getName(), item1.getPrice(), "Processing");

        System.out.println(item1.toString());
        System.out.println("A premium product? " + item1.isPremium());
        item1.applyDiscount(10); // 10% жеңілдік

        System.out.println("\n" + customer1.toString());
        System.out.println("Is there a VIP status? " + customer1.isVIP());
        customer1.addPoints(150);

        System.out.println("\n" + order1.toString());
        order1.completeOrder();
        System.out.println("Last Status: " + order1.getStatus());
    }
}