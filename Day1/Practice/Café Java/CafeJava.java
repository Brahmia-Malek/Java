public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripePrice = 4.5;
        double lattePrice = 2.5;
        double cappuccinoPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
     
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
          if (isReadyOrder4) {
            int total = 5; // Assuming the total cost of the cappuccino is $5
            System.out.println("Your cappuccino order is ready! Total amount: $" + total);
        } else {
            System.out.println("Your cappuccino order is still being prepared. Please wait.");
        }
         System.out.println(generalGreeting + customer2);
        int numberOfLattes = 2;
       
        double total = numberOfLattes * lattePrice;

        System.out.println("Total cost for " + numberOfLattes + " lattes: $" + total);

      
          
        if (isReadyOrder2=false) {
            System.out.println("Your latte order is ready!");
        } else {
            System.out.println("Your latte order is still being prepared. Please wait.");
        }

          System.out.println(generalGreeting + customer3);
            int numberOfLattes2 = 1; // Jimmy ordered 1 latte
        double total1 = numberOfLattes2 * lattePrice;

        System.out.println("Total cost for " + numberOfLattes + " latte(s): $" + total);

        // Calculate the difference in price
        double difference = lattePrice -  dripePrice;
        System.out.println("You were charged for a coffee but ordered a latte.");
        System.out.println("Please pay the difference: $" + difference);
    }
}
