package Test;

import Task4.Circle;
import Task4.Square;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square s;


    @BeforeEach
    void setUp() {
        s = new Square(4);
        s.getArea();
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        assertEquals(36, s.getArea());
    }
}