package baitaptonghop.service;

import baitaptonghop.models.NvCongNhat;
import baitaptonghop.models.NvQuanLi;
import baitaptonghop.models.NvSanXuat;
import baitaptonghop.models.StaffPerson;

import java.util.ArrayList;
import java.util.Collections;


public class PersonImpl implements Service {
    public static ArrayList<StaffPerson> staffPersonArrayList = new ArrayList<>();  // arraylist ko cần khởi tạo phần tử vì mặc định đã có 10 phần tử.Nếu có thêm phần tử thì Arraylist sẽ thêm 50% số phần tử.

    static {
        staffPersonArrayList.add(new NvCongNhat("tam", "1998", "dn", 20));
        staffPersonArrayList.add(new NvSanXuat("duc", "1997", "ht", 20));
        staffPersonArrayList.add(new NvQuanLi("dong", "1996", "dn", 20, 2));
        staffPersonArrayList.add(new NvQuanLi("hai", "1990", "qn", 20, 5));
        staffPersonArrayList.add(new NvCongNhat("tuan", "1991", "qn", 20));
        staffPersonArrayList.add(new NvCongNhat("aa", "1999", "aa", 10));

    }


    public static void displayNV() {
        for (StaffPerson item : staffPersonArrayList) {
            System.out.println(item);

        }
    }


    public static void displayNvCongnhat() {
        for (StaffPerson item : staffPersonArrayList) {
            if (item instanceof NvCongNhat) {  //item thuộc kiểu dữ liệu NvCongNhat
                System.out.println(item);
            }
        }
    }

    public static void displayNvQuanli() {
        for (StaffPerson item : staffPersonArrayList) {
            if (item instanceof NvQuanLi) { //item thuộc kiểu dữ liệu NvQuanLi
                System.out.println(item);
            }
        }
    }

    public static void displayNvSanXuat() {
        for (StaffPerson item : staffPersonArrayList) {
            if (item instanceof NvSanXuat) {  //item thuộc kiểu dữ liệu NvSanXuat
                System.out.println(item);
            }
        }
    }


    @Override
    public void display() {

    }

    @Override
    public void sapXepTangTheoLuong() {
        Collections.sort(staffPersonArrayList, new SapXepTheoLuong());
        displayNV();
    }

    @Override
    public void sapXepTheoTen() {
        Collections.sort(staffPersonArrayList, new SapXepTheoTen());
        displayNV();
    }

}

//không nên dùng fori để duyệt linkedlist, vì sau mỗi lần duyệt sẽ chạy lại từ đầu-> gây mất thời gian, hiệu xuất không cao(tuy vẫn có thể dùng)
//Thay đổi liên tục về nhân sự nên dùng linkedlist, vì khi thêm xoá phần tử trong linked list, thì sẽ bẽ gãy liên kết giữa các node
// rồi nối lại địa chỉ mới-> thao tác thêm xoá nhanh hơn arraylist
// Arrat list nên dùng với mảng cố định.

//Đối với LinkedList:
//Nếu công ty có 1001 nhân viên thì sẽ không vấn đề gì vì sao ArrayList không cần khởi tạo 1000 phần tử trước?
//vì mỗi lần thêm phần tử arraylist nếu thừa phần tử sẽ tự động tạo ra thêm phần tử bằng mảng cũ +50% độ dài.

//Đối với Array:
//Nếu công ty có 1001 nhân viên thì sẽ xảy ra lỗi ArrayIndexOutOfBoundsException tràn mảng

//Nên tạo class interface khi tất cả lớp con đều kế thừa lại thuộc tính của lớp cha.
// dùng abstract class khi ghi lại phương thức của lớp con
