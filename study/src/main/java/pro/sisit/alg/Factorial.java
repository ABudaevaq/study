package pro.sisit.alg;

public class Factorial {
    static int factorial(int n) {
        return (n != 0) ? n * factorial(n - 1) : 1;
    }

    static int factorialFor(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

}
