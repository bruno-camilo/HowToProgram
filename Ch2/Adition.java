import java.util.Scanner;
public class Adition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first integer: ");
		number1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		number2 = sc.nextInt();
		
		sum = number1 + number2;		
		System.out.printf("Sum is %d%n", sum);

		sc.close();
	}
}