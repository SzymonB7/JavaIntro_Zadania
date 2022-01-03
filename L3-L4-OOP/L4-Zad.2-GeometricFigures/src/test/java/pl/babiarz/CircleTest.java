package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void shouldGetCircleArea(){
        //given
        Circle circle = new Circle(4);
        circle.getArea();
        //when
        double getArea = circle.getArea();
        //then
        Assertions.assertEquals(50.24, getArea);
    }
    @Test
    void shouldGetCircleAPerimeter(){
        //given
        Circle circle = new Circle(3);
        circle.getPerimeter();
        //when
        double getPerimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(18.84, getPerimeter);
    }

}