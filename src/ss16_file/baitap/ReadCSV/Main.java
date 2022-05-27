package ss16_file.baitap.ReadCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/ss16_file/baitap/ReadCSV/text.csv");
        List<String[]> list = new ArrayList<>();
        List<Country> countries = new ArrayList<>();
        if (!file.exists()) {
            System.out.println("file ko ton tai!!");
        } else {
            String str;
            String[] array;
            try (FileReader fileRead = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileRead)) {
                while ((str = bufferedReader.readLine()) != null) {
                    array=str.split(",");
                    list.add(array);
                }
                for (String[] item:list ) {
                    Country country= new Country(Integer.parseInt(item[0]),item[1],item[2]);
                    countries.add(country);
                }
                System.out.println("countries list:");
                for (Country item: countries) {
                    System.out.println(item);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
