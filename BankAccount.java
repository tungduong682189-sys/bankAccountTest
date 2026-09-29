
package bankaccount;

public class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount; 
        }
    }
    
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance ){
            this.balance -= amount;
        }
    }
    
    public void displayInfo(){
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + balance);
    }
}
