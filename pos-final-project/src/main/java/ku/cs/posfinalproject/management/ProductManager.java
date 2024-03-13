package ku.cs.posfinalproject.management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductManager {
    private final List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product.isValid()) {
            products.add(product);
        }
        else {
            System.out.println("Invalid information!");
        }
    }

    public void removeProduct(int productId) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId() == productId) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    public void updateProduct(Product updatedProduct) {
        for (Product product : products) {
            if (product.getProductId() == updatedProduct.getProductId()) {
                if (updatedProduct.isValid()) {
                    product.setProductName(updatedProduct.getProductName());
                    product.setPrice(updatedProduct.getPrice());
                    product.setQuantity(updatedProduct.getQuantity());
                }
                else {
                    System.out.println("Invalid information!");
                }
                return;
            }
        }
        System.out.println("Product with ID \" + updatedProduct.getProductId() + ");
    }

    public Product getProduct(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        System.out.println("Product with ID \" + productId + \" not found.");
        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }




}
