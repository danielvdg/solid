package solid.singleResponsibility2.model;
/*
 * mesmos havendo comportamentos diferentes 
 * mantem o pricipio da resposabilidade unica que é realizando pagamento
 */
public class Payment {
    
    private String formPayment;

    public void credit() {
        formPayment.equals("cedit");
    }

    public void debit() {
        formPayment.equals("debit");
    }

    public void bill() {
        formPayment.equals("bill");
    }

}
