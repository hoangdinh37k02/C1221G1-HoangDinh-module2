package extra_exercise2.model;

public class AuthenticPhone extends Phone{
    private int warrantyTime;
    private String warrantyLimit;

    public AuthenticPhone(int id, String name, int price, int quantity,
                          String manufacture, int warrantyTime, String warrantyLimit) {
        super(id, name, price, quantity, manufacture);
        this.warrantyTime = warrantyTime;
        this.warrantyLimit = warrantyLimit;
    }

    public int getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(int warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    public String getWarrantyLimit() {
        return warrantyLimit;
    }

    public void setWarrantyLimit(String warrantyLimit) {
        this.warrantyLimit = warrantyLimit;
    }

    @Override
    public String toString() {
        return super.toString()+
                "warrantyTime=" + warrantyTime +
                ", warrantyLimit='" + warrantyLimit
                ;
    }

    public String getInFoToCSV(){
        return this.getId()+","+this.getName()+","+this.getPrice()+","+this.getQuantity()
                +","+this.getManufacture()+","+this.getWarrantyTime()+","+this.getWarrantyLimit();
    }
}
