package ss13_sort.MaxString;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) > string.charAt(j)) {
                    temp.add(string.charAt(j));
                }
            }
            if (temp.size() > max.size()) {
                max.clear();
                max.addAll(temp);
            }
            temp.clear();
        }
        for(char c : max) {
            System.out.print(c);
        }
        System.out.println();
    }
}
