package bai_tap_CRUD;

public class ProductManagement {
    private Product[] products;
    private int size;


    public ProductManagement(int capacity) {
        products = new Product[capacity];
        size = 0;
    }

    //AddProduct
    public void add(Product product) {
        if (size >= products.length) {
            System.out.println("Product list is full");
            return;
        }
            products[size++] = product;
    }
    //FindProduct
    public Product findProductbyID(int id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getid() == id) {
                System.out.println(products[i]);
            }
        }
        return null;
    }
    //UpdateProduct
    public boolean updateProduct(int id, String newName, double newPrice) {
        Product product = findProductbyID(id);
        for (int i = 0; i < size; i++) {
            if (product != null) {
                product.setName(newName);
                product.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    //DeleteProduct
    public boolean deleteProductbyID(int id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getid() == id) {
                for (int j = i; j < size - 1; j++) {
                    products[j] = products[j + 1];
                }
                    products[--size] = null;
                    return true;
            }
        }
        return false;
    }

    //DisplayProduct
    public void displayProducts() {
        if (size == 0) {
            System.out.println("Product list is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }
}
