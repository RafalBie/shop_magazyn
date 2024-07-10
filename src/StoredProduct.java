

public class StoredProduct {
    private Product product;
    private int quantity;

    public StoredProduct(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StoredProduct{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}