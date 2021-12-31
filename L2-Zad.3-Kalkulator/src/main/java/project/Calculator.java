package project;

public class Calculator {
    public static long sum(int a, int b){
        return (long)a + (long)b;
    }
    public static long subtract(int a, int b){
        return (long)a - (long)b;
    }
    public static long multiply(int a, int b){
        return (long)a * (long)b;
    }
    public static double divide(int a, int b) {
        if (a == 0 || b == 0){
            return 0;
        } else {
            return (double) a / (double) b;
        }
    }
}
