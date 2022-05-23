package baitaptonghop.models;

import baitaptonghop.service.Service;

public class NvQuanLi extends StaffPerson {
    private double luongCoBan;
    private double heSoLuong;

    public NvQuanLi() {
    }

    @Override
    public double tienluong() {
        return this.heSoLuong * this.luongCoBan;
    }

    public NvQuanLi(double luongCoBan, double heSoLuong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public NvQuanLi(String nameStaff, String dayOfBirth, String address, double luongCoBan, double heSoLuong) {
        super(nameStaff, dayOfBirth, address);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "NvQuanLi " + super.toString() +
                ", luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong +
                ", lương=" + tienluong();
    }

}
