package case_study.models;

public class Room extends Facility{
    private String extraService;

    public Room(String serviceName, double useArea, double cost, int numberOfPeople, String rentalType, String extraService) {
        super(serviceName, useArea, cost, numberOfPeople, rentalType);
        this.extraService = extraService;
    }

    public String getExtraService() {
        return extraService;
    }

    public void setExtraService(String extraService) {
        this.extraService = extraService;
    }
}
