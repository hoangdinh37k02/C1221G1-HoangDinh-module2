package oop_review.demo1.util;

import oop_review.demo1.models.Experience;
import oop_review.demo1.models.Fresher;
import oop_review.demo1.models.Intern;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {
    static final String EXPERIENCE_FILE = "src\\oop_review\\demo1\\data\\Experience.csv";
    static final String FRESHER_FILE = "src\\oop_review\\demo1\\data\\Fresher.csv";
    static final String INTERN_FILE = "src\\oop_review\\demo1\\data\\Intern.csv";

    public static void writeExperienceToCSV(List<Experience> experiencesList, boolean append) {
        try {
            File file = new File(EXPERIENCE_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Experience e : experiencesList) {
                bufferedWriter.write(e.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Experience> readExperienceFromCSV() {
        List<Experience> experienceList = new ArrayList<>();

        try {
            File file = new File(EXPERIENCE_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Experience experience = new Experience(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]),
                        Integer.parseInt(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], Integer.parseInt(arr[8]), arr[9]);
                experienceList.add(experience);

            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return experienceList;
    }


    public static void writeFresherToCSV(List<Fresher> fresherList, boolean append) {
        try {
            File file = new File(FRESHER_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Fresher f : fresherList) {
                bufferedWriter.write(f.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Fresher> readFresherFromCSV() {
        List<Fresher> fresherList = new ArrayList<>();

        try {
            File file = new File(FRESHER_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Fresher fresher = new Fresher(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]),
                        Integer.parseInt(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], Integer.parseInt(arr[8]), arr[9], arr[10]);
                fresherList.add(fresher);

            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return fresherList;
    }


    public static void writeInternToCSV(List<Intern> internList, boolean append) {
        try {
            File file = new File(INTERN_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Intern i : internList) {
                bufferedWriter.write(i.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Intern> readInternFromCSV() {
        List<Intern> internList = new ArrayList<>();

        try {
            File file = new File(INTERN_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Intern intern = new Intern(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]),
                        Integer.parseInt(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
                internList.add(intern);

            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return internList;
    }
}
