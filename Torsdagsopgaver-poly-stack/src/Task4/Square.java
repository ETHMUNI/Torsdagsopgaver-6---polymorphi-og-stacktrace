package Task4;

import static java.lang.Math.PI;

public class Square implements Shape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
