class BankAccount{
      private String accountName;
      private String accountNo;
      private double balance;

      
      public BankAccount(String accountName, String accountNo, double initialBalance) {
            this.accountName = accountName;
            this.accountNo = accountNo;
            this.balance = initialBalance;
      }

      
      public String getAccountNo() {
            return accountNo;
      }

      
      public void setAccountNo(String accountNo) {
            this.accountNo = accountNo;
      }

      // Getter for balance
      public double getBalance() {
            return balance;
      }

      
      public void setBalance(double balance) {
            if (balance >= 0) {
                  this.balance = balance;
            } else {
                  System.out.println("Balance cannot be negative.");
            }
      }

      
      public void deposit(double amount) {
            if (amount > 0) {
                  balance += amount;
                  System.out.println("Deposited " + amount + ". New balance: " + balance);
            } else {
                  System.out.println("Deposit amount should be greater than zero.");
            }
      }

      // Withdraw money (only if sufficient balance)
      public void withdraw(double amount) {
            if (amount > balance) {
                  System.out.println("Insufficient balance.");
            } else if (amount <= 0) {
                  System.out.println("Withdrawal amount must be greater than zero.");
            } else {
                  balance -= amount;
                  System.out.println("Withdrew " + amount + ". Remaining balance: " + balance);
            }
      }

      // Print account details
      public void printAccountInfo() {
            System.out.println("Account Name: " + accountName);
            System.out.println("Account Number: " + accountNo);
            System.out.println("Balance: " + balance);
      }

  
      public static void main(String[] args) {

            BankAccount account = new BankAccount("bharat", "74361811000", 1000);
          
            account.deposit(2000);
            account.withdraw(30000);
            account.deposit(35000);
            account.printAccountInfo();
            
      }
}
