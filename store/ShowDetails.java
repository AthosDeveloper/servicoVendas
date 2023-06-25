package store;

import java.util.Scanner;

public class ShowDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the product date:");
        System.out.println(" Name: ");
        String name = sc.next();
        Product p = new Product();
        p.setName(name);
        System.out.println("quantity: ");
        int quantity = sc.nextInt();

        p.setQuantity(quantity);
        System.out.println("price: ");
        double price = sc.nextDouble();
        p.setPrice(price);
        System.out.println(p);
        System.out.println("Enter the quantity of products to be added: ");

        p.addProduct(quantity);
        System.out.println(p);
        System.out.println("enter the quantity of products to be removed: ");
        p.removeProduct(quantity);
        System.out.println(p);
sc.close();
    }
}
