package ss17_binary_stream.exercise.product;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId, price;
    private String name;

    public Product(){}

    public Product(int productId, int price, String name) {
        this.productId = productId;
        this.price = price;
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }


}
