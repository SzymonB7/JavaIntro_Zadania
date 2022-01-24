package pl.babiarz;

public class DefaultAveragePulseRateEvaluation implements AveragePulseRateEvaluation{
    @Override
    public double getAveragePulseEvaluation(int bpm) {
        if (bpm == 0) {
            throw new IllegalArgumentException("Argument must be higher then 0");
        } else if (bpm < 160) {
            return 3;
        } else if (bpm <= 175) {
            return 2;
        } else {
            return 1;
        }
    }
}
