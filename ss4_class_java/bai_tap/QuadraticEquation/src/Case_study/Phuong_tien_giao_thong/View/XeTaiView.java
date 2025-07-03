package Case_study.Phuong_tien_giao_thong.View;

import Case_study.Phuong_tien_giao_thong.entity.XeTai;

import java.util.List;
import java.util.Scanner;

public class XeTaiView {

    private static Scanner scanner = new Scanner(System.in);

    public static void display(List<XeTai> xeTaiList) {
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai.toString());
        }
    }
    public static XeTai xeTaiInput(){
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        String namSanXuat = scanner.nextLine();
        System.out.println("Nhập chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập tải trọng:");
        Double taiTrong = scanner.nextDouble();
        return new XeTai(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,taiTrong);
    }
}
