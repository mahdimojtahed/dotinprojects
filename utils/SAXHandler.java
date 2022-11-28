package utils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import src.Deposit;
import java.util.ArrayList;
import java.util.List;
public class SAXHandler extends DefaultHandler {
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
            deposit.setDepositID(Integer.parseInt(id));
        }
        currentVal = new StringBuilder();
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        currentVal.append(new String(ch, start, length));
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case Strings.CUSTOMER_NUMBER:
                deposit.setCustomerNumber(Integer.parseInt(currentVal.toString()));
                break;
            case Strings.DEPOSIT_TYPE:
                deposit.setDepositType(currentVal.toString());
                break;
            case Strings.DEPOSIT_BALANCE:
                deposit.setDepositBalance(Double.parseDouble(currentVal.toString()));
                break;
            case Strings.DURATION_IN_DAYS:
                deposit.setDurationInDays(Integer.parseInt(currentVal.toString()));
                break;
            case Strings.DEPOSIT:
                deposits.add(deposit);
                break;
        }
    }
}
