package pl.babiarz;

public class Root {
    public static double root(double x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(x);
    }
}
