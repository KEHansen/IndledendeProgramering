package Lektion4;

public class Test {
    public static void main(String[] args) {
        int i = 2;
        while (true) {
            if (163*7%i==0 && 448*21%i==0 && 7860*14%i==0 && 29200*35%i==0) {
                System.out.println(i);
                break;
            }
            if (i>163/2) {
                System.out.println("ingen mulige");
                break;
            }
            i++;
        }
    }
}
