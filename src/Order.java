public class Order {
    int number;
    Item item;
    int count;
    User buyer;
    int status;

    public Order(int number, User buyer, Item item, int count) {
        this.buyer = buyer;
        this.item = item;
        this.count = count;
        this.status = 1;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public String toString() {
        return item + " * " + count + ", purchased by: " + buyer.getName();
    }
}
