package pl.babiarz;

public class DefaultCaloriesBurnedEvaluation implements CaloriesBurnedEvaluation{
    @Override
    public double getCaloriesBurnedEvaluation(int kcal) {
        if (kcal == 0){
            throw new IllegalArgumentException("Argument must be higher then 0");
        }
        else if (kcal <= 300) {
            return 1;
        } else if (kcal < 400) {
            return 2;
        } else {
            return 3;
        }
    }
}
