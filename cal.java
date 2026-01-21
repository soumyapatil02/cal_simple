import java.util.Scanner;

public class cal {

    // ✅ THIS METHOD IS REQUIRED FOR UNIT TESTS
    public static double calculate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Java Calculator ===");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result = calculate(a, b, op);
        System.out.println("Result: " + result);

        sc.close();
    }
}
