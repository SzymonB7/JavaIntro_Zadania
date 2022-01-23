package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TrainingEffectivenessTest {
    TrainingEffectiveness trainingEffectiveness;
    TrainingLength trainingLength;
    CaloriesBurned caloriesBurned;
    AveragePulseRate averagePulseRate;

    @BeforeEach
    void setup() {
        trainingLength = Mockito.mock(TrainingLength.class);
        caloriesBurned = Mockito.mock(CaloriesBurned.class);
        averagePulseRate = Mockito.mock(AveragePulseRate.class);
        trainingEffectiveness = new TrainingEffectiveness(trainingLength,caloriesBurned,averagePulseRate);
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTrainingEffectivenessCalculation")
    void shouldCalculateTrainingEffectiveness(int min, int kcal, int bpm, double expected) {
        //given
        //when
        when(trainingLength.getTrainingLengthEvaluation(50)).thenReturn(2.0);
        when(trainingLength.getTrainingLengthEvaluation(65)).thenReturn(3.0);
        when(trainingLength.getTrainingLengthEvaluation(90)).thenReturn(3.0);
        when(caloriesBurned.getCaloriesBurnedEvaluation(370)).thenReturn(2.0);
        when(caloriesBurned.getCaloriesBurnedEvaluation(500)).thenReturn(3.0);
        when(caloriesBurned.getCaloriesBurnedEvaluation(400)).thenReturn(3.0);
        when(averagePulseRate.getAveragePulseEvaluation(180)).thenReturn(1.0);
        when(averagePulseRate.getAveragePulseEvaluation(150)).thenReturn(3.0);
        when(averagePulseRate.getAveragePulseEvaluation(175)).thenReturn(2.0);
        double effectivenessEvaluation = trainingEffectiveness.calculateTrainingEffectiveness(min, kcal, bpm);
        //then
        Assertions.assertEquals(expected, effectivenessEvaluation);
    }

    private static Stream<Arguments> provideArgumentsForTrainingEffectivenessCalculation() {
        return Stream.of(
                Arguments.of(50, 370, 180, 1.5),
                Arguments.of(65, 500, 150, 3.0),
                Arguments.of(90, 400, 175, 2.5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIllegalArgumentException")
    void shouldThrowIllegalArgumentException(int min, int kcal, int bpm) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> trainingEffectiveness.calculateTrainingEffectiveness(min, kcal, bpm));
    }

    private static Stream<Arguments> provideArgumentsForIllegalArgumentException() {
        return Stream.of(
                Arguments.of(0, 350, 185),
                Arguments.of(50, -10, 180),
                Arguments.of(65, 500, -2)
        );
    }
}