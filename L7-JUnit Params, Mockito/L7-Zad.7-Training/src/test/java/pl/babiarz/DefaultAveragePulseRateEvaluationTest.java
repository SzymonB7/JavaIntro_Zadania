package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DefaultAveragePulseRateEvaluationTest {

    private DefaultAveragePulseRateEvaluation defaultAveragePulseRateEvaluation;

    @BeforeEach
    void setup() {
        defaultAveragePulseRateEvaluation = new DefaultAveragePulseRateEvaluation();
    }

    @ParameterizedTest
    @CsvSource(value = {"120 : 3","175 : 2","180 : 1"}, delimiter = ':')
    void shouldEvaluateAveragePulseRate(int bpm, double expected){
        //given
        //when
        double averagePulseEvaluation = defaultAveragePulseRateEvaluation.getAveragePulseEvaluation(bpm);
        //then
        Assertions.assertEquals(expected, averagePulseEvaluation);
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        int bpm = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> defaultAveragePulseRateEvaluation.getAveragePulseEvaluation(bpm));
    }
}