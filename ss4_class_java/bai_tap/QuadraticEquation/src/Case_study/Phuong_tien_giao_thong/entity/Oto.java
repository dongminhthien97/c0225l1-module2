package Case_study.Phuong_tien_giao_thong.entity;

public class Oto extends PhuongTienGiaoThong {
    private String kieuXe;
    private double soChoNgoi;

    public Oto() {
    }


    public Oto(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String kieuXe, double soChoNgoi) {
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

    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat() + ", " + this.getTenHangSanXuat() +", "
                + this.getNamSanXuat()+ ", "
                + this.getChuSoHuu()+ ", " + this.getKieuXe() +"," +this.getSoChoNgoi();
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
