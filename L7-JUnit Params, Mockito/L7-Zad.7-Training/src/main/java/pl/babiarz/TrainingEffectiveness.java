package pl.babiarz;

public class TrainingEffectiveness {

    TrainingLength trainingLength = new TrainingLength();
    CaloriesBurned caloriesBurned = new CaloriesBurned();
    AveragePulseRate averagePulseRate = new AveragePulseRate();

    public double calculateTrainingEffectiveness(int min, int kcal, int bpm){
       double trainingLengthEvaluation = trainingLength.getTrainingLengthEvaluation(min);
       double caloriesBurnedEvaluation = caloriesBurned.getCaloriesBurnedEvaluation(kcal);
       double averagePulseRateEvaluation = averagePulseRate.getAveragePulseEvaluation(bpm);

        return (trainingLengthEvaluation + 2 * caloriesBurnedEvaluation + 3 * averagePulseRateEvaluation) / (1 + 2 + 3);
    }

}
