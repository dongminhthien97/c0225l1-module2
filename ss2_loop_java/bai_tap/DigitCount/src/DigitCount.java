import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int numbers = input.nextInt();
        int count = 0;
        int N = 2;

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.println("Prime number: " + N);
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        if (n<2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0) {
            return false;}
        }
        return true;
    }
}
