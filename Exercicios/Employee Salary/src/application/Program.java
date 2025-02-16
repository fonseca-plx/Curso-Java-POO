package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double salary, percent;
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        id = sc.nextInt();
        Integer position = position(employees, id);
        if (position == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            percent = sc.nextDouble();
            employees.get(position).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee x : employees) {
            System.out.println(x);
        }

        sc.close();
    }

    // Função position verifica se há na lista um id correspondente ao id digitado; caso haja o id, retorna a posição, caso não haja, retorna nulo
    public static Integer position(List<Employee> employees, int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
