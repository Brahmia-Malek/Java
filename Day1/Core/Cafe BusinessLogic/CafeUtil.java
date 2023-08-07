import java.util.ArrayList;

public class CafeUtil {

    // Method to get the streak goal sum for 10 weeks
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // Method to calculate the order total from an array of prices
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    // Method to display the menu items and their indices
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    // Method to add a customer to the given list and display the updated list
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        int numCustomers = customers.size();
        System.out.println("There are " + numCustomers + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }

    // Ninja Bonus: Method to print the price chart for a product
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double totalPrice = price * i;
            System.out.println(i + " - $" + totalPrice);
        }
    }

    // Sensei Bonus: Overloaded method to display menu with prices
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i) + " -- $" + prices.get(i));
        }
        return true;
    }
}