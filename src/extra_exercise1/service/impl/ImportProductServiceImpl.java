package extra_exercise1.service.impl;

import extra_exercise.ultil.NotFoundFileException;
import extra_exercise.ultil.ReadAndWrite;
import extra_exercise1.model.ExportProduct;
import extra_exercise1.model.ImportProduct;
import extra_exercise1.service.IService;
import extra_exercise1.util.NotFoundProductException;
import extra_exercise1.util.ReadAndWriteToCSV;
import extra_exercise1.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportProductServiceImpl implements IService {
    static List<ImportProduct> importProductList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static final String CHECK_POSITIVE = "^[1-9]\\d{0,}$";

    @Override
    public void add() {
        List<ImportProduct> importProductList = ReadAndWriteToCSV.readImport();
        int id=1;
        if (!importProductList.isEmpty()){
            id = importProductList.size()+1;
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
        System.out.print("Enter product's import_price: ");
        int importPrice = Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_POSITIVE,"Invalid"));
        System.out.print("Enter import_province: ");
        String importProvince = scanner.nextLine();
        System.out.print("Enter product's import_tax: ");
        int importTax = Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_POSITIVE,"Invalid"));

        ImportProduct importProduct = new ImportProduct(id,sku,name,price,quantity,manufacture,importPrice,importProvince,importTax);
        importProductList.add(importProduct);
        ReadAndWriteToCSV.writeImport(importProductList,false);
        System.out.println("Addition successful!");
    }

    @Override
    public void delete() throws NotFoundProductException {
        List<ImportProduct> importProductList = ReadAndWriteToCSV.readImport();
        display();
        boolean flag = true;
        System.out.print("Nhập SKU: ");
        String sku = scanner.nextLine();
        for (int i = 0; i < importProductList.size(); i++) {
            if (sku.equals(importProductList.get(i).getSku())) {
                flag = false;
                System.out.println(importProductList.get(i).toString() + "\n" +
                        "Bạn có muốn xóa sản phẩm này Y/N");
                String decide = scanner.nextLine().toUpperCase();
                if ("Y".contains(decide)) {
                    importProductList.remove(i);
                    ReadAndWriteToCSV.writeImport(importProductList, false);
                    System.out.println("Xóa thành công");
                    break;
                } else {
                    break;
                }
            } else {
                throw new NotFoundProductException("Sản phẩm không tồn tại");
            }
        }
        if (flag) {
            throw new NotFoundProductException("Sản phẩm không tồn tại");
        }
    }

    @Override
    public void display() {
        List<ImportProduct> importProductList = ReadAndWriteToCSV.readImport();
        System.out.println("=====Export Product List=====");
        for (ImportProduct importProduct:importProductList) {
            System.out.println(importProduct.toString());
        }
    }

    @Override
    public void search() {
        display();
        List<ImportProduct> importProductList = ReadAndWriteToCSV.readImport();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        boolean flag = true;
        for (int i=0; i<importProductList.size(); i++){
            if (name.contains(importProductList.get(i).getName())){
                System.out.println(importProductList.get(i).toString());
                flag = false;
            }
        }
        if (flag){
            System.out.println("Sản phẩm không tồn tại");
        }
    }
}
