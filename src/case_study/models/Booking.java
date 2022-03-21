package case_study.models;

public class Booking {
    private String bookingID, startDay, endDay;
    private Customer customer;
    private Villa villa;
    private Room room;
    private House house;

    public Booking(String bookingID, String startDay, String endDay, Customer customer, Villa villa) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customer = customer;
        this.villa = villa;
    }

    public Booking(String bookingID, String startDay, String endDay, Customer customer, Room room) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customer = customer;
        this.room = room;
    }

    public Booking(String bookingID, String startDay, String endDay, Customer customer, House house) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customer = customer;
        this.house = house;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Villa getVilla() {
        return villa;
    }

    public void setVilla(Villa villa) {
        this.villa = villa;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }


    public String getVillaInFo(){
        return "bookingID='" + bookingID + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customer=" + customer.getCustomerID() +
                ", villa=" + villa.getServiceCode();
    }

    public String getHouseInFo(){
        return "bookingID='" + bookingID + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customer=" + customer.getCustomerID() +
                ", villa=" + house.getServiceCode();
    }

    public String getRoomInFo(){
        return "bookingID='" + bookingID + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customer=" + customer.getCustomerID() +
                ", villa=" + room.getServiceCode();
    }
}
