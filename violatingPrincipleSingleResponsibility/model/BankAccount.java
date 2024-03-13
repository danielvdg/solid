package solid.violatingPrincipleSingleResponsibility.model;

/*
exemplo de um classe utilizando responsablidado unica em seus metodos 
resumindo os metodos devem resultar somente em uma ação , mas eles podem ter mais de um estrura
de validação de dados.
*/
public class BankAccount {
    private double balance;
    private double withdrawAmount;

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

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    /*
     * violação da responsabilidade Unida
     * onde metodo possui duas resposabilidades
    */
    public String getBalanceAndGetWithdrawAmount() {
     return String.format("Saldo de : %d e retirada de : :d", getBalance(),getWithdrawAmount());
    }
    
}
