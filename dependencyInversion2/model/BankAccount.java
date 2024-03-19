package solid.dependencyInversion2.model;

import solid.dependencyInversion.service.LoggerService;

public abstract class BankAccount {
    private double balance;
    /*
     * Os módulos de alto nível não devem depender de módulos de baixo nível.
     *  Ambos devem depender de abstrações
     */
    @SuppressWarnings("unused")
    private LoggerService logger;

    public BankAccount(LoggerService logger) {
        this.logger = logger;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
