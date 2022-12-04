package utils;

import javafx.util.Pair;
import src.Deposit;

public class InputValidators {
    static boolean isValid = true;
    static String notValidReason;

    public static Pair<Boolean, String> validator(Deposit deposit) {
        if(deposit.getDurationInDays().intValue() < 1) {
            isValid = false;
            notValidReason = Strings.CHECK_DURATION;
        } else if (deposit.getDepositBalance().intValue() < 0) {
            isValid = false;
            notValidReason = Strings.CHECK_BALANCE;
        }
        return new Pair<Boolean, String>(isValid, notValidReason);
    }
}
