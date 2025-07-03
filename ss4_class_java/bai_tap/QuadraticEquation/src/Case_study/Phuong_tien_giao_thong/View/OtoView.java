package Case_study.Phuong_tien_giao_thong.View;

import Case_study.Phuong_tien_giao_thong.entity.Oto;

import java.util.List;
import java.util.Scanner;

public class OtoView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(List<Oto> oToList) {
        for (Oto oTo : oToList) {
            System.out.println(oTo.toString());
        }
    }
    public static Oto oToInput(){
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        String namSanXuat = scanner.nextLine();
        System.out.println("Nhập chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhap kieu xe: ");
        String kieuXe = scanner.nextLine();
        System.out.println("Nhap so cho ngoi: ");
        double soChoNgoi = scanner.nextDouble();
        return new Oto(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,kieuXe,soChoNgoi);
    }
}

