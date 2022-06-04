package Benhan.models;

public class BenhAnVip extends BenhAn{
    String loaiVip;
    String timeVip;

    public BenhAnVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public BenhAnVip() {
    }

    public BenhAnVip(String loaiVip, String timeVip) {
        this.loaiVip = loaiVip;
        this.timeVip = timeVip;
    }

    public BenhAnVip(int sttBenhAn, String maBenhAn, String tenBenhNhan, String ngayNhapvVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String timeVip) {
        super(sttBenhAn, maBenhAn, tenBenhNhan, ngayNhapvVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.timeVip = timeVip;
    }

    public  String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getTimeVip() {
        return timeVip;
    }

    public void setTimeVip(String timeVip) {
        this.timeVip = timeVip;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                "sttBenhAn='" + sttBenhAn + '\'' +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapvVien='" + ngayNhapvVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                ", loaiVip='" + loaiVip + '\'' +
                ", timeVip='" + timeVip + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getSttBenhAn(),
                super.getMaBenhAn(),
                super.getTenBenhNhan(),
                super.getNgayNhapvVien(),
                super.getNgayRaVien(),
                super.getLyDoNhapVien(),
                getLoaiVip(),
                getTimeVip());
    }
}
