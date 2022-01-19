package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TrainingEffectivenessTest {
    TrainingEffectiveness trainingEffectiveness;
    TrainingLength trainingLength;
    CaloriesBurned caloriesBurned;
    AveragePulseRate averagePulseRate;

    @BeforeEach
    void setup() {
        trainingEffectiveness = new TrainingEffectiveness();
        trainingLength = new TrainingLength();
        caloriesBurned = new CaloriesBurned();
        averagePulseRate = new AveragePulseRate();
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTrainingEffectivenessCalculation")
    void shouldCalculateTrainingEffectiveness(int min, int kcal, int bpm, double expected) {
        //given
        //when
        double effectivenessEvaluation = trainingEffectiveness.calculateTrainingEffectiveness(min, kcal, bpm);
        //then
        Assertions.assertEquals(expected, effectivenessEvaluation);
    }

    private static Stream<Arguments> provideArgumentsForTrainingEffectivenessCalculation() {
        return Stream.of(
                Arguments.of(15, 350, 185, 1.3333333333333333),
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