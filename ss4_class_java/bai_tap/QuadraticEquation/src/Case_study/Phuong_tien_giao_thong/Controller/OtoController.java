package Case_study.Phuong_tien_giao_thong.Controller;

import Case_study.Phuong_tien_giao_thong.View.OtoView;
import Case_study.Phuong_tien_giao_thong.entity.Oto;
import Case_study.Phuong_tien_giao_thong.service.IOtoService;
import Case_study.Phuong_tien_giao_thong.service.OtoService;


import java.util.List;
import java.util.Scanner;

public class OtoController {
    private IOtoService oToService = new OtoService();
    private Scanner scanner = new Scanner(System.in);
    private final int DISPLAY =1;
    private final int ADD =2;
    private final int DELETE = 3;
    private final int QUIT =4;
    public  void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("----Quản lý ô tô-----\n" +
                    "1. Danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Xoá\n" +
                    "4. Thoát\n");
            System.out.println("Chọn chức năng: \n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    List<Oto> oToList = oToService.findAll();
                    OtoView.display(oToList);
                    break;
                case ADD:
                    Oto oTo = OtoView.oToInput();
                    oToService.add(oTo);
                    System.out.println("Thêm mới thành công");
                    break;
                case DELETE:
                    System.out.println("Nhập biển kiểm soát cần xoá");
                    String bienKiemSoat = scanner.nextLine();
                    boolean isDelete = oToService.deletebyBks(bienKiemSoat);
                    if (isDelete) {
                        System.out.println("Xoá thành công");
                    }else{
                        System.out.println("Không tìm thấy biển kiểm soát");
                    }
                    break;
                case QUIT:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
