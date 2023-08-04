import java.util.ArrayList;

// TestOrders.java
public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 5.5);
        Item item3 = new Item("drip coffee", 3.0);
        Item item4 = new Item("cappuccino", 4.0);

        // Order variables
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Printing order1
        System.out.println(order1.name);

        // Predict what will happen if you print order1.total
        System.out.println(order1.total);

        // Add item1 to order2's item list and increment the order's total
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 ordered a cappuccino. Add the cappuccino to their order list and update their tab.
        order3.items.add(item4);
        order3.total += item4.price;

        // order4 added a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri’s order is now ready. Update her status.
        order1.ready = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2); // Add two lattes
        order4.total += (2 * item2.price); // Update total accordingly

        // Jimmy’s order is now ready. Update his status.
        order2.ready = true;

        // Display the updated orders
        System.out.println(order1.name + ": " + order1.ready);
        System.out.println(order2.items.size() + ": " + order2.items.size());
        System.out.println(order3.name + ":" + order2.total);
        System.out.println(order4.name + ":" + order3.total);
    }
}