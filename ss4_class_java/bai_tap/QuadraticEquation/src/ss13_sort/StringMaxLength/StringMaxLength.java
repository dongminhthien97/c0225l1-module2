package ss13_sort.StringMaxLength;

import java.util.LinkedList;
import java.util.Scanner;

public class StringMaxLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string  : ");
        String string = scanner.nextLine();

        LinkedList<Character> maxLength = new LinkedList<>();
        LinkedList<Character> temp = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            if(temp.size() > 1 && string.charAt(i) <= temp.getLast() && temp.contains(string.charAt(i))) {
                temp.clear();
            }

            temp.add(string.charAt(i));

            if(temp.size()>maxLength.size()) {
                maxLength.clear();
                maxLength.addAll(temp);
            }
        }
        for (Character c : maxLength) {
            System.out.print(c);
        }
        System.out.println();
    }
}
