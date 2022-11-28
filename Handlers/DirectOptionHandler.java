package Handlers;

import utils.Calculator;
import utils.Strings;

import java.util.Scanner;

public class DirectOptionHandler {
    static Scanner input = new Scanner(System.in);
    static double res;
    static int roi;
    public static void DirectEnterHandler() throws ArithmeticException {
        System.out.println(Strings.ENTER_ROI);
        roi = input.nextInt();
        System.out.println(Strings.ENTER_DB);
        int db = input.nextInt();
        System.out.println(Strings.ENTER_DURATION);
        int dd = input.nextInt();
        res = Calculator.calculate(roi, db, dd);

        System.out.println("Pi would be : " + res);
    }
}
