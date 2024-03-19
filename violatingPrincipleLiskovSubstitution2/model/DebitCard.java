package solid.violatingPrincipleLiskovSubstitution2.model;

import solid.liskovSubstitution2.service.PaymentTypeService;

public class DebitCard extends BankAccount implements PaymentTypeService{

    public DebitCard(double balance) {
        super(balance);
    }

    @Override
    public void pay(double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }

    /*
     * a classe DebitCard herda de BankAccount e sobrescreve o método withdraw para lançar uma exceção se o saldo for insuficiente para a retirada.
     * Isso viola o LSP porque altera o comportamento esperado da classe base, 
     * que não lança exceções ao realizar uma retirada
     * 
     */
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
     
}