package solid.singleResponsibility2.model;

/*
exemplo de um classe utilizando responsablidado unica em seus metodos 
resumindo os metodos devem resultar somente em uma ação , mas eles podem ter mais de um estrura
de validação de dados.
*/
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

    public double getBalance() {
        return balance;
    }

    
}
