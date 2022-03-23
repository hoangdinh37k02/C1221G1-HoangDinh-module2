package extra_exercise2.model;

public class HandPhone extends Phone {
    private String nation;
    private String status;

    public HandPhone(int id, String name, int price, int quantity, String manufacture,
                     String nation, String status) {
        super(id, name, price, quantity, manufacture);
        this.nation = nation;
        this.status = status;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString()+
                "nation='" + nation + '\'' +
                ", status='" + status;
    }
//    int id, String name, int price, int quantity, String manufacture,
//                     String nation, String status
    public String getInFoToCSV(){
        return this.getId()+","+this.getName()+","+this.getPrice()+","+this.getQuantity()
                +","+this.getManufacture()+","+this.getNation()+","+this.getStatus();
    }
}
