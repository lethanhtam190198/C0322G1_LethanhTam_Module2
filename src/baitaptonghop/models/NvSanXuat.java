package baitaptonghop.models;

import baitaptonghop.service.Service;

public class NvSanXuat extends StaffPerson {
    private int soSanPham;

    public NvSanXuat() {
    }

    @Override
    public double tienluong() {
        return this.soSanPham * 50000;
    }

    public NvSanXuat(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public NvSanXuat(String nameStaff, String dayOfBirth, String address, int soSanPham) {
        super(nameStaff, dayOfBirth, address);
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return "NvSanXuat " + super.toString() +
                "soSanPham=" + soSanPham +
                ", lương=" + tienluong();
    }

}
