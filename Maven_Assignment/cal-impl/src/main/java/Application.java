import java.util.Scanner;

public final class Application {
    private Application() {

    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        Calculator cal = new Calculator();
        Calculator.multiplication(input1, input2);
        Calculator.division(input1, input2);
        Calculator.addition(input1, input2);
        Calculator.substraction(input1, input2);

    }
}
