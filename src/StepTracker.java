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
        arrStep[month][day - 1] += steps;
    }
    public boolean countStepsMonth(int month) {
        for (int j = 0; j < arrStep[month].length; j++) {
            System.out.print((j + 1) + " день: " + arrStep[month][j] + ", ");
        }
        return true;
    }
    public int statsSumStepMonth(int month) {
        int sumStepsMonth = 0;
        for (int j = 0; j < arrStep[month].length; j++) {
            sumStepsMonth += arrStep[month][j];
        }
        return sumStepsMonth;
    }
    public int statsMaxStepsMonth(int month) {
        int maxStepsMonth = 0;
        for (int j = 0; j < arrStep[month].length; j++) {
            if (arrStep[month][j] > maxStepsMonth) {
                maxStepsMonth = arrStep[month][j];
            }
        }
        return maxStepsMonth;
    }
    public int statsAvgStepsMonth(int month) {
        return statsSumStepMonth(month) / arrStep[month].length;
    }
    public int statsBestStepsMonth(int month) {
        int countA = 0;
        int countMax = 0;
        for (int j = 0; j < arrStep[month].length; j++) {
            if (arrStep[month][j] >= targetStep) {
                countA += 1;
                if (countA > countMax) {
                    countMax = countA;
                }
            } else { countA = 0; }
        }
        return countMax;
    }
    public boolean printArrStep() {
        for (int i = 0; i < arrStep.length; i++) {
            for (int j = 0; j < arrStep[i].length; j++) {
                System.out.print("(" + arrStep[i][j] + ") ");
            }
            System.out.println(" строка день (i), столбец месяц (j)");
        }
        return true;
    }
}














