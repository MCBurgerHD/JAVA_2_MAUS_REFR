package Rekursion;

/**
 * Created: 15.02.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Rekursion {

    public static double kehrwert(int n) {
        double sum = 0;

        for (double i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += 1 / (i * 2 - 1);
            } else {
                sum -= 1 / (i * 2 - 1);
            }
        }

        return sum;
    }

    public static double rekrusivKehrwet(int n) {
        if (n == 1) {
            return 1;
        } else {
            double d = n;

            if (n % 2 != 0) {
                return (rekrusivKehrwet(n - 1) + 1 / (d * 2 - 1));
            } else {
                return (rekrusivKehrwet(n - 1) - 1 / (d * 2 - 1));
            }
        }
    }

    public static int fibonacciRekrusiv(int n) {
        if (n < 1) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciRekrusiv(n - 2) + fibonacciRekrusiv(n - 1);
    }

    public static int fibonacci(int n) {
        int zahl1 = 1;
        int zahl2 = 1;
        int fib = 1;

        for (int i = 0; i < n - 2; i++) {
            zahl1 = zahl2;
            zahl2 = fib;
            fib = zahl1 + zahl2;
        }
        return fib;
    }

    public static int ggTRekrusiv(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return ggT(y, x % y);
        }
    }

    public static int ggT(int x, int y) {

        if (x == 0)
            return y;
        while (y != 0) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }

        return x;
    }

    public static int pas(int n, int k) {
        if (n == 0 || n == 1 || k == 0 || k == n) {
            return 1;
        } else {
            return pas(n - 1, k) + pas(n - 1, k - 1);
        }
    }

    public static int printPas(int n) {
        //int[][] pas = new int[n][n];
        int laenge = n;

        for (int x = 0; x <= n; x++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i <= laenge; i++) {
                stringBuilder.append(" ");
            }

            for (int y = 0; y <= x; y++) {
                stringBuilder.append(pas(x, y) + " ");
            }

            System.out.println(stringBuilder);
            laenge--;
        }

        return laenge;
    }

    public static void main(String[] args) {
        System.out.println("Kehrwert : " + kehrwert(2));
        System.out.println("Kehrwert rekrusiv : " + rekrusivKehrwet(2));
        System.out.println("Fibonacci : " + fibonacci(8));
        System.out.println("Fibonacci rekrusiv : " + fibonacciRekrusiv(8));
        System.out.println("ggT : " + ggT(21, 56));
        System.out.println("ggT rekrusiv : " + ggTRekrusiv(21, 56));
        System.out.println("Pascal’sche Dreieck : " + pas(5, 4));
        printPas(5);
    }
}
