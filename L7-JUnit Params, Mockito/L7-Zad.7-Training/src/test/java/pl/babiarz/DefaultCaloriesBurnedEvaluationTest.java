package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DefaultCaloriesBurnedEvaluationTest {
    private DefaultCaloriesBurnedEvaluation defaultCaloriesBurnedEvaluation;

    @BeforeEach
    void setup(){
        defaultCaloriesBurnedEvaluation = new DefaultCaloriesBurnedEvaluation();
    }


    @ParameterizedTest
    @CsvSource(value = {"150 : 1","330 : 2","800 : 3"}, delimiter = ':')
    void shouldEvaluateCaloriesBurned(int kcal, double expected){
        //given
        //when
        double caloriesBurnedEvaluation = defaultCaloriesBurnedEvaluation.getCaloriesBurnedEvaluation(kcal);
        //then
        Assertions.assertEquals(expected, caloriesBurnedEvaluation );
    }
    @Test
    void shouldThrowIllegalArgumentException() {
        int kcal = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> defaultCaloriesBurnedEvaluation.getCaloriesBurnedEvaluation(kcal));
    }

}