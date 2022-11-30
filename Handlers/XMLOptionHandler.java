package Handlers;
// todo use small letters for package names.
import src.Deposit;
import utils.Calculator;
import utils.Strings;
import utils.XMLParser;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class XMLOptionHandler {
    static Scanner input = new Scanner(System.in);
    static double res;
    static String FILEPATH;
    public static void XMLEnterHandler() throws Exception, FileNotFoundException{
        // todo pay attention to warnings and IntelliJ suggestions for clean code. delete unnecessary codes. [ Alt + Ctrl + l ] and [ Alt + Ctrl + o ]
        System.out.println(Strings.ENTER_PATH);
        System.out.println(Strings.FILE_FORMAT);
        FILEPATH = "files/" + input.nextLine();
        XMLParser parser = new XMLParser();
        List<Deposit> Deposits = parser.initDeposits(FILEPATH);
        for (Deposit deposit : Deposits) {
            res = Calculator.calculate(
                    deposit.getRateOfInterest(),
                    deposit.getDepositBalance(),
                    deposit.getDurationInDays());
            System.out.println(deposit.getCustomerNumber() + " # " + res);
            // todo sorted descending by res
        }
    }
}
