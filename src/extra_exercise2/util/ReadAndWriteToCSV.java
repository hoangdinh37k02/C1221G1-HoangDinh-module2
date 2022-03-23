package extra_exercise2.util;

import extra_exercise1.model.ExportProduct;
import extra_exercise2.model.AuthenticPhone;
import extra_exercise2.model.HandPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
    static final String AUTHENTIC_FILE = "src\\extra_exercise2\\data\\authenticphone.csv";
    static final String HAND_FILE = "src\\extra_exercise2\\data\\handphone.csv";

    public static void writeAuthentic(List<AuthenticPhone> authenticPhoneList, boolean append) {
        try {
            File file = new File(AUTHENTIC_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (AuthenticPhone e : authenticPhoneList) {
                bufferedWriter.write(e.getInFoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<AuthenticPhone> readAuthentic() {
        List<AuthenticPhone> authenticPhoneList = new ArrayList<>();

        try {
            File file = new File(AUTHENTIC_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
//                int id, String name, int price, int quantity,
//                          String manufacture, int warrantyTime, String warrantyLimit
                arr = line.split(",");
                AuthenticPhone authenticPhone = new AuthenticPhone(Integer.parseInt(arr[0]), arr[1],
                        Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], Integer.parseInt(arr[5]),arr[6]);
                authenticPhoneList.add(authenticPhone);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return authenticPhoneList;
    }

    public static void writeHand(List<HandPhone> handPhoneList, boolean append) {
        try {
            File file = new File(HAND_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (HandPhone e : handPhoneList) {
                bufferedWriter.write(e.getInFoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<HandPhone> readHand() {
        List<HandPhone> handPhoneList = new ArrayList<>();

        try {
            File file = new File(HAND_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
//                int id, String name, int price, int quantity, String manufacture,
//                        String nation, String status
                arr = line.split(",");
                HandPhone handPhone = new HandPhone(Integer.parseInt(arr[0]), arr[1],
                        Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5],arr[6]);
                handPhoneList.add(handPhone);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return handPhoneList;
    }
}
