public class Test {
    public static void main(String[] args) {
        // Test the constructor with no arguments
        Order order1 = new Order();
        System.out.println("Customer Name: " + order1.getName()); // Output: Guest
        order1.addItem(new Item("drip coffee", 1.50));
        order1.addItem(new Item("capuccino", 3.50));
        order1.display(); // Output: Customer Name: Guest; drip coffee - $1.50; capuccino - $3.50; Total: $5.00
        System.out.println();
    }
}
//         // Test the constructor with a name argument
//         Order order2 = new Order("John Doe");
//         System.out.println("Customer Name: " + order2.getName()); // Output: John Doe
//         order2.addItem(new Item("latte", 2.75));
//         order2.display(); // Output: Customer Name: John Doe; latte - $2.75; Total: $2.75
//         System.out.println();

//         // Test getOrderTotal method
//         Order order3 = new Order("Jane Smith");
//         order3.addItem(new Item("muffin", 1.99));
//         order3.addItem(new Item("croissant", 2.25));
//         System.out.println("Total Amount: $" + order3.getOrderTotal()); // Output: Total Amount: $4.24
//     }
// }
// public class OrderTest {
//     public static void main(String[] args) {
//         // Test the constructor with no arguments
//         Order order1 = new Order();
//         System.out.println("Customer Name: " + order1.getName()); // Output: Guest
//         order1.addItem(new Item("drip coffee", 1.50));
//         order1.addItem(new Item("capuccino", 3.50));
//         order1.display(); // Output: Customer Name: Guest; drip coffee - $1.50; capuccino - $3.50; Total: $5.00
//         System.out.println();

//         // Test the constructor with a name argument
//         Order order2 = new Order("John Doe");
//         System.out.println("Customer Name: " + order2.getName()); // Output: John Doe
//         order2.addItem(new Item("latte", 2.75));
//         order2.display(); // Output: Customer Name: John Doe; latte - $2.75; Total: $2.75
//         System.out.println();

//         // Test getOrderTotal method
//         Order order3 = new Order("Jane Smith");
//         order3.addItem(new Item("muffin", 1.99));
//         order3.addItem(new Item("croissant", 2.25));
//         System.out.println("Total Amount: $" + order3.getOrderTotal()); // Output: Total Amount: $4.24
//     }
// }
