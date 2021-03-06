package lektion6;

public class Badevand {
    public static void main(String[] args) {

        int[] badetemp = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            badetemp[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Maksimum: " + maks(badetemp));
        System.out.println("Antal fald: " + antalfald(badetemp));
    }

    public static int maks(int[] badetemp) {
        int max = 0;
        for (int i : badetemp) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int antalfald(int[] badetemp) {
        int antalFald = 0;
        for (int i = 1; i < badetemp.length; i++) {
            if (badetemp[i] < badetemp[i - 1]) {
                antalFald++;
            }

        }
        return antalFald;
    }
}
