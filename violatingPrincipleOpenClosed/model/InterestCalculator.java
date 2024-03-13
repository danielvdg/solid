package solid.violatingPrincipleOpenClosed.model;

import solid.openClosed.service.InterestCalculatorService;

public class InterestCalculator implements InterestCalculatorService {
    
    public double calculateInterest(double balance) {
        double interest = balance * 0.10 * 30;

        return interest;
    }
}
