package ss16_io_text_file.exercise.readfile;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public void readFile(String path){
        ArrayList<String> list = new ArrayList<>();
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line=null;
            String[] string = null;
            if ((line=bufferedReader.readLine())!=null){
                string = line.split(",");
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
