 import java.util.ArrayList;

// Order.java
public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;

    public Order(String name) {
        this.name = name;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<>();
    }
}
 
 
 