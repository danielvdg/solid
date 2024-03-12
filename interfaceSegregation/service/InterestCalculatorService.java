package solid.interfaceSegregation.service;

public interface InterestCalculatorService  {
    /**
     * As classes devem estar abertas para extensão, 
     * mas fechadas para modificação, seguindo isso conseguimos fazer isso utilizando interface
     */
    public double calculateInterest(double balance);
    
}
