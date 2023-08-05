public class TestBankAccount {
    public static void main(String[] args) {
        // Test BankAccount methods
        BankAccount account1 = new BankAccount(1000.0, 2000.0);
        BankAccount account2 = new BankAccount(500.0, 3000.0);

        System.out.println("Account 1 Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Account 1 Total Balance: " + account1.getTotalBalance());

        System.out.println("Account 2 Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Account 2 Savings Balance: " + account2.getSavingsBalance());
        System.out.println("Account 2 Total Balance: " + account2.getTotalBalance());

        account1.deposit(500.0, true);
        account2.deposit(1000.0, false);

        account1.withdraw(300.0, false);
        account2.withdraw(2000.0, true);

        System.out.println("Account 1 Total Balance: " + account1.getTotalBalance());
        System.out.println("Account 2 Total Balance: " + account2.getTotalBalance());

        System.out.println("Number of Accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total Amount Stored in all Accounts: " + BankAccount.getTotalAmountStored());
    }
}
