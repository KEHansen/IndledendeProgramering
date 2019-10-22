package Lektion2;

import java.util.Scanner;

public class AndenGradsligning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = Math.pow(b, 2) - 4*a*c;
        if (a != 0 && b != 0) {
            if (d < 0) {
                System.out.println("Ingen rødder");
            } else if (d > 0) {
                double x1 = ((-b) + Math.sqrt(d)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(d)) / (2 * a);
                System.out.println(x1 + " " + x2);
            } else {
                double x = (-b) / (2 * a);
                System.out.println(x);
            }
        } else if (b != 0) {
            double x = -(c/b);
            System.out.println(x);
        } else {
            System.out.println("Ingen rødder");
        }

    }
}
