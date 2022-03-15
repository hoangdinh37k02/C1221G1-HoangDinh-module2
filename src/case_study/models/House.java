package case_study.models;

public class House extends Facility{
    private String roomStandard;
    private int floor;

    public House(String serviceName, double useArea, double cost, int numberOfPeople, String rentalType, String roomStandard, int floor) {
        super(serviceName, useArea, cost, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
                "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
