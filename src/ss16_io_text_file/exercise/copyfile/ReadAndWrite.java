package ss16_io_text_file.exercise.copyfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String> readFile(String path){
        ArrayList<String> list = new ArrayList<>();
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                list.add(line);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void writeFile(String destinyPath, String path){
        try{
            File file = new File(destinyPath);
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String e: readFile(path)) {
                bufferedWriter.write(e);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        readAndWrite.readFile("src\\ss16_io_text_file\\exercise\\copyfile\\copyfile.txt");
        readAndWrite.writeFile("src\\ss16_io_text_file\\exercise\\copyfile\\destinyfile.txt","src\\ss16_io_text_file\\exercise\\copyfile\\copyfile.txt");
    }
}
