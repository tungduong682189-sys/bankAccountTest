
package bankaccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double balance = Double.parseDouble(sc.nextLine());
        BankAccount ac = new BankAccount(name,balance);
        
        boolean check = true;
        while(check){
            String change = sc.nextLine();
            String[] a = change.split(" ");
            if(a[0].equals("deposit")){
                double amount = Double.parseDouble(a[1]);
                ac.deposit(amount);
            }
            if(a[0].equals("withdraw")){
                double amount = Double.parseDouble(a[1]);
                ac.withdraw(amount);
            }
            if(a[0].equals("display")){
                ac.displayInfo();
                break;
            }
        }
    }
    
}
