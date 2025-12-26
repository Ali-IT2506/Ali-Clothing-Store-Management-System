public class Order {
    private String orderId;
    private String customerName;
    private double total;
    private String status;

    public Order(String orderId, String customerName, double total, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.total = total;
        this.status = status;
    }


    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getTotal() { return total; }
    public String getStatus() { return status; }

    public void setOrderId(String orderId) { this.orderId = orderId; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setTotal(double total) { this.total = total; }
    public void setStatus(String status) { this.status = status; }


    public void completeOrder() {
        this.status = "Completed";
        System.out.println("Order #" + orderId + " completed successfully.");
    }

    public void cancelOrder() {
        this.status = "Cancelled";
        this.total = 0;
        System.out.println("Order #" + orderId + " stopped.");
    }

    @Override
    public String toString() {
        return "Order [ID=" + orderId + ", Client=" + customerName + ", Total=" + total + ", Status=" + status + "]";
    }
}