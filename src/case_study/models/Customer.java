package case_study.models;

public class Customer extends Person {
    private String customerID, customerType, address;

    public Customer(String customerID, String name, String birthDay, String gender, String IDCard, String phone, String email, String customerType, String address) {
        super(name, birthDay, gender, IDCard, phone, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "Customer{" +
                "customerID='" + customerID + '\'' + super.toString()+
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}