package baitaptonghop.service;

import baitaptonghop.models.NvCongNhat;
import baitaptonghop.models.NvQuanLi;
import baitaptonghop.models.NvSanXuat;
import baitaptonghop.models.StaffPerson;

import java.util.HashMap;

public class TreeMap {
    public static HashMap<Integer, StaffPerson> staffPersonHashMap = new HashMap<>();

    static {
        staffPersonHashMap.put(1, new NvCongNhat("tam", "DN", "Qn", 1));
        staffPersonHashMap.put(2, new NvQuanLi("tran van hai", "1990", "DN", 24, 5));
        staffPersonHashMap.put(3, new NvSanXuat("tran van d", "1991", "qn", 200));
    }

    public static void main(String[] args) {
        for (Integer item : staffPersonHashMap.keySet()) {
            if (item != null) {
                System.out.println(item + " " + staffPersonHashMap.get(item));
            } else {
                if (staffPersonHashMap.containsKey(item)) {
                } else {
                }
            }
        }
    }
}
