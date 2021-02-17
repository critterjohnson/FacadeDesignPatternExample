public class Orders {
    private static Database<Integer, Order> ordersDatabase = new Database<Integer, Order>();

    /**
     * Fetches an Order from the Order database.
     * 
     * @param number
     * @return
     */
    public static Order getOrder(int number) {
        return ordersDatabase.get(number);
    }

    /**
     * Places an order and returns either the successful order or null.
     * 
     * @param user the user that is placing the order
     * @param item the item to buy
     * @param count the number of items to buy
     * @return
     */
    public static Order placeOrder(User user, Item item, int count) {
        // check warehouses for  stock
        // reserve item at warehouse
            // check stock database of each warehouse
            // notify the closest warehouse of the order, wait for confirmation
        Order order = new Order(ordersDatabase.size()+1, user, item, count);
        ordersDatabase.put(ordersDatabase.size()+1, order);
        return order;
    }

    /**
     * Places an order using an item name.
     * 
     * @param user the user that is placing the order
     * @param itemName the name of the item to buy
     * @param count the number of items to buy
     * @return
     */
    public static Order placeOrder(User user, String itemName, int count) {
        Item item = new Item(itemName);
        return placeOrder(user, item, count);
    }
}
