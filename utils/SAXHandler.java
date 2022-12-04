package utils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import src.Deposit;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SAXHandler extends DefaultHandler {
    Random random = new Random();

    private Deposit deposit;

    private List<Deposit> deposits = new ArrayList<>();

    private StringBuilder currentVal = new StringBuilder();

    public List<Deposit> getDeposits() {
        return deposits;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals(Strings.DEPOSIT)) {
            String id = attributes.getValue(Strings.ID);
            deposit = new Deposit();
            if(id == null) {
                random.setSeed(1234567890);
                deposit.setDepositID(random.nextInt(100000));
            } else {
                deposit.setDepositID(Integer.parseInt(id));
            }
        }
        currentVal = new StringBuilder();
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        currentVal.append(new String(ch, start, length));
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        // throw Number format exception ???
        switch (qName) {
            case Strings.CUSTOMER_NUMBER:
                deposit.setCustomerNumber(Integer.parseInt(currentVal.toString()));
                break;
            case Strings.DEPOSIT_TYPE:
                deposit.setDepositType(currentVal.toString());
                break;
            case Strings.DEPOSIT_BALANCE:
                deposit.setDepositBalance(BigDecimal.valueOf(Double.parseDouble(currentVal.toString())));
                break;
            case Strings.DURATION_IN_DAYS:
                deposit.setDurationInDays(BigInteger.valueOf(Integer.parseInt(currentVal.toString())));
                break;
            case Strings.DEPOSIT:
                deposits.add(deposit);
                break;
        }
    }
}
