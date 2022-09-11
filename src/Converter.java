public class Converter {
    double rateKm = 0.00075;
    double rateCal = 0.05;
    public double convertKm(int sumStepsMonth) {
            double stepsKm=sumStepsMonth*rateKm;
            return stepsKm;
            }
    public double convertCal(int sumStepsMonth) {
            double stepsCal=sumStepsMonth*rateCal;
            return  stepsCal;
            }
}