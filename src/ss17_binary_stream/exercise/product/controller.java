package ss17_binary_stream.exercise.product;

import java.util.Scanner;

public class controller {
    public static void main(String[] args) {
        ProductServiceImpl productService = new ProductServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----PRODUCT SYSTEM-------\n" +
                    "1. Adding product\n" +
                    "2, Display\n" +
                    "3. Searching\n" +
                    "4. Exit\n" +
                    "Please choice");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    productService.search();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Invalid");
                    break;
            }
        }while (choice!=4);
    }
}