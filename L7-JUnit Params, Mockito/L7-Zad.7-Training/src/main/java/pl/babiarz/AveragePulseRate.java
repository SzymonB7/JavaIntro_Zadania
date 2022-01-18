package pl.babiarz;

public class AveragePulseRate {
    public double getAveragePulseEvaluation(int bpm) {
        if (bpm < 160) {
            return 3;
        } else if (bpm <= 175) {
            return 2;
        } else {
            return 1;
        }
    }
}
