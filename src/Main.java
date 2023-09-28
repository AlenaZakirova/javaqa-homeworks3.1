public class Main {

    public static  void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        int bmi = service.calculate(weight, height);
        System.out.println("BMI для веса " + weight +"кг");
        System.out.println("и роста " + height + "м");
        System.out.println("эквивалентно " + bmi + ".");
    }
}
