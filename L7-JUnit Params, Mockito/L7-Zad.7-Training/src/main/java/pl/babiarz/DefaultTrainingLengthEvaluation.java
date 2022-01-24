package pl.babiarz;

public class DefaultTrainingLengthEvaluation implements TrainingLengthEvaluation{
    @Override
    public double getTrainingLengthEvaluation(int min) {
        if (min == 0){
            throw new IllegalArgumentException("Argument must be higher then 0");
        } else if (min < 30){
            return 1;
        } else if (min <=60){
            return 2;
        } else {
            return 3;
        }
    }
}
