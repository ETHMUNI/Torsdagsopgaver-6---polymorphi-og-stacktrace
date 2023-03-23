package Task4;

import static java.lang.Math.PI;

public class Circle implements Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*(Math.pow(radius, 2));
    }
}
