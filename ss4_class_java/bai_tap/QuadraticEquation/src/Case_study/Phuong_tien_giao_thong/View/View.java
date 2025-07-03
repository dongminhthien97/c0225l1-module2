package Case_study.Phuong_tien_giao_thong.View;

import Case_study.Phuong_tien_giao_thong.Controller.OtoController;
import Case_study.Phuong_tien_giao_thong.Controller.XeMayController;
import Case_study.Phuong_tien_giao_thong.Controller.XeTaiController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        XeTaiController xeTaiController = new XeTaiController();
        OtoController oToController = new OtoController();
        XeMayController xeMayController = new XeMayController();
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        while (quit) {
            System.out.println("Chọn chức năng quản lý:\n" +
                    "1. Quản lý xe tải\n" +
                    "2. Quản lý ô tô\n" +
                    "3. Quản lý xe máy\n"+
                    "4. Thoát");

            System.out.println("Chọn chức năng: \n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    xeTaiController.displayMenu();
                    break;
                case 2:
                    oToController.displayMenu();
                    break;
                case 3:
                    xeMayController.displayMenu();
                    break;
                    case 4:
                        quit = false;
                        System.out.println("Cam on da su dung chuong trinh");
                        break;
                default:
                    quit = false;
            }
        }
    }
}
