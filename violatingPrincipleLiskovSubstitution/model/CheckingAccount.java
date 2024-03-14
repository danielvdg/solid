package solid.violatingPrincipleLiskovSubstitution.model;


public class CheckingAccount extends BankAccount  {

    public CheckingAccount(double balance) {
        super(balance);
    }

    public void cobrarTaxaManutencao() {
        balance -= 10; // Supondo uma taxa fixa de manutenção
    }

    /**
     * Violação da substituição de Liskov
     * Uma classe derivada deve ser substituível por sua classe base.
     * 
    */
    @Override
    public double getBalance() {
        System.out.println("Saldo da conta");
        return super.getBalance();
    }

      
    
}