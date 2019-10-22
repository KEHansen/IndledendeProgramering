package Lektion3;

import java.util.Scanner;

public class Password2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String Password = in.nextLine();
            if (Password.length() < 5)
                System.out.println("Password for kort");
            else if (Password.length() > 8)
                System.out.println("Password for langt");
            else {
                System.out.println("Password tilpas");
                break;
            }
        }
    }
}

