package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DefaultTrainingLengthEvaluationTest {
    private DefaultTrainingLengthEvaluation defaultTrainingLengthEvaluation;

    @BeforeEach
    void setup(){
        defaultTrainingLengthEvaluation = new DefaultTrainingLengthEvaluation();
    }

    @ParameterizedTest
    @CsvSource(value = {"20 : 1","60 : 2","70 : 3"}, delimiter = ':')
    void shouldEvaluateTrainingLength(int min, double expected){
        //given
        //when
        double trainingLengthEvaluation = defaultTrainingLengthEvaluation.getTrainingLengthEvaluation(min);
        //then
        Assertions.assertEquals(expected, trainingLengthEvaluation);
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        int min = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> defaultTrainingLengthEvaluation.getTrainingLengthEvaluation(min));
    }
}