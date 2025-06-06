package ss8_bai_tap_them_oop.Phuong_tien_giao_thong.Model;

public class Oto extends PhuongTienGiaoThong {
    private double soChoNgoi;
    private String kieuXe;

    public Oto() {
    }

    public Oto(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public double getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setSoChoNgoi(double soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
}
