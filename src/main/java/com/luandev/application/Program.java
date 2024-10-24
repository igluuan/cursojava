package com.luandev.application;


import com.luandev.entities.Client;
import com.luandev.entities.Order;
import com.luandev.entities.OrderItem;
import com.luandev.entities.Product;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String   birthDateString = sc.nextLine();
        Client client = new Client(name, email, birthDateString);
        System.out.println("\nClient data:");
        System.out.println("Name: " + client.getName());
        System.out.println("Email: " + client.getEmail());
        System.out.println("Birth date: " + client.getBirthDate());

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order?");
        int n = sc.nextInt();
        for (int i= 0; i < n; i++){
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price:");
            double productPrice = sc.nextDouble();
            System.out.print("Product quantity:");
            int productQuantity = sc.nextInt();

        }
        sc.close();
    }

}