package extra_exercise1.model;

public class ExportProduct extends Product{
    private int exportPrice;
    private String exportCountry;

    public ExportProduct(int id, String sku, String name, int price, int quantity,
                         String manufacture, int exportPrice, String exportCountry) {
        super(id, sku, name, price, quantity, manufacture);
        this.exportPrice = exportPrice;
        this.exportCountry = exportCountry;
    }

    public int getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(int exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getExportCountry() {
        return exportCountry;
    }

    public void setExportCountry(String exportCountry) {
        this.exportCountry = exportCountry;
    }

    @Override
    public String toString() {
        return
                "exportPrice=" + exportPrice +
                ", exportCountry='" + exportCountry + '\''
               ;
    }
}
