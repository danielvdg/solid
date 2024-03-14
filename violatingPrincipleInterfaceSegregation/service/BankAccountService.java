package solid.violatingPrincipleInterfaceSegregation.service;

public interface BankAccountService {
    void deductMonthlyFee();

    double calculateInterest(double balance);
    
    void addInterest();
}
