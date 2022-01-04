package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void shouldGetCircleArea(){
        //given
        Circle circle = new Circle(4);
        //when
        double area = circle.getArea();
        //then
        Assertions.assertEquals(50.24, area);
    }
    @Test
    void shouldGetCircleAPerimeter(){
        //given
        Circle circle = new Circle(3);
        //when
        double perimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(18.84, perimeter);
    }

}