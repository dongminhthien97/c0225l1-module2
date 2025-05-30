package bai_tap_CRUD;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
    Display();
    }
    public static void Display(){
        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("-----Choose options-----" +
                    "1. Create"
                    + "2. Read"
                    + "3. Update"
                    + "4. Delete");
            int option = Integer.parseInt(sc.nextLine());
            switch(option){
                case CREATE:
                    System.out.println("Enter product ID: ");
                    String id = sc.nextLine();
                    System.out.println("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter product price: ");
                    double price = Double.parseDouble(sc.nextLine());
                    break;
                case READ:
                    System.out.println("Enter product ID: ");
                    break;
                case UPDATE:
                    System.out.println("Enter product ID: ");
                    break;
                case DELETE:
                    System.out.println("Enter product ID: ");
                    break;
            }
        }
    }
}
