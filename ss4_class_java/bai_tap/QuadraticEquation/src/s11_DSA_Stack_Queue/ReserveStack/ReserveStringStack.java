package s11_DSA_Stack_Queue.ReserveStack;

import java.util.Stack;

public class ReserveStringStack {
    public static void main(String[] args) {
        String input = ("Hello Codegym");
        String[] strings = input.split(" ");
        Stack<String> stack = new Stack<>();

        for (String words : strings) {
            stack.push(words);
        }
        String reserve = "";
        while (!stack.isEmpty()) {
            reserve += stack.pop();
            if (!stack.isEmpty()) {
                reserve += " ";
            }
        }

        System.out.println(reserve);
    }
}
