package diskretMat;

public class DiskretMat {
    // recursive implementation
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static int gcdExtended(int a, int b, int x, int y)
    {
        // Base Case
        if (a == 0)
        {
            x = 0;
            y = 1;
            return b;
        }

        int x1=1, y1=1; // To store results of recursive call
        int gcd = gcdExtended(b%a, a, x1, y1);

        // Update x and y using results of recursive
        // call
        x = y1 - (b/a) * x1;
        y = x1;

        return gcd;
    }



    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int d  = gcd(p, q);
        int d2 = gcd2(p, q);
        //System.out.println("gcd(" + p + ", " + q + ") = " + d);
        //System.out.println("gcd(" + p + ", " + q + ") = " + d2);

        int x=1, y=1;
        int a = 169, b = 143;
        int g = gcdExtended(a, b, x, y);
        System.out.print("gcd(" + a +  " , " + b+ ") = " + g);
    }
}
