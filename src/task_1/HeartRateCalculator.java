package task_1;

import utils.FileReader;

import java.util.Arrays;

public class HeartRateCalculator {
    private static final int MAX_HEART_RATE = 220;
    private static FileReader fileReader = new FileReader();
    private static final int  AGE = Integer.parseInt(fileReader.getPropValues("properties/properties_task1.properties", "AGE"));

    private int calculateMaxHearRate() {
        return MAX_HEART_RATE - AGE;
    }

    private double[] hearRateCalculation(int MAX_HEART_RATE, double maxPercent, double minPercent) {
        double maxRate = (Math.round(MAX_HEART_RATE * maxPercent));
        double minRate = (Math.round(MAX_HEART_RATE * minPercent));

        return new double[]{maxRate, minRate};
    }

    public void hearRateResult() {
        System.out.println("VO2 max zone - 90-100%(maximum load) " + Arrays.toString(hearRateCalculation(calculateMaxHearRate(), 1.0, 0.9)));
        System.out.println("Anaerobic zone - 80-90%(strength training) "+ Arrays.toString(hearRateCalculation(calculateMaxHearRate(), 0.9, 0.8)));
        System.out.println("Aerobic zone - 70-80%(running, bicycle) " + Arrays.toString(hearRateCalculation(calculateMaxHearRate(), 0.8, 0.7)));
        System.out.println("Fat burning zone - 60-70%(fitness,roller-skates) " + Arrays.toString(hearRateCalculation(calculateMaxHearRate(), 0.7, 0.6)));
        System.out.println("Light activity zone - 50-60%(warm-up) " + Arrays.toString(hearRateCalculation(calculateMaxHearRate(), 0.6, 0.5)));
    }
}
