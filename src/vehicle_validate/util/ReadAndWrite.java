package vehicle_validate.util;

import oop_review.demo1.models.Experience;
import oop_review.extra_exercise.Oto;
import vehicle_validate.models.OTo;
import vehicle_validate.models.XeMay;
import vehicle_validate.models.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String OTO_FILE = "src\\vehicle_validate\\data\\Oto.csv";
    public static final String XETAI_FILE = "src\\vehicle_validate\\data\\XeTai.csv";
    public static final String XEMAY_FILE = "src\\vehicle_validate\\data\\XeMay.csv";

    public static void writeOtoFile(List<OTo> oToList, boolean append){
        try {
            File file = new File(OTO_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (OTo e : oToList) {
                bufferedWriter.write(e.getBaseInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<OTo> readOtoFile() {
        List<OTo> oToList = new ArrayList<>();
        try {
            File file = new File(OTO_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                OTo oto = new OTo(arr[0], arr[1],
                        arr[2], arr[3], arr[4], arr[5]);
                oToList.add(oto);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return oToList;
    }


    public static void writeXeMayFile(List<XeMay> xeMayList, boolean append){
        try {
            File file = new File(XEMAY_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (XeMay e : xeMayList) {
                bufferedWriter.write(e.getBaseInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<XeMay> readXeMayFile() {
        List<XeMay> xeMayList = new ArrayList<>();
        try {
            File file = new File(XEMAY_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                XeMay xeMay = new XeMay(arr[0], arr[1],
                        arr[2], arr[3], Integer.parseInt(arr[4]));
                xeMayList.add(xeMay);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return xeMayList;
    }

    public static void writeXeTaiFile(List<XeTai> xeTaiList, boolean append){
        try {
            File file = new File(XETAI_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (XeTai e : xeTaiList) {
                bufferedWriter.write(e.getBaseInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<XeTai> readXeTaiFile() {
        List<XeTai> xeTaiList = new ArrayList<>();
        try {
            File file = new File(XETAI_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                XeTai xeTai = new XeTai(arr[0], arr[1],
                        arr[2], arr[3], Integer.parseInt(arr[4]));
                xeTaiList.add(xeTai);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return xeTaiList;
    }
}
