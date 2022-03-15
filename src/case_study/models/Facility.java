package case_study.models;

public abstract class Facility {
    private String serviceName;
    private double useArea, cost;
    private int numberOfPeople;
    private String rentalType;

    public Facility(){

    }

    public Facility(String serviceName, double useArea, double cost, int numberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tenDichVu='" + serviceName + '\'' +
                ", dienTichSuDung=" + useArea +
                ", chiPhiThue=" + cost +
                ", soLuongNguoi=" + numberOfPeople +
                ", kieuThue='" + rentalType + '\'' +
                '}';
    }
}
