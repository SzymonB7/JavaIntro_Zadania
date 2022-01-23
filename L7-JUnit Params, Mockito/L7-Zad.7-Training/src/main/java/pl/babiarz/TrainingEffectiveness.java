package pl.babiarz;

public class TrainingEffectiveness {
    private final TrainingLength trainingLength;
    private final CaloriesBurned caloriesBurned;
    private final AveragePulseRate averagePulseRate;

    public TrainingEffectiveness(TrainingLength trainingLength, CaloriesBurned caloriesBurned, AveragePulseRate averagePulseRate) {
        this.trainingLength = trainingLength;
        this.caloriesBurned = caloriesBurned;
        this.averagePulseRate = averagePulseRate;
    }

    public double calculateTrainingEffectiveness(int min, int kcal, int bpm){
        if (min <= 0 || kcal <= 0 || bpm <=0) {
            throw new IllegalArgumentException("Arguments must be higher then 0");
        }
       double trainingLengthEvaluation = trainingLength.getTrainingLengthEvaluation(min);
       double caloriesBurnedEvaluation = caloriesBurned.getCaloriesBurnedEvaluation(kcal);
       double averagePulseRateEvaluation = averagePulseRate.getAveragePulseEvaluation(bpm);

        return (trainingLengthEvaluation + 2 * caloriesBurnedEvaluation + 3 * averagePulseRateEvaluation) / (1 + 2 + 3);
    }

}
