package ss19_regular_regex.ClassNameValidation;

import java.util.Scanner;

public class ClassNameInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className;

        while(true){
            System.out.print("Enter class name: ");
            className = scanner.nextLine().trim();
            if(ClassNameValidation.validate(className)){
                System.out.println(className + " is valid");
                break;
            }else{
                System.out.println(className + " is not valid");
            }
        }
    }
}
