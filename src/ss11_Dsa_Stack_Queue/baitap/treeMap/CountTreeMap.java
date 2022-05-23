package ss11_Dsa_Stack_Queue.baitap.treeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class CountTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Input Text:");
        String text = scanner.nextLine();
        String[] string = text.split(" ");
        for (int i = 0; i < string.length; i++) {
            if (treeMap.containsKey(string[i])) {
                treeMap.put(string[i], treeMap.get(string[i]) + 1);
            } else {
                treeMap.put(string[i], 1);
            }
        }
        System.out.println(treeMap);
    }
}
