package lektion6;

import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {

    public static ArrayList<String> interval = new ArrayList<>();
    public static ArrayList<String> obs = new ArrayList<>();
    public static boolean on = true;
    public static void init() {
        interval.add("1 - 10");
        interval.add("11 - 20");
        interval.add("21 - 30");
        interval.add("31 - 40");
        interval.add("41 - 50");
        interval.add("51 - 60");
        interval.add("61 - 70");
        interval.add("71 - 80");
        interval.add("81 - 90");
        interval.add("91 - 100");

        for (int s = 0; s < 10; s++) {
            obs.add(s," ");
        }
    }






    public static void main(String[] args) {

        init();

        Scanner in = new Scanner(System.in);
        int t;

        while (on = true) {
            t = in.nextInt();
            if (t > 0 && t < 11) obs.set(0, obs.get(0) + "*");
            else if (t > 10 && t < 21) obs.set(1, obs.get(1) +"*");
            else if (t > 20 && t < 31) obs.set(2, obs.get(2) +"*");
            else if (t > 30 && t < 41) obs.set(3, obs.get(3) +"*");
            else if (t > 40 && t < 51) obs.set(4, obs.get(4) +"*");
            else if (t > 50 && t < 61) obs.set(5, obs.get(5) +"*");
            else if (t > 60 && t < 71) obs.set(6, obs.get(6) +"*");
            else if (t > 70 && t < 81) obs.set(7, obs.get(7) +"*");
            else if (t > 80 && t < 91) obs.set(8, obs.get(8) +"*");
            else if (t > 90 && t < 101) obs.set(9, obs.get(9) +"*");
            else on = false;
        }

        for (int i = 0; i < interval.size(); i++) {
            System.out.println(interval.get(i) + " |" + obs.get(i));
        }

    }
}
