package pl.babiarz;

public class Circle implements AreaAndPerimeter {

    private double r;
    private static final double pi = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return pi * r *r;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * r;
    }
}
