package ss12_map.exercise.product;

import java.util.*;

public class Product implements Comparable<Product>{
    private int sku;
    private String name;
    private double price;

    public Product(){

    }

    public Product(int sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Scanner input = new Scanner(System.in);
    List<Product> list = new ArrayList<>();
    public void add(){
        System.out.print("Nhập tên SP: ");
        String name =input.nextLine();
        System.out.print("Nhập SKU: ");
        int sku =  Integer.parseInt(input.nextLine());
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(input.nextLine());
        Product product = new Product(sku, name, price);
        list.add(product);
    }

    public void edit(){
        System.out.print("Nhập SKU của sản phẩm cần sửa:");
        int findSku = input.nextInt();
        int index = -1;
        for (int i=0; i<list.size(); i++){
            if (findSku == list.get(i).getSku()){
                index=i;
                break;
            } else {
                index=-1;
            }
        }
        if (index==-1){
            System.out.println("SP không tồn tại");
        } else {
            System.out.print("SKU sửa lại là:");
            list.get(index).setSku(input.nextInt());
            System.out.print("Tên SP sửa lại là:");
            list.get(index).setName(input.nextLine());
            list.get(index).setName(input.nextLine());
            System.out.print("Giá SP sửa lại là:");
            list.get(index).setPrice(input.nextDouble());
        }
    }

    public void delete(){
        System.out.print("Nhập tên của sản phẩm cần xóa:");
        String deleteName = input.nextLine();

        int index = -1;
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getName().equals(deleteName)){
                index=i;
                break;
            } else {
                index=-1;
            }
        }
        if (index==-1){
            System.out.println("SP không tồn tại");
        } else {
            list.remove(index);
        }
    }

    public void sortBySku(){
        Collections.sort(list);
        System.out.println("Sau khi sortBySku");
        for (Product pr: list) {
            System.out.println("Tên SP: "+pr.getName()+
                    "; SKU: "+pr.getSku()+
                    "; Giá: "+pr.getPrice());
        }
    }

    public void sortByPrice(){
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(list, priceComparator);
        System.out.println("list sau khi sortByPrice:");
        for (Product pr: list) {
            System.out.println("Tên SP: "+pr.getName()+
                    "; SKU: "+pr.getSku()+
                    "; Giá: "+pr.getPrice());
        }
    }

    public void display(){
        for (int i=0; i<list.size(); i++){
            System.out.println("Tên SP: "+list.get(i).getName()+
                    "; SKU: "+list.get(i).getSku()+
                    "; Giá: "+list.get(i).getPrice());
        }
    }

    public void find(){
        System.out.print("Nhập tên sản phẩm cần tìm:");
        String findName = input.nextLine();
        int findIndex = -1;
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getName().equals(findName)){
                findIndex=i;
                break;
            } else {
                findIndex=-1;
            }
        }
        if (findIndex==-1){
            System.out.println("SP không tồn tại");
        } else {
            System.out.println("Tên SP: "+list.get(findIndex).getName()+
                    "; SKU: "+list.get(findIndex).getSku()+
                    "; Giá: "+list.get(findIndex).getPrice());
        }
    }

    @Override
    public int compareTo(Product product) {
        if (this.getSku()==product.getSku()){
            return 0;
        } else if (this.getSku()>product.getSku()){
            return 1;
        } else {
            return -1;
        }
    }
}
