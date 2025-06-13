package s12_ArrayList_LinkedList.LinkedList;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagement {
    private LinkedList<Product> productList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct(){
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());
        productList.add(new Product(id, name, price));
        System.out.println("Product added successfully");
    }

    public void displayProduct(){
        if(productList.isEmpty()){
            System.out.println("Product list is empty");
        }else{
            for (Product product : productList){
                System.out.println(product);
            }
        }
    }

    public void updateProduct(){
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Product product : productList){
            if(product.getid() == id){
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());

                product.setName(name);
                product.setPrice(price);
                System.out.println("Product updated successfully");
                break;
            }
        }
    }

    public void deleteProduct(){
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : productList){
            if(product.getid() == id){
                productList.remove(product);
                System.out.println("Product deleted successfully");
                break;
            }
        }
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Choose options-----" + "\n" +
                "1. Create"+ "\n"
                + "2. Display" + "\n"
                + "3. Update" + "\n"
                + "4. Delete" + "\n"
                + "5. Exit");
        boolean flag = true;
        while(flag){
            int choices = Integer.parseInt(scanner.nextLine());
            switch (choices) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Goodbye!!");
                    flag = false;
                    break;
                    default:
                        System.out.println("Invalid choice");
                        break;

            }
        }
    }
}
