package ss19_regular_regex.PhoneNumberValidation;

import java.util.Scanner;

public class PhoneNumberInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phoneNumber;

        while(true) {
            System.out.print("Enter phone number: ");
            phoneNumber = sc.nextLine();

            if(PhoneNumberValidation.validate(phoneNumber)){
                System.out.println(phoneNumber + " is valid");
                break;
            }else{
                System.out.println(phoneNumber + " is not valid");
            }
        }
    }
}
