package Case_study.Phuong_tien_giao_thong.View;

import Case_study.Phuong_tien_giao_thong.entity.Oto;
import Case_study.Phuong_tien_giao_thong.entity.XeMay;

import java.util.List;
import java.util.Scanner;

public class XeMayView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(List<XeMay> xeMayList) {
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay.toString());
        }
    }
    public static XeMay xeMayInput() {
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        String namSanXuat = scanner.nextLine();
        System.out.println("Nhập chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhap cong suat: ");
        double congSuat = Double.parseDouble(scanner.nextLine());
        return new XeMay(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,congSuat);
    }

}
