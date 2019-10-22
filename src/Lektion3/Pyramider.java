package Lektion3;

import java.util.Scanner;

public class Pyramider {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int t = 1; t <= n; t++) {
            System.out.println("Pyramid " + t);
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < t - i - 1; j++) {
                    System.out.print(".");
                }
                for (int k = 0; k <= i - 1; k++) {
                    System.out.print("#");
                }
                System.out.print("#");
                for (int k = 0; k <= i - 1; k++) {
                    System.out.print("#");
                }
                for (int j = 0; j < t - i - 1; j++) {
                    System.out.print(".");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
}
