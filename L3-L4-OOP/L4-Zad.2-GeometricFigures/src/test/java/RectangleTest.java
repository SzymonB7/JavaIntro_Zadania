import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.babiarz.Rectangle;

class RectangleTest {
    @Test
    void shouldGetRectangleArea(){
        //given
        Rectangle rectangle = new Rectangle(2,4);
        //when
        double area = rectangle.getArea();
        //then
        Assertions.assertEquals(8, area);
    }
    @Test
    void shouldGetRectanglePerimeter(){
        //given
        Rectangle rectangle = new Rectangle(5,7);
        //when
        double perimeter = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(24, perimeter);
    }

}