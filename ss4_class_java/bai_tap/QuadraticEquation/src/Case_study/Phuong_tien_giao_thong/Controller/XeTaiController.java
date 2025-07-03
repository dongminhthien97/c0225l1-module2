package Case_study.Phuong_tien_giao_thong.Controller;

import Case_study.Phuong_tien_giao_thong.View.XeTaiView;
import Case_study.Phuong_tien_giao_thong.entity.XeTai;
import Case_study.Phuong_tien_giao_thong.service.IXeTaiService;
import Case_study.Phuong_tien_giao_thong.service.XeTaiService;

import java.util.List;
import java.util.Scanner;

public class XeTaiController {
    private IXeTaiService xeTaiService = new XeTaiService();
    private Scanner scanner = new Scanner(System.in);
    private final int DISPLAY =1;
    private final int ADD =2;
    private final int DELETE = 3;
    private final int QUIT =4;
    public  void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý xe tải:\n" +
                    "1. Danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Xoá\n" +
                    "4. Thoát\n");
            System.out.println("Chọn chức năng: \n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    List<XeTai> xeTaiList = xeTaiService.findAll();
                    XeTaiView.display(xeTaiList);
                    break;
                case ADD:
                    XeTai xeTai = XeTaiView.xeTaiInput();
                    xeTaiService.add(xeTai);
                    System.out.println("Thêm mới thành công");
                    break;
                    case DELETE:
                        System.out.println("Nhập biển kiểm soát cần xoá");
                        String bienKiemSoat = scanner.nextLine();
                        boolean isDelete = xeTaiService.deletebyBks(bienKiemSoat);
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
