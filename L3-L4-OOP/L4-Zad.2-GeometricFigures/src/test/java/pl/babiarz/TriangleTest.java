package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void shouldGetTriangleArea(){
        //given
        Triangle triangle = new Triangle(4,5);
        triangle.getArea();
        //when
        double getArea = triangle.getArea();
        //then
        Assertions.assertEquals(10, getArea);
    }
    @Test
    void shouldGetTrianglePerimeter(){
        //given
        Triangle triangle = new Triangle(4, 5, 3);
        triangle.getPerimeter();
        //when
        double getPerimeter = triangle.getPerimeter();
        //then
        Assertions.assertEquals(12, getPerimeter);
    }

}