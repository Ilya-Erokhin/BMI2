public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(75,1.78,2);

        long result1 = Math.round(result);
        System.out.println((result1));

    }
}
