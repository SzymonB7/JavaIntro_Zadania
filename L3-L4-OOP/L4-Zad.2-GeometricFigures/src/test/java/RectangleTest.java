import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.babiarz.Rectangle;

class RectangleTest {
    @Test
    void shouldGetRectangleArea(){
        //given
        Rectangle rectangle = new Rectangle(2,4);
        rectangle.getArea();
        //when
        double getArea = rectangle.getArea();
        //then
        Assertions.assertEquals(8, getArea);
    }
    @Test
    void shouldGetRectanglePerimeter(){
        //given
        Rectangle rectangle = new Rectangle(5,7);
        rectangle.getPerimeter();
        //when
        double getPerimeter = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(24, getPerimeter);
    }

}