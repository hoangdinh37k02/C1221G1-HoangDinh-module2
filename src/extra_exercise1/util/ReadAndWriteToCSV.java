package extra_exercise1.util;

import extra_exercise1.model.ExportProduct;
import extra_exercise1.model.ImportProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
    public static final String EXPORT_FILE = "src\\extra_exercise1\\data\\export_product.csv";
    public static final String IMPORT_FILE = "src\\extra_exercise1\\data\\import_product.csv";

    public static void writeExport(List<ExportProduct> exportProductList, boolean append) {
        try {
            File file = new File(EXPORT_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ExportProduct e : exportProductList) {
                bufferedWriter.write(e.getInFoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ExportProduct> readExport() {
        List<ExportProduct> exportProductList = new ArrayList<>();

        try {
            File file = new File(EXPORT_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                ExportProduct exportProduct = new ExportProduct(Integer.parseInt(arr[0]), arr[1],
                        arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]), arr[7]);
                exportProductList.add(exportProduct);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return exportProductList;
    }

    public static void writeImport(List<ImportProduct> importProductList, boolean append) {
        try {
            File file = new File(IMPORT_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ImportProduct e : importProductList) {
                bufferedWriter.write(e.getInFoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ImportProduct> readImport() {
        List<ImportProduct> importProductList = new ArrayList<>();

        try {
            File file = new File(IMPORT_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
//                int id, String sku, String name, int price, int quantity,
//                         String manufacture, int importPrice, String importProvince, int importTax
                ImportProduct importProduct = new ImportProduct(Integer.parseInt(arr[0]), arr[1],
                        arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]), arr[7],Integer.parseInt(arr[8]));
                importProductList.add(importProduct);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return importProductList;
    }
}
