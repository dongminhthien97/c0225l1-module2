package ss8_bai_tap_them_oop.Phuong_tien_giao_thong.Model;

public class XeMay extends PhuongTienGiaoThong{
    private double congSuat;
    public XeMay() {}

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

}
