package Lektion3;

import java.util.Scanner;

public class TegnLæser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        char c;
        while (true) {
            s = in.nextLine();
            if (s.equals("exit"))
                break;
            c = s.charAt(0);
            if (47 < (int)c && (int)c < 58)
                System.out.println("Tegnet er et tal");
            else if (64 < (int)c && (int)c < 91)
                System.out.println("Tegnet er et stort bogstav");
            else if (96 < (int)c && (int)c < 123)
                System.out.println("Tegnet er et lille bogstav");
            else if ((int)c == 33 || (int)c == 35 || (int)c == 43 || (int)c == 92)
                System.out.println("Tegnet er et af de 4 specialtegn");
            else
                System.out.println("Tegnet er ikke kendt af dette program");
        }

    }
}
