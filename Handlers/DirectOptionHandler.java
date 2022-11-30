package Handlers;
import utils.Calculator;
import utils.Strings;
import java.util.Scanner;

public class DirectOptionHandler {
    static Scanner input = new Scanner(System.in);
    static double res;
    static int rateOfInterest;
    static int depositBalance;
    static int durationInDays;
    public static void DirectEnterHandler() throws ArithmeticException {
        System.out.println(Strings.ENTER_ROI);
        rateOfInterest = input.nextInt();
        System.out.println(Strings.ENTER_DB);
        depositBalance = input.nextInt();
        // todo int is not enough
        System.out.println(Strings.ENTER_DURATION);
        durationInDays = input.nextInt();
        res = Calculator.calculate(rateOfInterest, depositBalance, durationInDays);
        System.out.println("Pi would be : " + res);
    }
}
