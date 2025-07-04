package QUANLYDANHBA.VIEW;

import QUANLYDANHBA.Enity.DanhBa;
import QUANLYDANHBA.UTIL.Validator;

import java.util.List;
import java.util.Scanner;

public class DanhBaView {
    public static Scanner scanner = new Scanner(System.in);

    public static void display(List<DanhBa> danhBaList) {
        for(DanhBa d : danhBaList) {
            System.out.println(d);
        }
    }

    public static DanhBa inputData(){
        String tel ="";
        do {
            System.out.println("Nhap so dien thoai: ");
            tel = scanner.nextLine();
        }while(!Validator.checkTel(tel));
        System.out.println("Nhap nhom: ");
        String group = scanner.nextLine();
        System.out.println("Nhap ho ten");
        String name = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap ngay sinh");
        String birthday = scanner.nextLine();
        String email = "";
        do{
            System.out.println("Nhap email: ");
            email = scanner.nextLine();

        }while(!Validator.checkEmail(email));
        return new DanhBa(tel,group,name,sex,address,birthday,email);
    }
}
