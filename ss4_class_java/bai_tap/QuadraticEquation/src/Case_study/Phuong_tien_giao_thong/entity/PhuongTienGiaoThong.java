package Case_study.Phuong_tien_giao_thong.entity;

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

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public abstract String getInfoToCSV();
}
