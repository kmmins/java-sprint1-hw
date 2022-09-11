public class StepTracker {
    public int[][] arrStep;
    int targetStep = 10000;
    public StepTracker() {
        arrStep = new int[12][30];
    }
    public void statsNewTargetStep(int newTargetStep) {
        targetStep = newTargetStep;
    }
    public void addSteps(int month, int day, int steps) {
        arrStep[month - 1][day - 1] += steps;
    }
    public boolean countStepsMonth(int month) {
        for (int j = 0; j < arrStep[month - 1].length; j++) {
            System.out.print((j + 1) + " день: " + arrStep[month - 1][j] + ", ");
        }
        return true;
    }
    public int statsSumStepMonth(int month) {
        int sumStepsMonth = 0;
        for (int j = 0; j < arrStep[month - 1].length; j++) {
            sumStepsMonth += arrStep[month - 1][j];
        }
        return sumStepsMonth;
    }
    public int statsMaxStepsMonth(int month) {
        int maxStepsMonth = 0;
        for (int j = 0; j < arrStep[month - 1].length; j++) {
            if (arrStep[month - 1][j] > maxStepsMonth) {
                maxStepsMonth = arrStep[month - 1][j];
            }
        }
        return maxStepsMonth;
    }
    public int statsAvgStepsMonth(int month) {
        return statsSumStepMonth(month) / arrStep[month - 1].length;
    }
    public int statsBestStepsMonth(int month) {
        int countA = 0;
        int countMax = 0;
        for (int j = 0; j < arrStep[month - 1].length; j++) {
            if (arrStep[month - 1][j] >= targetStep) {
                countA += 1;
                if (countA > countMax) {
                    countMax = countA;
                }
            } else { countA = 0; }
        }
        return countMax;
    }
}














