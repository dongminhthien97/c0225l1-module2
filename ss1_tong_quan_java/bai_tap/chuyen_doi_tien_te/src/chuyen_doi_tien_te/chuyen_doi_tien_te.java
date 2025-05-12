package chuyen_doi_tien_te;
import java.util.Scanner;
public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap USD:  ");
        USD = sc.nextDouble();
        double quydoi = USD * 23000;
        System.out.printf("Gia tri quy doi la: " + quydoi);
    }
}
