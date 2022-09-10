public class Converter {
    double rateKm; // 0.00075
    double rateCal; // 0.05
        Converter(double converterRateKm, double converterRateCal) {
        rateKm = converterRateKm;
        rateCal = converterRateCal;
        }
    public double convertKm(int sumStepsMonth) {
            double stepsKm=sumStepsMonth*rateKm;
            return stepsKm;
            }
    public double convertCal(int sumStepsMonth) {
            double stepsCal=sumStepsMonth*rateCal;
            return  stepsCal;
            }
}