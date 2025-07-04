package QUANLYDANHBA.VIEW;

import QUANLYDANHBA.CONTROLLER.DanhBaController;
import QUANLYDANHBA.Enity.DanhBa;
import QUANLYDANHBA.REPOSITORY.DanhBaRepository;
import QUANLYDANHBA.SERVICE.DanhBaService;
import QUANLYDANHBA.SERVICE.IDanhBaService;

import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args)  {

        DanhBaController danhBaController = new DanhBaController();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n========== CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ==========");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi từ file");
            System.out.println("8. Thoát");
            System.out.println("====================================================");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: List<DanhBa> danhBaList = DanhBaRepository.findAll();
                    DanhBaView.display(danhBaList);
                    break;
                case 2:
                    DanhBa danhBa = DanhBaView.inputData();
                    DanhBaRepository.add(danhBa);
                    System.out.println("Them moi thanh cong!");
                    break;
                    case 3:
                        break;
                case 4:
                    System.out.println("Nhap so dien thoai can xoa: ");
                    String tel = scanner.nextLine();
                    boolean removed = IDanhBaService.deleteByTel(tel);

                    break;


            }


        }

    }
}
