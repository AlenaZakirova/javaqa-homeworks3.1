public class BmiService {
    public int calculate(double weight, double height) {
        double bmi;
        bmi =  weight /  ( height * height);
        return (int) bmi;
    }
}
