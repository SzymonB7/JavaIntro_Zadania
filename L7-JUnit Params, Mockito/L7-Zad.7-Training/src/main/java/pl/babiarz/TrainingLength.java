package pl.babiarz;

public class TrainingLength {
    public double getTrainingLengthEvaluation(int minutes){
        if (minutes < 30){
            return 1;
        } else if (minutes <=60){
            return 2;
        } else {
            return 3;
        }
    }
}
