

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        boolean youWantContinue = true;
        Scanner scanner = new Scanner(System.in);

        while (youWantContinue) {
            System.out.println("Czy chcesz dodać produkt? ");
            boolean continueResponse = scanner.nextBoolean();

            if (continueResponse == false) {
//                youWantContinue = false;
//                continue;
                break;
            }

            System.out.println("Podaj nazwe produktu:");
            String productName = scanner.next();
            System.out.println("Podaj cene: ");
            BigDecimal price = scanner.nextBigDecimal();
            System.out.println("Czy jest od razu dostępny? ");
            boolean isAvailable = scanner.nextBoolean();
            Status status;
            if (isAvailable) {
                status = Status.IS_AVAILABLE;
            } else {
                status = Status.NOT_AVAILABLE;
            }
            Product product = new Product(productName, price, status);

            System.out.println(product);
        }

    }
}