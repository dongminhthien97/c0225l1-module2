import java.util.Scanner;

public class ColumSum {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.2, 4.5, 3.1},
                {2.3, 5.6, 7.8},
                {9.0, 1.1, 2.2}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap index so cot: ");
        int columIndex = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (columIndex < matrix[i].length) {
                sum += matrix[i][columIndex];
            } else {
                System.out.println("Khong tim thay index: " + i);
            }
        }

        System.out.println("Tong cac so tai " + columIndex + " la " + sum);
    }
}
