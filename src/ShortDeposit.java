package src;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ShortDeposit extends Deposit {
    private final BigDecimal rateOfInterest;

    public ShortDeposit(int depositID, int customerNumber, String depositType, BigDecimal depositBalance, BigInteger durationInDays) {
        super(depositID, customerNumber, depositType, depositBalance, durationInDays);
        this.rateOfInterest = BigDecimal.valueOf(20);
    }

    @Override
    public BigDecimal getRateOfInterest() {
        return rateOfInterest;
    }
}
