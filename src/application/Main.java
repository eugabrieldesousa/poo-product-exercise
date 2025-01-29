package application;

import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Quantity in Stock: ");
        product.quantity = sc.nextInt();
        sc.nextLine();

        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.printf("Updated data: %s, $%.2f, %d units, Total: R$%.2f \n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.println("Enter the number of products to be removed from stock: " );
        product.removeProducts(sc.nextInt());

        System.out.printf("Updated data: %s, $%.2f, %d units, Total: R$%.2f \n", product.name, product.price, product.quantity, product.totalValueInStock());

        sc.close();

    }
}
