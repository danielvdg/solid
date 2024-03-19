package solid.violatingPrincipleDependencyInversion2.model;

import solid.dependencyInversion.service.LoggerService;

public abstract class BankAccount {
    private double balance;
    /*
     *Vioação do Principio depência de um modulo de baixo nível
     */
    private Operations operations;

   
    @SuppressWarnings("unused")
    private LoggerService logger;

    public BankAccount(LoggerService logger) {
        this.logger = logger;
        this.operations = new Operations();
    }

    public void deposit(double amount){
        operations.deposit();
    }

    public void withdraw(double amount){
        operations.withdraw();
    };

    public double getBalance() {
        return balance;
    }
}
