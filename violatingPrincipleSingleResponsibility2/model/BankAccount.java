package solid.violatingPrincipleSingleResponsibility2.model;

/*
exemplo de um classe utilizando responsablidado unica em seus metodos 
resumindo os metodos devem resultar somente em uma ação , mas eles podem ter mais de um estrura
de validação de dados.
*/
public class BankAccount {
    private double balance;
    private String payments;
    private String sevices;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getBalance() {
        return balance;
    }
    /*
     * Violação do principio da resposabilidade unica 
     * onde um classe só deve ter uma função 
     */
    public void typesPayments() {
        if (payments.equals("debit")) {
            System.out.println("pagamento no debito");
        } else if (payments.equals("credit")){
            System.out.println("Pagmento no credito");
        } else if(payments.equals("bill")){
            System.out.println("pagamento no boleto");
        } else {
            System.out.println("pagemento a dinheiro");
        }
    }
    
    /*
     * Violação do principio da resposabilidade unica 
     * onde um classe só deve ter uma função 
     */
    public void typesServices() {
        if (sevices.equals("investment")) {
            System.out.println("investimentos");
        } else if (sevices.equals("life insurance")){
            System.out.println("seguro de vida");
        }
           
    }
}
