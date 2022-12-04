package src;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LoanDeposit extends Deposit {
    private final BigDecimal rateOfInterest;

    public LoanDeposit(int depositID, int customerNumber, String depositType, BigDecimal depositBalance, BigInteger durationInDays) {
        super(depositID, customerNumber, depositType, depositBalance, durationInDays);
        this.rateOfInterest = BigDecimal.valueOf(20);
    }

    @Override
    public BigDecimal getRateOfInterest() {
        return rateOfInterest;
    }
}
