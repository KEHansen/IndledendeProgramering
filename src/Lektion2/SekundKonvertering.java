package Lektion2;

import java.util.Scanner;

public class SekundKonvertering {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sek = in.nextInt();
        int Min = sek / 60;
        int Sek = sek % 60;
        int Timer = Min / 60;
        Min = Min % 60;
        int Dage = Timer / 24;
        Timer = Timer % 24;
        int Years = Dage / 365;
        Dage = Dage % 365;

        System.out.println(sek + " seconds equals " + Years + " Years, " + Dage + " days, " + Timer + " hours, " + Min + " minutes and " + Sek + " seconds.");

    }
}
