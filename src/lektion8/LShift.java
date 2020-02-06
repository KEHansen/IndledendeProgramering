package lektion8;

import java.util.Scanner;

public class LShift {

    public static void main(String[] args) {
        int[] ints = parseInput();
        //TODO Fill in logic
        int[] lShift = LShift(ints);

        //TODO Print the result to console
        System.out.print(lShift[0]);
        for (int i = 1; i < lShift.length; i++) {
            System.out.print(" " + lShift[i]);
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

    private static int[] LShift(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            result[i] = arr[i+1];
        }
        result[arr.length-1] = arr[0];
        return result;
    }

}
