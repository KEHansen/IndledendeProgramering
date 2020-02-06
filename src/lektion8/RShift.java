package lektion8;

import java.util.Scanner;

public class RShift {

    public static void main(String[] args) {
        int[] ints = parseInput();
        //TODO Fill in logic
        int[] rShift = rShift(ints);

        //TODO Print the result to console
        System.out.print(rShift[0]);
        for (int i = 1; i < rShift.length; i++) {
            System.out.print(" " + rShift[i]);
        }

    }

    private static int[] parseInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strings = input.split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0;i<ints.length;i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        scan.close();
        return ints;
    }

    private static int[] rShift(int[] arr) {
        int[] result = new int[arr.length-1];
        int n = arr[arr.length-1];
        if (n >= 0) {
            for (int i = 0; i < result.length; i++) {
                n = n % result.length;
                result[n] = arr[i];
                n++;
            }
        } else {
            while (n <= 0) {
                n += result.length;
            }
            for (int i = 0; i < result.length; i++) {
                n = Math.abs(n % result.length);
                result[n] = arr[i];
                n++;
            }
        }
        return result;
    }

}
