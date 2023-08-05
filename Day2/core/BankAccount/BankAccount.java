import java.util.Random;
public class BankAccount {
    private static int numberOfAccounts = 0;
    private static double totalAmountStored = 0.0;
   

    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;

    // Constructor
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        totalAmountStored += (checkingBalance + savingsBalance);
        this.accountNumber = generateAccountNumber();
    }
    // Getters
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
     // Method to deposit money into either checking or savings
    public void deposit(double amount, boolean isChecking) {
        if (isChecking) {
            checkingBalance += amount;
        } else {
            savingsBalance += amount;
        }
        totalAmountStored += amount;
    }
     // Method to withdraw money from either checking or savings
    public void withdraw(double amount, boolean isChecking) {
        if (isChecking) {
            if (amount <= checkingBalance) {
                checkingBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in the checking account.");
            }
        } else {
            if (amount <= savingsBalance) {
                savingsBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in the savings account.");
            }
        }
    }
        
    // Method to see the total money from checking and savings
    public double getTotalBalance() {
        return checkingBalance + savingsBalance;
    }
    // Private method to generate a random ten-digit account number
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(random.nextInt(10));
        }
        return accountNumber.toString();
    }
    // Static getter for the number of accounts created so far
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    // Static getter for the total amount of money stored in all accounts
    public static double getTotalAmountStored() {
        return totalAmountStored;
    }

}