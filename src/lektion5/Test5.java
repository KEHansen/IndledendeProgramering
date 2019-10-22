package lektion5;

import metods.Point;

public class Test5 {
    public static void main(String[] args) {


        Point P = new Point(2, 2);
        Point Q = new Point(2, 2);

        printPoints(P, Q);

        P.move(2, -5);
        Q.move(0, 3);

        printPoints(P, Q);

    }

    private static void printPoints(Point p, Point q) {
        System.out.println("Point 1's position is " + p);
        System.out.println("Point 2's position is " + q);
//        System.out.println("Point 1 == Point 2: " + (p == q)); // virker ikke
        System.out.println("Point 1.equals(Point 2): " + (p.equals(q)));
        System.out.println();
    }



}
