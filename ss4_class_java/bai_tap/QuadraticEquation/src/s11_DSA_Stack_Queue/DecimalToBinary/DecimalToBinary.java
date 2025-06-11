package s11_DSA_Stack_Queue.DecimalToBinary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int decimal = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal = decimal / 2;
        }

        System.out.println("Binary number: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
