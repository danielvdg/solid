package solid.openClosed2.model;

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

   
    public void creditPayment() {
        payment.equals("cedit");
        System.out.println("pagemnto no credito");
    }

    public void debitPayment() {
        payment.equals("debit");
        System.out.println("pagamento no debito");
    }

    public void billPayment() {
        payment.equals("bill");
        System.out.println("pagamento no boleto");
    }

    public void cashPayment() {
        payment.equals("cash");
        System.out.println("pagamento no dinheiro");
    }

    

    
}
