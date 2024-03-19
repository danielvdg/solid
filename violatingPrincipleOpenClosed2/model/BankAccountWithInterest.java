package solid.violatingPrincipleOpenClosed2.model;
import solid.openClosed.service.InterestCalculatorService;

public class BankAccountWithInterest extends BankAccount {

    private final InterestCalculatorService interestCalculatorService; 

    
    public BankAccountWithInterest(
        double balance, 
        InterestCalculatorService interestCalculatorService) {
        super(balance);
        this.interestCalculatorService = interestCalculatorService;    
    }

    public double calculateInterest() {
        return interestCalculatorService.calculateInterest(getBalance());
    }
}
