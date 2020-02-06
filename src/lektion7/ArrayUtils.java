package lektion7;

import java.security.PublicKey;

public class ArrayUtils {

    public static String arrayToString(int[] arr) {
        String s = "{";
        for (int i = 0; i < arr.length - 1; i++) {
            s = s + arr[i] + " ";
        }
        return s + arr[arr.length-1] + "}";
    }

    public static int occurences(int[] arr, int t) {
        int occu = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                occu++;
            }
        }
        return occu;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

}
