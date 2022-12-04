package utils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Calculator {
    public static BigDecimal calculate(BigDecimal roi , BigDecimal db, BigInteger bd) {
        return (roi.multiply(db).multiply(new BigDecimal(bd)))
            .divide(new BigDecimal(Constants.CONST_VAL), 0);
    }
}
