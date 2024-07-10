

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        Product product = new Product("abcdt", BigDecimal.ONE, Status.IS_AVAILABLE);
        Product product2 = new Product("bca", BigDecimal.TEN, Status.IS_AVAILABLE);
//
//        List<StoredProduct> storedProducts = new ArrayList<>();
//        StoredProduct storedProduct = new StoredProduct(product, 100);
//        storedProducts.add(storedProduct);

//        Magazine magazine = new Magazine(storedProducts);
        Magazine magazine = new Magazine();
        System.out.println(magazine.getProducts()); // 0

        magazine.addStoredProduct(new StoredProduct(product, 10));
        magazine.addStoredProduct(new StoredProduct(product2, 3));
        System.out.println(magazine.getProducts()); // quantity = 10

        magazine.updateQuantity(product.getId(), 5);
        System.out.println("Po aktualizacji");
        System.out.println(magazine.getProducts()); // quantity = 15

//        magazine.addStoredProduct(new StoredProduct(product, 10));

//        System.out.println(magazine.getProducts()); // 1







//        List<StoredProduct> products = magazine.getProducts();
//        System.out.println(products);

    }
}