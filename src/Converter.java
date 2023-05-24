public class Converter {
    double rateKm = 0.00075;
    double rateCal = 0.05;
    public double convertKm(int sumStepsMonth) {
        return sumStepsMonth*rateKm;
            }
    public double convertCal(int sumStepsMonth) {
        return sumStepsMonth*rateCal;
            }
}