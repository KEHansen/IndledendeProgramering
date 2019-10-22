package Lektion2;

import java.util.Scanner;

public class Dist {
    public static void main (String[] Args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double x = input.nextDouble();
        double y = input.nextDouble();

        double dist = Math.abs(a*x-y+b)/Math.sqrt(1 + Math.pow(a, 2));

        System.out.println(dist);

    }
}