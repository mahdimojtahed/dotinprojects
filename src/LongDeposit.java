package src;

public class LongDeposit extends Deposit{
    private final int rateOfInterest;
    public LongDeposit(int depositID, int customerNumber, String depositType, double depositBalance, int durationInDays) {
        super(depositID, customerNumber, depositType, depositBalance, durationInDays);
        this.rateOfInterest = 20;
    }

    // todo use @Override for all or not for all.
    public int getRateOfInterest() {
        return rateOfInterest;
    }
}
