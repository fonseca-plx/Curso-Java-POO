import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println();
        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        int num = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (num == mat[i][j]) {
                    System.out.printf("%nPosition: %d,%d%n", i, j);
                    if (i == 0 && j == 0) {
                        System.out.println("Right: " + mat[i][j+1]);
                        System.out.println("Down: " + mat[i+1][j]);
                    } else if (i == (mat.length-1) && j == (mat[i].length-1)) {
                        System.out.println("Left: " + mat[i][j-1]);
                        System.out.println("Up: " + mat[i-1][j]);
                    } else if (i == 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                        System.out.println("Right: " + mat[i][j+1]);
                        System.out.println("Down: " + mat[i+1][j]);
                    } else if (i == (mat.length-1)) {
                        System.out.println("Left: " + mat[i][j-1]);
                        System.out.println("Right: " + mat[i][j+1]);
                        System.out.println("Up: " + mat[i-1][j]);
                    } else if (j == 0) {
                        System.out.println("Right: " + mat[i][j+1]);
                        System.out.println("Up: " + mat[i-1][j]);
                        System.out.println("Down: " + mat[i+1][j]);
                    } else if (j == (mat[i].length-1)) {
                        System.out.println("Left: " + mat[i][j-1]);
                        System.out.println("Up: " + mat[i-1][j]);
                        System.out.println("Down: " + mat[i+1][j]);
                    } else {
                        System.out.println("Left: " + mat[i][j-1]);
                        System.out.println("Right: " + mat[i][j+1]);
                        System.out.println("Up: " + mat[i-1][j]);
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
