import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class PrettyClient {
    public static void main(String[] args) {
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
                Orders.placeOrder(user, item, count);
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
