public class SafeDivideSystems {
    public static void main(String[] args) {
        int a = 20;
        // int b = 4;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }
    }
}
