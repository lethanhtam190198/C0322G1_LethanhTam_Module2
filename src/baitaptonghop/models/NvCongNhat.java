package baitaptonghop.models;

import baitaptonghop.service.Service;

import java.util.Comparator;

public class NvCongNhat extends StaffPerson {
    private int soNgayCong;

    public NvCongNhat() {
    }

    @Override
    public double tienluong() {
        return this.soNgayCong * 120000;
    }

    public NvCongNhat(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public NvCongNhat(String nameStaff, String dayOfBirth, String address, int soNgayCong) {
        super(nameStaff, dayOfBirth, address);
        this.soNgayCong = soNgayCong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    @Override
    public String toString() {
        return "NvCongNhat " + super.toString() +
                ", soNgayCong=" + soNgayCong +
                ", lương=" + tienluong();
    }


}