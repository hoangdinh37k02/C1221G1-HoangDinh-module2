package extra_exercise1.service.impl;

import extra_exercise1.model.ExportProduct;
import extra_exercise1.model.ImportProduct;
import extra_exercise1.service.IService;
import extra_exercise1.util.NotFoundProductException;
import extra_exercise1.util.ReadAndWriteToCSV;
import extra_exercise1.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExportProductServiceImpl implements IService {
    static List<ExportProduct>exportProductList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static final String CHECK_POSITIVE = "^[1-9]\\d{0,}$";

    @Override
    public void add() {
        List<ExportProduct> exportProductList = ReadAndWriteToCSV.readExport();
        int id=1;
        if (!exportProductList.isEmpty()){
            id = exportProductList.size()+1;
        }
        System.out.print("Enter product's SKU: ");
        String sku = scanner.nextLine();
        System.out.print("Enter product's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product's price: ");
        int price = Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_POSITIVE,"Invalid"));
        System.out.print("Enter product's quantity: ");
        int quantity = Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_POSITIVE,"Invalid"));
        System.out.print("Enter product's manufacture: ");
        String manufacture = scanner.nextLine();
        System.out.print("Enter product's export_price: ");
        int exportPrice = Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_POSITIVE,"Invalid"));
        System.out.print("Enter export-country: ");
        String exportCountry = scanner.nextLine();

        ExportProduct exportProduct = new ExportProduct(id,sku,name,price,quantity,manufacture,exportPrice,exportCountry);
        exportProductList.add(exportProduct);
        ReadAndWriteToCSV.writeExport(exportProductList,false);
        System.out.println("Addition successful!");
    }

    @Override
    public void delete() throws NotFoundProductException {
        List<ExportProduct> exportProductList = ReadAndWriteToCSV.readExport();
        display();
        boolean flag = true;
        while (flag){
            System.out.print("Nhập SKU: ");
            String sku = scanner.nextLine();
            for (int i =0; i<exportProductList.size(); i++) {
                if (sku.equals(exportProductList.get(i).getSku())){
                    flag = false;
                    System.out.println(exportProductList.get(i).toString()+"\n" +
                            "Bạn có muốn xóa sản phẩm này Y/N");
                    String decide = scanner.nextLine().toUpperCase();
                    if ("Y".contains(decide)){
                        exportProductList.remove(i);
                        ReadAndWriteToCSV.writeExport(exportProductList,false);
                        System.out.println("Xóa thành công");
                        break;
                    } else {
                        break;
                    }
                } else {
                    throw new NotFoundProductException("Sản phẩm không tồn tại");
                }
            }
        }
    }

    @Override
    public void display() {
        List<ExportProduct> exportProductList = ReadAndWriteToCSV.readExport();
        System.out.println("=====Export Product List=====");
        for (ExportProduct exportProduct:exportProductList) {
            System.out.println(exportProduct.toString());
        }
    }

    @Override
    public void search() {
        display();
        List<ExportProduct> exportProductList = ReadAndWriteToCSV.readExport();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        boolean flag = true;
        for (int i=0; i<exportProductList.size(); i++){
            if (name.contains(exportProductList.get(i).getName())){
                System.out.println(exportProductList.get(i).toString());
                flag = false;
            }
        }
        if (!flag){
            System.out.println("Sản phẩm không tồn tại");
        }
    }
}
