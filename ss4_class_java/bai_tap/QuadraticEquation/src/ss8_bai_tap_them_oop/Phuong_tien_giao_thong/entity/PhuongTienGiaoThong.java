package ss8_bai_tap_them_oop.Phuong_tien_giao_thong.entity;

public abstract class PhuongTienGiaoThong {
    public String bienKiemSoat;
    public String tenHangSanXuat;
    public String namSanXuat;
    public String chuSoHuu;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }
}
