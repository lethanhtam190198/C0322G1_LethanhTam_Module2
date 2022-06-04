package Benhan.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFile(String pathFile, String data) throws IOException {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
        }
    }
    public static List<String[]> readerFile(String pathFile){
        File file = new File(pathFile);
        List<String[]> list = new ArrayList<>();
        String line;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            while ((line = bufferedReader.readLine()) !=null){
                String[] arr = line.split(",");
                list.add(arr);
            }
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void clearFile(String pathFile) throws IOException {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
        }
    }
}
