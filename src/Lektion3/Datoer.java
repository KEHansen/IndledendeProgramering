package Lektion3;

import java.util.Scanner;

public class Datoer {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Indtast år:");
        int yr = in.nextInt();
        System.out.println("Indtast måned:");
        int mo = in.nextInt();
        System.out.println("Indtast dag:");
        int day = in.nextInt();
        int daysinmonth = 31;
        if (0 < mo && mo < 13) {
            switch (mo) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    break;
                case 2:
                    if (yr % 4 == 0 && yr % 100 != 0)
                        daysinmonth = 29;
                    else
                        daysinmonth = 28;
                    if (yr % 400 == 0)
                        daysinmonth = 29;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysinmonth = 30;
                    break;

            }
            int day2 = day;
            int mo2 = mo;
            int yr2 = yr;
            if (0 < day && day <= daysinmonth) {
                day2 = day2 + 1;
                if (day2 > daysinmonth) {
                    day2 = day2 - daysinmonth;
                    mo2 = ++mo2;
                    if (mo2 > 12) {
                        mo2 = 1;
                        yr2 = ++yr2;
                    }
                }
                System.out.println("Dagen efter " + day + "/" + mo + " " + yr + " er " + day2 + "/" + mo2 + " " + yr2);
            } else
                System.out.println("Ugyldig dato");
        } else
            System.out.println("Ugyldig dato");
    }
}
