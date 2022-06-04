package Benhan.models;

public class BenhAnThuong extends BenhAn {
    double phi;

    public BenhAnThuong() {
    }

    public BenhAnThuong(double phi) {
        this.phi = phi;
    }

    public BenhAnThuong(int sttBenhAn, String maBenhAn, String tenBenhNhan, String ngayNhapvVien, String ngayRaVien, String lyDoNhapVien, double phi) {
        super(sttBenhAn, maBenhAn, tenBenhNhan, ngayNhapvVien, ngayRaVien, lyDoNhapVien);
        this.phi = phi;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "sttBenhAn='" + sttBenhAn + '\'' +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapvVien='" + ngayNhapvVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                ", phi=" + phi +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getSttBenhAn(),
                super.getMaBenhAn(),
                super.getTenBenhNhan(),
                super.getNgayNhapvVien(),
                super.getNgayRaVien(),
                super.getLyDoNhapVien(),
                getPhi());
    }
}
