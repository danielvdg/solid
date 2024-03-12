package solid.interfaceSegregation.model;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    // Implementação específica para Conta Poupança, por exemplo, juros
    public void calcularJuros(double taxaJuros) {
        balance *= (1 + taxaJuros);
    }
    
}
