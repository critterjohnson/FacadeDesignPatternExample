import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class UglyClient {
    public static void main(String[] args) {
        Database<Integer, Order> orders = new Database<Integer, Order>(); // think of this like a connection to a database server

        Scanner scan = new Scanner(System.in);
        Console console = System.console();

        System.out.print("Hello, please log in:\nusername: ");
        String username = scan.nextLine();
        console.readPassword("password: ");

        User user = new User(username);
        System.out.println("Hello, " + username + "!");

        while (true) {
            System.out.print("What would you like to do {buy, list orders, quit}: ");
            String action = scan.nextLine();
            if (action == "") {
                action = scan.nextLine();
            }

            if (action.equals("buy")) {
                System.out.println("\nWhat would you like to buy?");
                String item = scan.nextLine();
        
                System.out.println("And how many do you want?");
                int count = scan.nextInt();
        
                System.out.println("Creating order...");
                // check warehouses for  stock
                // reserve item at warehouse
                    // check stock database of each warehouse
                    // notify the closest warehouse of the order, wait for confirmation
                Item itemObj = new Item(item);
                Order order = new Order(orders.size()+1, user, itemObj, count);
                orders.put(orders.size()+1, order);
                user.addOrder(order);
            } else if (action.equals("list orders")) {
                List<Order> userOrders = user.getOrders();
                for (Order o : userOrders) {
                    System.out.println(o);
                }
            } else if (action.equals("") || action.equals("quit")) {
                System.out.println("quitting");
                break;
            }
    
        }

        scan.close();
    }
}
