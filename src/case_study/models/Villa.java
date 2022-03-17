package case_study.models;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int floor;

    public Villa(String serviceCode, String serviceName, double useArea, double cost, int numberOfPeople, String rentalType, String roomStandard, double poolArea, int floor) {
        super(serviceCode, serviceName, useArea, cost, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}
