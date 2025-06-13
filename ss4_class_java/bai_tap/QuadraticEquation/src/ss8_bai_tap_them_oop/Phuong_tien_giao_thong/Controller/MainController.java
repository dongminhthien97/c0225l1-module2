package ss8_bai_tap_them_oop.Phuong_tien_giao_thong.Controller;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHUƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
        System.out.println("Chọn chức năng");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Xoá phương tiện");
        System.out.println("4. Thoát chương trình");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:

        }

    }
}
