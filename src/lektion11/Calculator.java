package lektion11;

public class Calculator {
    public Calculator() {
    }

    public int sum(int x, int y) {
        return x + y;
    }

    public int factorial(int x) {
        if (x != 0) {
            int y = x;
            for (int i = x - 1; i > 1; i--) {
                y = y * i;
            }
            return y;
        } else {
            return 1;
        }
    }
}
