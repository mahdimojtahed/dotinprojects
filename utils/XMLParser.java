package utils;
import org.xml.sax.SAXException;
import src.Deposit;
import src.LoanDeposit;
import src.LongDeposit;
import src.ShortDeposit;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class XMLParser {
    private static final List<Deposit> deposits = new ArrayList<>();

    public List<Deposit> initDeposits(String FILEPATH) {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            SAXHandler handler = new SAXHandler();
            SAXParser saxParser = spf.newSAXParser();
            saxParser.parse(FILEPATH,handler);
            // todo fix handler for tags without id

            List<Deposit> depositList = handler.getDeposits();

            for (Deposit deposit : depositList) {
                switch (deposit.getDepositType()) {
                    case Strings.LONG_TERM:
                        Deposit longDeposit = new LongDeposit(deposit.getDepositID(),
                                deposit.getCustomerNumber(),
                                deposit.getDepositType(),
                                deposit.getDepositBalance(),
                                deposit.getDurationInDays());
                        deposits.add(longDeposit);
                        break;
                    case Strings.SHORT_TERM:
                        Deposit shortDeposit = new ShortDeposit(deposit.getDepositID(),
                                deposit.getCustomerNumber(),
                                deposit.getDepositType(),
                                deposit.getDepositBalance(),
                                deposit.getDurationInDays());
                        deposits.add(shortDeposit);
                        break;
                    case Strings.LOAN:
                        Deposit loanDeposit = new LoanDeposit(deposit.getDepositID(),
                                deposit.getCustomerNumber(),
                                deposit.getDepositType(),
                                deposit.getDepositBalance(),
                                deposit.getDurationInDays());
                        deposits.add(loanDeposit);
                        break;
                }
                // todo fix Exception Handling for wrong inputs (char instead of digits)
                // todo fix Exception Handling for wrong depositType (not ignore it)
                // todo fix Exception Handling for negative deposit
                // todo fix Exception Handling for zero or negative duration
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
        return deposits;
    }
}
