package Lektion3;

public class Test {
    public static void main(String[] args) {
        final int STOP=10;
        int i = 1;
        do {
            System.out.println("i har nu værdien " + i);
            ++i;
        }
        while (i<STOP);
    }
}
