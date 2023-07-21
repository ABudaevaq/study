package pro.sisit.alg;

public class Fibonacci {

    static public int getValueReq(int n) {
        return (n <= 0) ? 0 : (n < 2) ? n : getValueReq(n - 1) + getValueReq(n - 2);
    }

    static int getValueFor(int n) {
        if (n < 2) {
            return n;
        }

        int prev = 1;
        int current = 1;

        for (int i = 2; i < n; i++) {
            int next = prev + current;
            current = prev;
            prev = next;
        }
        return prev;
    }

}
