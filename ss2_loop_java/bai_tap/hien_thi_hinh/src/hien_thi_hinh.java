import java.util.Scanner;

public class hien_thi_hinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                for (int i = 0; i < 3; i++) {
                    System.out.println(" ");
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 2:
                System.out.println("Print the square triangle");
                for (int i = 1; i < 7; i++) {
                    System.out.println(" ");
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                int k = 0;
                for (int i = 1; i <= 7; ++i, k = 0) {
                    for (int j = 1; j <= 7 - i; ++j) {
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}

