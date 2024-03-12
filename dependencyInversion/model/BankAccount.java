package solid.dependencyInversion.model;

import solid.dependencyInversion.service.LoggerService;
/**
 * Os módulos de alto nível não devem depender de módulos de baixo nível.
 * Ambos devem depender de abstrações
 */
public class BankAccount {
    private double balance;
    private LoggerService logger;

    public BankAccount(LoggerService logger) {
        this.logger = logger;
    }

    public void deposit(double amount) {
        balance += amount;
        logger.log("Depósito de " + amount + " realizado. Saldo atual: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            logger.log("Retirada de " + amount + " realizada. Saldo atual: " + balance);
        } else {
            logger.log("Tentativa de retirada de " + amount + " falhou. Saldo insuficiente.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
