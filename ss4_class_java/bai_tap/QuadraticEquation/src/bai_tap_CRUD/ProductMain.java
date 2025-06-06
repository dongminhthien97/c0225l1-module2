package bai_tap_CRUD;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        final int CREATE = 1;
        final int DISPLAY = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int EXIT = 5;

        ProductManagement manager = new ProductManagement(10);
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("-----Choose options-----" + "\n" +
                    "1. Create"+ "\n"
                    + "2. READ" + "\n"
                    + "3. Update" + "\n"
                    + "4. Delete" + "\n"
                    + "5. Exit");
            int option = Integer.parseInt(sc.nextLine());
            switch(option){
                case CREATE:
                    System.out.println("Enter product ID: ");
                    int Id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter product price: ");
                    double price = Double.parseDouble(sc.nextLine());
                    manager.add(new Product(Id, name, price));
                    break;
                case DISPLAY:
                    System.out.println("Display all products: ");
                    manager.displayProducts();
                    break;
                case UPDATE:
                    System.out.println("Enter product ID to update: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    System.out.println("enter product new name: ");
                    String newName = sc.nextLine();
                    System.out.println("Enter product new price: ");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    boolean flag1 = manager.updateProduct(updateId, newName, newPrice);
                    if(flag1){
                        System.out.println("Product updated successfully");
                    }else {
                        System.out.println("Product not updated");
                    }
                    break;
                case DELETE:
                    System.out.println("Enter product ID to delete: ");
                    int deleteID = Integer.parseInt(sc.nextLine());
                    if(manager.deleteProductbyID(deleteID)){
                        System.out.println("Product deleted");
                    }else{
                        System.out.println("Product not deleted");
                    }
                    break;
                case EXIT:
                    System.out.println("Goodbye!");
                    flag = false;
                    break;
                    default:
                        System.out.println("Invalid option");
            }
        }
    }
}

