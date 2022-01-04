package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void shouldGetTriangleArea(){
        //given
        Triangle triangle = new Triangle(4,5);
        //when
        double area = triangle.getArea();
        //then
        Assertions.assertEquals(10, area);
    }
    @Test
    void shouldGetTrianglePerimeter(){
        //given
        Triangle triangle = new Triangle(4, 5, 3);
        //when
        double perimeter = triangle.getPerimeter();
        //then
        Assertions.assertEquals(12, perimeter);
    }

}