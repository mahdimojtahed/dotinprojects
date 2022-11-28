package src;

public class Deposit {
    private int depositID;
    private int customerNumber;
    private String depositType;
    private double depositBalance;
    private int durationInDays;
    private int rateOfInterest;
    public Deposit() {
    }
    public Deposit(int depositID, int customerNumber, String depositType, double depositBalance, int durationInDays) {
        this.depositID = depositID;
        this.customerNumber = customerNumber;
        this.depositType = depositType;
        this.depositBalance = depositBalance;
        this.durationInDays = durationInDays;
    }
    public Deposit(int depositID, int customerNumber, String depositType, double depositBalance, int durationInDays, int rateOfInterest) {
        this.depositID = depositID;
        this.customerNumber = customerNumber;
        this.depositType = depositType;
        this.depositBalance = depositBalance;
        this.durationInDays = durationInDays;
        this.rateOfInterest = rateOfInterest;
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
    public double getDepositBalance() {
        return depositBalance;
    }
    public void setDepositBalance(double depositBalance) {
        this.depositBalance = depositBalance;
    }
    public int getDurationInDays() {
        return durationInDays;
    }
    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }
    public int getRateOfInterest() {
        return rateOfInterest;
    }
    public void setRateOfInterest(int rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
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
                '}';
    }
}
