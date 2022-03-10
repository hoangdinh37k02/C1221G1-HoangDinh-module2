package ss17_binary_stream.exercise.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl {
    private int productId, price;
    private String name;
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    public void addProduct(){
        System.out.print("Enter product' id: ");
        productId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product' price: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product' name: ");
        name = scanner.nextLine();

        Product product = new Product(productId, price, name);
        productList.add(product);
        ReadAndWrite.writeToFile("src\\ss17_binary_stream\\exercise\\product\\Product.txt",productList);
    }

    public void display(){
        productList = ReadAndWrite.readDataFromFile("src\\ss17_binary_stream\\exercise\\product\\Product.txt");
        for (int i=0; i<productList.size(); i++){
            System.out.println((i+1)+". "+productList.get(i));
        }
    }

    public void search(){
        display();
        System.out.print("Enter product's id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product: productList){
            if (id==product.getProductId()){
                System.out.println(product);
            }

        }
    }

}
