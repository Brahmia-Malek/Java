import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
  this.name = "Guest";
  this.items = new ArrayList<Item>();
}
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS

    
     // Method to get the status message for the order
    public String getStatusMessage() {
        if (isOrderReady()) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
     // Method to calculate and get the total amount of the order
    public double getOrderTotal() {
        double totalAmount = 0.0;

        // Iterate through each item in the order and sum up their prices
        for (Item item : items) {
            totalAmount += item.getPrice();
        }

        return totalAmount;
    }
     // Method to display the order information
    public void display() {
        System.out.println("Customer Name: " + name);
        
        // Print each item and its price
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        // Print the total amount of the order
        System.out.println("Total: $" + getOrderTotal());
    }

    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    // GETTERS & SETTERS
     public String getName(){
  return this.name;
}

public void setName(String newName){
  this.name = newName;
}
  public ArrayList<Item> getItems() {
        return items;
    }
    
    
}

