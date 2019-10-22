package lektion6;

import lektion7.Solution;

public class Test {
    public static void main(String[] args) {
        int[] arr = Solution.getCountdown(3);
        int[] arr2 = Solution.getCountdown(3);
        int[] arr3 = Solution.concatArray(arr, arr2);


        Solution.printArray(arr3);
    }
}
