import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountManagementSystem {
    
    private Map<String, Double> accounts;

    public BankAccountManagementSystem() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists");
        } else {
            accounts.put(accountNumber, 0.0);
            System.out.println("Account created successfully");
        }
    }

    public void deposit(String accountNumber, double amount) {
        if(accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            balance += amount;
            accounts.put(accountNumber, balance);
            System.out.println("Deposit Successfully");
        } else {
            System.out.println("Account does not exist");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if(accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            if(balance < amount) {
                System.out.println("Insufficient Funds");
            } else {
                balance -= amount;
                accounts.put(accountNumber, balance);
                System.out.println("Withdrawal successful");
            }
        } else {
            System.out.println("Account does not exist");
        }
    }
}