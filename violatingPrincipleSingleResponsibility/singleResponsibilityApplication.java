package solid.violatingPrincipleSingleResponsibility;

import solid.singleResponsibility.model.BankAccount;

public class singleResponsibilityApplication {
    public static void main(String[] args) {
        BankAccount deposit1 = new BankAccount(20);
        
        System.out.println(deposit1.getBalance());
    }
}
