package amolnandiwale.solidprinciples.srp;

/**
 * SRP violation: BankService class has multiple responsibilities
 */
public class BankService {
    public void deposit(double amount, String accountNumber){
        // Logic to deposit money into an account
    }

    public void withdraw(double amount, String accountNumber){
        // Logic to withdraw money from an account
    }
    public void printAccountStatement(String accountNumber){
        // Logic to print an account statement
    }

    public void sendNotification(String message, String accountNumber){
        // Logic to send a notification to the account holder
    }
}
