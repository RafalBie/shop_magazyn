

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Magazine {
    private List<StoredProduct> storedProducts;

    public Magazine(List<StoredProduct> products) {
        this.storedProducts = products;
    }

    public Magazine() {
        storedProducts = new ArrayList<>();
    }

    public List<StoredProduct> getProducts() {
        return storedProducts;
    }

    public void addStoredProduct(StoredProduct storedProduct) {
        Product product = storedProduct.getProduct();
        UUID id = product.getId();
        for (int i = 0; i < storedProducts.size(); i++) {
            StoredProduct storedProductToCheck = storedProducts.get(i);
            Product p = storedProductToCheck.getProduct();
            UUID idToCheck = p.getId();
            if (id.equals(idToCheck)) {
                throw new RuntimeException("Duplicate product found");
            }
        }
        storedProducts.add(storedProduct);
    }

    public void updateQuantity(UUID productId, int newQuantity) {
        for (StoredProduct storedProduct : storedProducts) {
            Product product = storedProduct.getProduct();
            if (product.getId().equals(productId)) {
                int quantity = storedProduct.getQuantity();
                quantity = quantity + newQuantity;
                storedProduct.setQuantity(quantity);
                return;
            }
        }
    }

}