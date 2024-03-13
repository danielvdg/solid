package solid.violatingPrincipleDependencyInversion.model;

import solid.violatingPrincipleDependencyInversion.service.LoggerService;

/**
 * Os módulos de alto nível não devem depender de módulos de baixo nível.
 * Ambos devem depender de abstrações
 */
public class BankAccount {
    private double balance;
    @SuppressWarnings("unused")
    private BankLogger logger;
    private LoggerService loggerService;

    public BankAccount(String logger, LoggerService loggerService) {
        /*
        Violação: classe de nível mais baixo instanciada diretamente
        Ele sugere que módulos de alto nível não devem depender de módulos de baixo nível;
        */
        this.logger = new BankLogger(" ");
        this.loggerService = loggerService;
    }

    public void deposit(double amount) {
        balance += amount;
        loggerService.log("Depósito de " + amount + " realizado. Saldo atual: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            loggerService.log("Retirada de " + amount + " realizada. Saldo atual: " + balance);
        } else {
            loggerService.log("Tentativa de retirada de " + amount + " falhou. Saldo insuficiente.");
        }
    }

    public double getBalance() {
        return balance;
    }

}
