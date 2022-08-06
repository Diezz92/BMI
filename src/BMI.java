public class BMI {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 77;
        double result = service.calculate(mass);
        System.out.println(result);

    }
}
