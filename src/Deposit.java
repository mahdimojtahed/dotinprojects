package src;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Deposit {

    private int depositID;
    private int customerNumber;
    private String depositType;
    private BigDecimal depositBalance;
    private BigInteger durationInDays;
    private BigDecimal rateOfInterest;
    private BigDecimal payedInterest;

    public Deposit() {}

    public Deposit(int depositID, int customerNumber, String depositType, BigDecimal depositBalance, BigInteger durationInDays) {
        this.depositID = depositID;
        this.customerNumber = customerNumber;
        this.depositType = depositType;
        this.depositBalance = depositBalance;
        this.durationInDays = durationInDays;
    }

    public int getDepositID() {
        return depositID;
    }

    public void setDepositID(int depositID) {
        this.depositID = depositID;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public BigDecimal getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(BigDecimal depositBalance) {
        this.depositBalance = depositBalance;
    }

    public BigInteger getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(BigInteger durationInDays) {
        this.durationInDays = durationInDays;
    }

    public BigDecimal getRateOfInterest() {
        return rateOfInterest;
    }

    public BigDecimal getPayedInterest() {
        return payedInterest;
    }

    public void setPayedInterest(BigDecimal payedInterest) {
        this.payedInterest = payedInterest;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "depositID=" + depositID +
                ", customerNumber=" + customerNumber +
                ", depositType='" + depositType + '\'' +
                ", depositBalance=" + depositBalance +
                ", durationInDays=" + durationInDays +
                ", rateOfInterest=" + rateOfInterest +
                ", payedInterest=" + payedInterest +
                '}';
    }
}
