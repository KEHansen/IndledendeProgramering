package lektion8;

import lektion8.Person;

public class Test8 {
    public static void main(String[] args) {
        int temp;
        int[] arr = {3,1,8,4,2};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
