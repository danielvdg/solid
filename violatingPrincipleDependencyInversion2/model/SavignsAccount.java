package solid.violatingPrincipleDependencyInversion2.model;

import solid.dependencyInversion.service.LoggerService;

/*
* Os módulos de alto nível não devem depender de módulos de baixo nível.
*  Ambos devem depender de abstrações
*/
public class SavignsAccount extends BankAccount {

    public SavignsAccount(LoggerService logger) {
        super(logger);
    }

    @Override
    public void deposit(double amount) {
        
    }

    @Override
    public void withdraw(double amount) {
        
    }
    
}
