package src;

public class LoanDeposit extends Deposit {
    private final int rateOfInterest;
    public LoanDeposit(int depositID, int customerNumber, String depositType, double depositBalance, int durationInDays) {
        super(depositID, customerNumber, depositType, depositBalance, durationInDays);
        this.rateOfInterest = 0;
    }
    @Override
    public int getRateOfInterest() {
        return rateOfInterest;
    }

}
