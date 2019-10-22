package lektion7;

public class Solution {

    public static void printArray(int[] ia) {
        for (int element : ia)
            System.out.println(element);
    }

    public static void printBackwards(int[] ia) {
        for (int i = ia.length - 1; i >= 0; i-- )
            System.out.println(ia[i]);
    }

    public static void toTwos(int[] ia) {
        for (int i = 0; i < ia.length; i++) {
            ia[i] = 2;
        }
    }

    public static void printLastElement(int[] ia) {
        System.out.println(ia[ia.length-1]);
    }

    public static void findIndex(String[] sa, String s) {
        for (int i = 0; i < sa.length; i++) {
            if (sa[i].equals(s))
                System.out.println(i);
        }

    }

    public static int[] getCountdown(int t) {
        int[] ia = new int[t];
        int s = ia.length;
        for (int i = 0; i < ia.length; i++) {
            ia[i] = s--;
        }
        return ia;
    }

    public static int[] concatArray(int[] ia1, int[] ia2) {
        int[] ia = new int[ia1.length + ia2.length];
        for (int i = 0; i < ia.length; i++) {
            if (i < ia1.length) ia[i] = ia1[i];
            else ia[i] = ia2[i-ia1.length];
        }
        return ia;
    }


}