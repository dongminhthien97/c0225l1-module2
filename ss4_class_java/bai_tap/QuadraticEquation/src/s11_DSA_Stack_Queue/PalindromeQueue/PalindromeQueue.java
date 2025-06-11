package s11_DSA_Stack_Queue.PalindromeQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(char c : str.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
