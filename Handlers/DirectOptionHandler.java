package handlers;
import utils.Calculator;
import utils.Strings;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class DirectOptionHandler {

    static Scanner input = new Scanner(System.in);
    static BigDecimal res;
    static BigDecimal rateOfInterest;
    static BigDecimal depositBalance;
    static BigInteger durationInDays;

    public static void DirectEnterHandler() throws ArithmeticException {

        System.out.println(Strings.ENTER_ROI);
        rateOfInterest = input.nextBigDecimal();

        System.out.println(Strings.ENTER_DB);
        depositBalance = input.nextBigDecimal();

        System.out.println(Strings.ENTER_DURATION);
        durationInDays = input.nextBigInteger();

        res = Calculator.calculate(rateOfInterest, depositBalance, durationInDays);
        System.out.println("Pi would be : " + res);
    }

}
