class Order {
    enum Status {
        PLACED, SHIPPED, DELIVERED, CANCELLED
    }

    private Status status;

    public Order() {
        this.status = Status.PLACED;
    }

    public void shipOrder() {
        if (status == Status.PLACED) {
            status = Status.SHIPPED;
        }
    }

    public void deliverOrder() {
        if (status == Status.SHIPPED) {
            status = Status.DELIVERED;
        }
    }

    public Status getStatus() {
        return status;
    }
}
public class NestedEnum {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Order Status: " + order.getStatus());
        
        order.shipOrder();
        System.out.println("Order Status: " + order.getStatus());
        
        order.deliverOrder();
        System.out.println("Order Status: " + order.getStatus());
    }
}
// Order Status: PLACED
// Order Status: SHIPPED
// Order Status: DELIVERED