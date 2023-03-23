package Test;

import Task4.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c;
    @BeforeEach
    void setUp() {
        c = new Circle(6);
        c.getArea();
    }

    @Test
    void getArea() {
        assertEquals(8, c.getArea());
    }
}