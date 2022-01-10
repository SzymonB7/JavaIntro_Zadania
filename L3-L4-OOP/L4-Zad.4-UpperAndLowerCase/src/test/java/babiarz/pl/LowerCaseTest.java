package babiarz.pl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseTest {
    @Test
    void shouldReturnTextInLowerCase() {
        //given
        LowerCase test = new LowerCase();
        //when
        //then
        Assertions.assertEquals("test test test test", test.formatText("TEST tESt TEst Test"));
    }

}