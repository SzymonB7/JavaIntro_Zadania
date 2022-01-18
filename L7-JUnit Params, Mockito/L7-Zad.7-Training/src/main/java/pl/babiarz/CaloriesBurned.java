package pl.babiarz;

public class CaloriesBurned {
    public double getCaloriesBurnedEvaluation(int kcal){
        if (kcal <= 300) {
            return 1;
        } else if (kcal < 400) {
            return 2;
        } else {
            return 3;
        }
    }
}
