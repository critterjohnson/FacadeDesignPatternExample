import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private ArrayList<Order> orders;

    public User(String name) {
        this.name = name;
        orders = new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
