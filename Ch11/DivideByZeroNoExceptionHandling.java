
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling{
    public static int quotient(int numerator, int denominator) throws ArithmeticException{
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                System.out.println("Please enter an integer numerator: ");
                int numerator = sc.nextInt();
                System.out.println("Please enter an integer denominator: ");
                int denominator = sc.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

                continueLoop = false;
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                sc.nextLine(); // descarta entrada para o usuário tentar de novo
                System.out.printf("You must enter integers. Please try again.%n%n");
            }

        }while(continueLoop);
    }
}
