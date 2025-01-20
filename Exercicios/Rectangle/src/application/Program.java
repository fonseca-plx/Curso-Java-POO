package application;

import entities.Rectangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        double area = rectangle.area();
        System.out.printf("AREA = %.2f%n", area);
        double perimeter = rectangle.perimeter();
        System.out.printf("PERIMETER = %.2f%n", perimeter);
        double diagonal = rectangle.diagonal();
        System.out.printf("DIAGONAL = %.2f", diagonal);
        sc.close();
    }
}
