import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap  b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem:");
            System.out.println("x1 = " + equation.getRoot1());
            System.out.println("x2 = " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep:");
            System.out.println("x = " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}

