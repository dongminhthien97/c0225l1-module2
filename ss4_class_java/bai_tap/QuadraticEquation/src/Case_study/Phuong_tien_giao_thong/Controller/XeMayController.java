package Case_study.Phuong_tien_giao_thong.Controller;

import Case_study.Phuong_tien_giao_thong.View.XeMayView;
import Case_study.Phuong_tien_giao_thong.entity.XeMay;
import Case_study.Phuong_tien_giao_thong.service.IXeMayService;
import Case_study.Phuong_tien_giao_thong.service.XeMayService;

import java.util.List;
import java.util.Scanner;

public class XeMayController {
    private IXeMayService xeMayService= new XeMayService();
    private Scanner scanner = new Scanner(System.in);
    private final int DISPLAY =1;
    private final int ADD =2;
    private final int DELETE = 3;
    private final int QUIT =4;
    public  void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý xe may:\n" +
                    "1. Danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Xoá\n" +
                    "4. Thoát\n");
            System.out.println("Chọn chức năng: \n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    List<XeMay> xeMayList = xeMayService.findAll();
                    XeMayView.display(xeMayList);
                    break;
                case ADD:
                    XeMay xeMay = XeMayView.xeMayInput();
                    xeMayService.add(xeMay);
                    System.out.println("Thêm mới thành công");
                    break;
                case DELETE:
                    System.out.println("Nhập biển kiểm soát cần xoá");
                    String bienKiemSoat = scanner.nextLine();
                    boolean isDelete = xeMayService.deletebyBks(bienKiemSoat);
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
