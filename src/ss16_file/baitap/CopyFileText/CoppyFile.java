package ss16_file.baitap.CopyFileText;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFile {
    public static void main(String[] args) {
        List<String> stringList = read("src/ss16_file/baitap/CopyFileText/text.txt");
        String copy = "";
        for (String string : stringList) {
            copy += string + "\n";
        }
        write("src/ss16_file/baitap/CopyFileText/text1.txt", copy);
    }
    public static List<String> read(String pathFile) {
        File file = new File(pathFile);
        List<String> list = new ArrayList<>();
        try (FileReader fileReader1 = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader1);

        ) {
            String line = " ";

            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return list;
    }

    public static void write(String pathFile, String data) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


