package ss16_io_text_file.exercise.readfile;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public void readFile(String path){
        ArrayList<String[]> list = new ArrayList<>();
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line=null;
            String[] string = null;
            while ((line=bufferedReader.readLine())!=null){
                string = line.split(",");
                list.add(string);
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        for (int i=0; i<list.size(); i++){
            for (int j=0;j<=2;j++){
                System.out.print(list.get(i)[j]+",");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.readFile("src\\ss16_io_text_file\\exercise\\readfile\\nation.csv");
    }
}
