package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf1.parse(sc.next());
        sc.nextLine();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine().toUpperCase());

        Order order = new Order(orderStatus, new Client(name, email, birthDate));
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data:%n", i+1);
            System.out.print("Product name: ");
            name = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qtd = sc.nextInt();
            sc.nextLine();
            order.addItem(new OrderItem(qtd, price, new Product(name, price)));
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println("Order moment: " + sdf2.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient());
        System.out.println("Order items:");

        for (OrderItem item : order.getItens()) {
            System.out.println(item);
        }

        System.out.printf("Total price: $%.2f%n", order.total());
        sc.close();
    }
}
