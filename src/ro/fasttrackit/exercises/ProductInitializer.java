package ro.fasttrackit.exercises;

public class ProductInitializer {

    public static void main(String[] args) {

        Product product1 = new Product("Cast wireless", 159.99, 3, "casti");
        Product product2 = new Product("Cast fir", 55.99, 0, "casti");
        Product product3 = new Product("Mouse wireless", 100.00, 10, "mouse");

        System.out.println(product1.getCategory());
        System.out.println(product1.getName());
        System.out.println(product1.getQuantity());
        System.out.println(product1.hasStock());
        System.out.println(product1.getPrice());
        System.out.println(product1.isCategory("CASTI"));
    }
}
