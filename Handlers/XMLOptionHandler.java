package handlers;

import src.Deposit;
import utils.Calculator;
import utils.Strings;
import utils.XMLParser;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class XMLOptionHandler {

    static Scanner input = new Scanner(System.in);
    static BigDecimal res;
    static String FILEPATH;

    public static void XMLEnterHandler() throws FileNotFoundException {
        System.out.println(Strings.ENTER_PATH);
        System.out.println(Strings.FILE_FORMAT);
        FILEPATH = "files/" + input.nextLine();

        XMLParser parser = new XMLParser();
        List<Deposit> Deposits = parser.initDeposits(FILEPATH);

        for (Deposit deposit : Deposits) {
            res = Calculator.calculate(deposit.getRateOfInterest(), deposit.getDepositBalance(), deposit.getDurationInDays());
            deposit.setPayedInterest(res);
        }

        Deposits.sort((deposit1, deposit2) -> deposit2.getPayedInterest().intValue() - deposit1.getPayedInterest().intValue());

        for (Deposit deposit : Deposits) {
            System.out.println(deposit.getCustomerNumber() + " # " + deposit.getPayedInterest());
        }

    }
}
