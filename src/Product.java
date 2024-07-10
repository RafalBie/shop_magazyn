

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private BigDecimal price;
    private Status status;
//    private int quantity = 3;

    public Product(String name, BigDecimal price, Status status) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.status = status;
    }
    //    public void decreaseQuantity() {
//        this.quantity = this.quantity - 1;
//        // this.quantity--;
//    }
//
//    public void increaseQuantity() {
//        this.quantity = this.quantity + 1;
//        // this.quantity++;
//    }
    public boolean isAvailable() {
        return this.status == Status.IS_AVAILABLE;
    }

    public UUID getId() {
        return id;
    }

//    public int getQuantity() {
//        return quantity;
//    }

    //    public Order(User user) {
//        this.user = user;
//        this.products = new ArrayList<>();
//    }
//    public void addProduct(Product product) {
//        int quantity = product.getQuantity();
//        if (quantity == 0) {
//            throw new IllegalArgumentException("Cannot add product");
//        }
//        this.products.add(product);
//        product.decreaseQuantity();
//    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}