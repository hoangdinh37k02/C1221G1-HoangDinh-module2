package ss12_map.exercise.product;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        product.add();
        product.add();
        product.add();
        product.display();
//        product.edit();
//        product.display();
        product.sortBySku();
        product.sortByPrice();
    }
}
