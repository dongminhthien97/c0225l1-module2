package ss8_bai_tap_them_oop.Phuong_tien_giao_thong.View;

import ss8_bai_tap_them_oop.Phuong_tien_giao_thong.entity.XeTai;

import java.util.List;
import java.util.Scanner;

public class XeTaiView {
    private static Scanner scanner = new Scanner(System.in);

    public void display(List<XeTai> xeTaiList) {
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai.toString());
        }
    }
    public static void inputData(){
        System.out.println("Nhập biển kiểm soát: ");
        String bks = scanner.nextLine();
    }
}
