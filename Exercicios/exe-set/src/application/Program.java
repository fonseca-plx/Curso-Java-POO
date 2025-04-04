package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        addUser(n, sc, a);

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        addUser(n, sc, b);

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        addUser(n, sc, c);

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b); // união dos elementos de a e b
        total.addAll(c); // união dos elementos de total (a e b) e c

        System.out.println("Total students: " + total.size());

        sc.close();
    }

    public static void addUser(int n, Scanner sc, Set<Integer> course) {
        for (int i = 0; i < n; i++) {
            int userCode = sc.nextInt();
            course.add(userCode);
        }
    }
}
