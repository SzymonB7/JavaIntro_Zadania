package pl.babiarz;

public class TrainingEffectiveness {
    private final TrainingLengthEvaluation trainingLengthEvaluation;
    private final CaloriesBurnedEvaluation caloriesBurnedEvaluation;
    private final AveragePulseRateEvaluation averagePulseRateEvaluation;

    public TrainingEffectiveness(TrainingLengthEvaluation trainingLengthEvaluation, CaloriesBurnedEvaluation caloriesBurnedEvaluation, AveragePulseRateEvaluation averagePulseRateEvaluation) {
        this.trainingLengthEvaluation = trainingLengthEvaluation;
        this.caloriesBurnedEvaluation = caloriesBurnedEvaluation;
        this.averagePulseRateEvaluation = averagePulseRateEvaluation;
    }

    public double calculateTrainingEffectiveness(int min, int kcal, int bpm){
        if (min <= 0 || kcal <= 0 || bpm <=0) {
            throw new IllegalArgumentException("Arguments must be higher then 0");
        }
       double trainingLengthEvaluation = this.trainingLengthEvaluation.getTrainingLengthEvaluation(min);
       double caloriesBurnedEvaluation = this.caloriesBurnedEvaluation.getCaloriesBurnedEvaluation(kcal);
       double averagePulseRateEvaluation = this.averagePulseRateEvaluation.getAveragePulseEvaluation(bpm);

        return (trainingLengthEvaluation + 2 * caloriesBurnedEvaluation + 3 * averagePulseRateEvaluation) / (1 + 2 + 3);
    }

}
