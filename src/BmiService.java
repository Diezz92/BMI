public class BmiService {
    public double calculate (double mass) {
        double high = 170;
        double x = high / 100 * 2;
        double result = mass / x;
        return result;
    }
}
