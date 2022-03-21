package extra_exercise.ultil;

import extra_exercise.model.BenhNhanThuong;
import extra_exercise.model.BenhNhanVIP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String BENH_NHAN_THUONG_FILE = "src\\extra_exercise\\data\\benhnhanthuong.csv";
    public static final String BENH_NHAN_VIP_FILE = "src\\extra_exercise\\data\\benhnhanvip";

    public static void writeBenhNhanThuong(List<BenhNhanThuong> benhNhanThuongList, boolean append) {
        try {
            File file = new File(BENH_NHAN_THUONG_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (BenhNhanThuong e : benhNhanThuongList) {
                bufferedWriter.write(e.getInFoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<BenhNhanThuong> readBenhNhanThuong() {
        List<BenhNhanThuong> benhNhanThuongList = new ArrayList<>();

        try {
            File file = new File(BENH_NHAN_THUONG_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                BenhNhanThuong benhNhanThuong = new BenhNhanThuong(Integer.parseInt(arr[0]), arr[1],
                        arr[2], arr[3], arr[4], arr[5], Double.parseDouble(arr[6]));
                benhNhanThuongList.add(benhNhanThuong);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return benhNhanThuongList;
    }

    public static void writeBenhNhanVIP(List<BenhNhanVIP> benhNhanVIPList, boolean append) {
        try {
            File file = new File(BENH_NHAN_VIP_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (BenhNhanVIP e : benhNhanVIPList) {
                bufferedWriter.write(e.getInFoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<BenhNhanVIP> readBenhNhanVIP() {
        List<BenhNhanVIP> benhNhanVIPList = new ArrayList<>();

        try {
            File file = new File(BENH_NHAN_VIP_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                BenhNhanVIP benhNhanVIP = new BenhNhanVIP(Integer.parseInt(arr[0]), arr[1],
                        arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
                benhNhanVIPList.add(benhNhanVIP);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return benhNhanVIPList;
    }

}
