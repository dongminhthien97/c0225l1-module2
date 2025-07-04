package Case_study.Phuong_tien_giao_thong.entity;

public class XeMay extends PhuongTienGiaoThong {
    private double congSuat;
    public XeMay() {}

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat() +"," + this.getTenHangSanXuat() +","
                + this.getNamSanXuat() +"," + this.getChuSoHuu() + "," + this.getCongSuat();
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}

