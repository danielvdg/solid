package solid.violatingPrincipleOpenClosed2.model;

public class BankAccount {
    private double balance;
    private String payment;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public double getBalance() {
        return balance;
    }

   
    public void payment() {
        if (payment.equals("debit")) {
            
        } else if (payment.equals("credeit")){

        } else if(payment.equals("bill")){

        } else {
            System.out.println("pagemento a dinheiro");
        }
    }
        
}
