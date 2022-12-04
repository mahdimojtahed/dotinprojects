package src;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LongDeposit extends Deposit{
    private final BigDecimal rateOfInterest;

    public LongDeposit(int depositID, int customerNumber, String depositType, BigDecimal depositBalance, BigInteger durationInDays) {
        super(depositID, customerNumber, depositType, depositBalance, durationInDays);
        this.rateOfInterest = BigDecimal.valueOf(20);
    }

    @Override
    public BigDecimal getRateOfInterest() {
        return rateOfInterest;
    }
}
