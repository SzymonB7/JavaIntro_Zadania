package pl.babiarz;

public class Circle implements AreaAndPerimeter {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r *r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
