package src;

public class ShortDeposit extends Deposit{
    private final int rateOfInterest;
    public ShortDeposit(int depositID, int customerNumber, String depositType, double depositBalance, int durationInDays) {
        super(depositID, customerNumber, depositType, depositBalance, durationInDays);
        this.rateOfInterest = 10;
    }

    @Override
    public int getRateOfInterest() {
        return rateOfInterest;
    }
}
