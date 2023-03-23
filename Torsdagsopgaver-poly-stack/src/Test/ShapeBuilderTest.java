package Test;

import Task4.Circle;
import Task4.Shape;
import Task4.ShapeBuilder;
import Task4.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {

    ShapeBuilder build;


    @BeforeEach
    void setUp() {
        Circle c1 = new Circle(10);
        Square s1 = new Square(20);
        build = new ShapeBuilder();
        build.addShape(c1);
        build.addShape(s1);
    }

    @Test
    void addShape() {

    }

    @Test
    void getTotalArea() {
        assertEquals(4, build.getTotalArea(build.shapes));
    }
}