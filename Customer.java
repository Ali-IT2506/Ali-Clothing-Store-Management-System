public class Customer {
    private String customerId;
    private String name;
    private String preferredSize;
    private int points;

    public Customer(String customerId, String name, String preferredSize, int points) {
        this.customerId = customerId;
        this.name = name;
        this.preferredSize = preferredSize;
        this.points = points;
    }

    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getPreferredSize() { return preferredSize; }
    public int getPoints() { return points; }

    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public void setName(String name) { this.name = name; }
    public void setPreferredSize(String preferredSize) { this.preferredSize = preferredSize; }
    public void setPoints(int points) { this.points = points; }


    public boolean isVIP() {
        return points > 1000;
    }

    public void addPoints(int earnedPoints) {
        this.points += earnedPoints;
        System.out.println(name + " to the client " + earnedPoints + " points added.");
    }

    @Override
    public String toString() {
        return "Customer [ID=" + customerId + ", Name=" + name + ", Size=" + preferredSize + ", Points=" + points + "]";
    }
}