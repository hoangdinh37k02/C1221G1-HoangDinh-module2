package case_study.models;

public class Room extends Facility{
    private String extraService;

    public Room(String serviceCode, String serviceName, double useArea, double cost, int numberOfPeople, String rentalType, String extraService) {
        super(serviceCode, serviceName, useArea, cost, numberOfPeople, rentalType);
        this.extraService = extraService;
    }

    public String getExtraService() {
        return extraService;
    }

    public void setExtraService(String extraService) {
        this.extraService = extraService;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Room{" +
                "extraService='" + extraService + '\'' +
                '}';
    }
}
