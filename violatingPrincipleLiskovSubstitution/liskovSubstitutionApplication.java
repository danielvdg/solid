package solid.violatingPrincipleLiskovSubstitution;

import solid.liskovSubstitution.model.BankAccount;

public class liskovSubstitutionApplication {
    public static void main(String[] args) {
         // Exemplo de substituição de Liskov
         BankAccount checkingAccount = new BankAccount(1000);
         BankAccount savingsAccount = new BankAccount(2000);
 
         checkingAccount.deposit(500);
         savingsAccount.deposit(1000);
 
         System.out.println("Saldo da Conta Corrente: " + checkingAccount.getBalance());
         System.out.println("Saldo da Conta Poupança: " + savingsAccount.getBalance());
 
         // Possível substituir objetos de subclasses pelos da classe base
         BankAccount[] accounts = new BankAccount[]{checkingAccount, savingsAccount};
         for (BankAccount account : accounts) {
             account.withdraw(200);
             System.out.println("Novo saldo: " + account.getBalance());
        }
    }
}
    
