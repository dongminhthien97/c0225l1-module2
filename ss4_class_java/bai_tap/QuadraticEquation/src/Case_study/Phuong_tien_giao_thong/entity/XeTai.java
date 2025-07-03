package Case_study.Phuong_tien_giao_thong.entity;

public class XeTai extends PhuongTienGiaoThong {
    private double trongTai;

    public XeTai() {}

    public XeTai(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat() +"," + this.getTenHangSanXuat() +","
                + this.getNamSanXuat() +"," + this.getChuSoHuu() + "," + this.getTrongTai();
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
