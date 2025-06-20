package ss15_exception_debug.IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a: ");
            double a = scanner.nextDouble();

            System.out.println("Nhập cạnh b: ");
            double b = scanner.nextDouble();

            System.out.println("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            checkTriangle(a, b, c);
        }catch(IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }
    }

    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
           throw new IllegalTriangleException("Số nhập vào phải là số dương");
        }
        if (a + b > c || a + b < c || b + c > a) {
            throw new IllegalTriangleException("Tổng 2 cạnh của tam giác phải lớn hơn cạnh còn lại");
        }
    }
}
