package s12_ArrayList_LinkedList.LinkedList;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private ArrayList<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ProductManagement() {
        productList.add(new Product(1,"laptop",1000));
        productList.add(new Product(2,"Iphone",1400));
        productList.add(new Product(3,"Desktop",1300));
    }

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

    public void searchByName(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        List<Product> result = SearchProduct(name);
        if(result.isEmpty()){
            System.out.println("Product list is empty");
        }else{
            for (Product product : result){
                System.out.println(product);
            }
        }
    }

    public List<Product> SearchProduct(String name){
        List<Product> result = new ArrayList<>();
        for (Product product : productList){
            if(product.getName().toLowerCase().contains(name.toLowerCase())){
                result.add(product);
            }
        }
        return result;
    }

    public void sortProductByPriceAscending(){
        productList.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Choose options-----" + "\n" +
                "1. Create"+ "\n"
                + "2. Display" + "\n"
                + "3. Update" + "\n"
                + "4. Delete" + "\n"
                + "5. Search"+ "\n"
                + "6.SortByPrice" + "\n"
                + "7. Exit");
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
                    searchByName();
                    break;
                case 6:
                    sortProductByPriceAscending();
                    System.out.println(productList);
                    System.out.println("Product sorted successfully");
                    break;
                case 7:
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
