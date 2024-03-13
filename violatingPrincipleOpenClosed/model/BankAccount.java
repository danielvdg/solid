package solid.violatingPrincipleOpenClosed.model;


public class BankAccount {
    private double balance;

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
    // 
    public double getBalance() {
        return balance;
    }

    public double calculateInterest(double balance){
        
        /*
            violação do aberto e fechado
            logica para alterar o juros
            Objetos ou entidades devem estar abertos para extensão, 
            mas fechados para modificação.
         * 
        */
        return balance;
    }
}
