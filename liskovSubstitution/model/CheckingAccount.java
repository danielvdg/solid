package solid.liskovSubstitution.model;


public class CheckingAccount extends BankAccount  {

    public CheckingAccount(double balance) {
        super(balance);
    }

    public void cobrarTaxaManutencao() {
        balance -= 10; // Supondo uma taxa fixa de manutenção
    }
    
}