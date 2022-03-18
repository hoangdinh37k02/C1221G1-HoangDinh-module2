package case_study.models;

public class Booking {
    private String bookingID, startDay, endDay, customerID, serviceName, serviceType;

    public Booking(String bookingID, String startDay, String endDay, String customerID, String serviceName, String serviceType) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getInfoToCSV(){
        return this.getBookingID()+","+this.getStartDay()+","+this.getEndDay()+","+this.getCustomerID()+","+
                this.getServiceName()+","+this.getServiceType();
    }
}
