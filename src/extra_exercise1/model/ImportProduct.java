package extra_exercise1.model;

public class ImportProduct extends Product {
    private int importPrice;
    private String importProvince;
    private int importTax;

    public ImportProduct(int id, String sku, String name, int price, int quantity,
                         String manufacture, int importPrice, String importProvince, int importTax) {
        super(id, sku, name, price, quantity, manufacture);
        this.importPrice = importPrice;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public int getImportTax() {
        return importTax;
    }

    public void setImportTax(int importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return
                "importPrice=" + importPrice +
                ", importProvince='" + importProvince + '\'' +
                ", importTax=" + importTax;
    }
}
