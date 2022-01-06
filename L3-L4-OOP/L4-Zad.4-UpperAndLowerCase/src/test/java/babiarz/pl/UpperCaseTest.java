package babiarz.pl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {
    @Test
    void shouldReturnTextInUpperCase() {
        //given
        UpperCase test = new UpperCase();
        //when
        //then
        Assertions.assertEquals("TEST TEST TEST TEST", test.formatText("Test test TEst tEst"));
 }
}