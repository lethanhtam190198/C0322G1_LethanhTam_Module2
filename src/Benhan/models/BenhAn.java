package Benhan.models;

public abstract  class BenhAn {
    int sttBenhAn;
    String maBenhAn;
    String tenBenhNhan;
    String ngayNhapvVien;
    String ngayRaVien;
    String lyDoNhapVien;

    public BenhAn() {
    }

    public BenhAn(int sttBenhAn, String maBenhAn, String tenBenhNhan, String ngayNhapvVien, String ngayRaVien, String lyDoNhapVien) {
        this.sttBenhAn = sttBenhAn;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapvVien = ngayNhapvVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public int getSttBenhAn() {
        return sttBenhAn;
    }

    public void setSttBenhAn(int sttBenhAn) {
        this.sttBenhAn = sttBenhAn;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayNhapvVien() {
        return ngayNhapvVien;
    }

    public void setNgayNhapvVien(String ngayNhapvVien) {
        this.ngayNhapvVien = ngayNhapvVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }
    public abstract String getInfo();

    @Override
    public String toString() {
        return "BenhAn{" +
                "sttBenhAn='" + sttBenhAn + '\'' +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapvVien='" + ngayNhapvVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                '}';
    }
}
