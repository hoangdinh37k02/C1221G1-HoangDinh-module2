package case_study.models;

public class Contract {
    private String contractNumber, bookingID, customerID;
    private long deposit, pay;

    public Contract(String contractNumber, String bookingID, String customerID, long deposit, long pay) {
        this.contractNumber = contractNumber;
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.deposit = deposit;
        this.pay = pay;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getPay() {
        return pay;
    }

    public void setPay(long pay) {
        this.pay = pay;
    }

    public String getInfoToCSV(){
        return this.getContractNumber()+","+this.getBookingID()+","+this.getCustomerID()+","+this.getDeposit()+","+
                this.getPay();
    }
}
