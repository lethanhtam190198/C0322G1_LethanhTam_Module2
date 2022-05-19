package ss11_Dsa_Stack_Queue.baitap.RingLink;

import java.util.TreeMap;

public class RingLink {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String str = "tam tam 1 1 ";
        char[] newStr = str.toUpperCase().toCharArray();
        int key;
        for (char newStr1 : newStr) {
            if (map.containsKey(newStr1)) {
                key = map.get(newStr1) + 1;
            } else {
                key = 1;
            }
            map.put(newStr1, key);
        }
        System.out.println(map);
    }
}
