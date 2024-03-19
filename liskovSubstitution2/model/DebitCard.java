package solid.liskovSubstitution2.model;

import solid.liskovSubstitution2.service.PaymentTypeService;

public class DebitCard extends BankAccount implements PaymentTypeService{

    public DebitCard(double balance) {
        super(balance);
    }

    /*
     * objetos de um tipo base devem ser substituíveis por 
     * objetos de seus subtipos sem afetar a corretude do programa
     * 
     */
    @Override
    public void pay(double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }
     
}