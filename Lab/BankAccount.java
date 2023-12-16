// BankAccount class representing a bank account with holder name, bank name, and balance
class BankAccount {
   
     // To store the account holder's name
  private String accountHolderName;

    //To store the bank name 
  private String bankName;

  //To get accountBalance 
  private double accountBalance;

     // Constructor to initialize account details
  public BankAccount(String accountHolderName, String bankName, double accountBalance) {
    this.accountHolderName = accountHolderName;
    this.bankName = bankName;
    this.accountBalance = accountBalance;
  }

  //To return the current balance 
  public double getBalance() {
    return this.accountBalance;
  }
 
   // Deposit a specified amount to the account and update balance
  public void deposit(double amount) {
    // Add the amount to the balance
    this.accountBalance += amount;
    // Print a message confirming the deposit and new balance
    System.out.println("Deposited $" + amount + ". New balance: $" + getBalance());
  }
  
  // Withdraw a specified amount from the account (if sufficient funds) and update balance
  public void withdraw(double amount) {
    // Check if enough funds are available
    if (amount > accountBalance) {
        // Print a message indicating insufficient funds and current balance 
      System.out.println("Insufficient funds. Available balance: $" + getBalance());
    } else {
        // Subtract the amount from the balance
      this.accountBalance -= amount;
      // Print a message confirming the withdrawal and new balance
      System.out.println("Withdrawn $" + amount + ". New balance: $" + getBalance());
    }
  }


 

  public static void main(String[] args) {

    // Create accounts with different names and banks
    BankAccount nadeemICICI = new BankAccount("nadeem", "ICICI", 1000);
    BankAccount rohitHDFC = new BankAccount("rohit", "HDFC", 2000);
    BankAccount kazimSBI = new BankAccount("kazim", "SBI", 3000);

    // Deposit and withdraw money
    nadeemICICI.deposit(500);
    nadeemICICI.withdraw(200);

    rohitHDFC.deposit(1000);
    rohitHDFC.withdraw(500);

    kazimSBI.deposit(1500);
    kazimSBI.withdraw(700);

    // Display account details
    System.out.println("\nAccount details:");
    System.out.println(nadeemICICI.accountHolderName + " (" + nadeemICICI.bankName + ") - Balance: $" + nadeemICICI.getBalance());
    System.out.println(rohitHDFC.accountHolderName + " (" + rohitHDFC.bankName + ") - Balance: $" + rohitHDFC.getBalance());
    System.out.println(kazimSBI.accountHolderName + " (" + kazimSBI.bankName + ") - Balance: $" + kazimSBI.getBalance());
  }
}
