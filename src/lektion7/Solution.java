package lektion7;

public class Solution {

    public static void printArray(int[] ia) {
        for (int element : ia)
            System.out.println(element);
    }

    public static void printBackwards1D(int[] ia) {
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

    public static void printArray2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printBackwards(int[][] arr) {
        for (int i = arr.length - 1; i >= 0 ; i--) {
            for (int j = arr[0].length - 1; j >= 0 ; j--) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void firstElement(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]);
        }
    }

    public static int[][] create2DArray(int x, int y) {
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
            }
        }
        return arr;
    }

    public static int[][] createRaggedArray(int[] arr) {
        int[][] rag = new int[arr.length][];
        for (int i = 0; i < rag.length; i++) {
            rag[i] = new int[arr[i]];
        }
        return rag;
    }

}